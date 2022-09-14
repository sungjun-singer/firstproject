package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String nicetoMeetYou(Model model){
        model.addAttribute("username", "홍팍");
        return "greetings"; // templates/greetings.mustache --> 브라우저로 전송.
    }

    @GetMapping("/bye")
    public String seeyouNext(Model model){
        model.addAttribute("nickname","홍길동");
        return "GoodBye";
    }

    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("test", "김성준");
        return "test";
    }
}
