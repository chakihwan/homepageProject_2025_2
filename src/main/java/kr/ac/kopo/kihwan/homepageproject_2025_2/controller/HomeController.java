package kr.ac.kopo.kihwan.homepageproject_2025_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping("")
    public String home() {
        return "home"; // templates/home.html
    }

    @GetMapping("/intro")
    public String intro() {
        return "intro"; // templates/intro.html
    }

    @GetMapping("/growth-log")
    public String growthLog() {
        return "growth-log"; // templates/growth-log.html
    }

    @GetMapping("/photo-album")
    public String photoAlbum() {
        return "photo-album"; // templates/photo-album.html
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // templates/contact.html
    }
}