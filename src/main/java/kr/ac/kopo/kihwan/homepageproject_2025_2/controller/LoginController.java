package kr.ac.kopo.kihwan.homepageproject_2025_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // templates/login.html을 렌더링
    }
}