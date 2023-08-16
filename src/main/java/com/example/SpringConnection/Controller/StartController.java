package com.example.SpringConnection.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @GetMapping("/main")
    public String home(Model model) {

        return "ok";
    }
}
