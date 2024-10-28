package org.example.demosecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class contentController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }
    @GetMapping("/admin/home")
    public String adminHome() {
        return "home_admin";
    }
    @GetMapping("/user/home")
    public String userHome() {
        return "home_user";
    }
}