package org.example.demosecurity.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private MyUserRepo repo;
    @Autowired
    private PasswordEncoder encoder;
    @PostMapping("/register/user")
    public MyUser registerUser(@RequestBody MyUser myUser) {
        myUser.setPassword(encoder.encode(myUser.getPassword()));
        return repo.save(myUser);
    }

}
