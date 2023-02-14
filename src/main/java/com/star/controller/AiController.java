package com.star.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: myblog
 * @description: 辉哥
 * @author: wyh
 * @create: 2023-02-13 15:51
 **/
@Controller
public class AiController {

    @GetMapping("/ai")
    public String ai(Model model) {
        return "huigeAi";
    }

    @GetMapping("/pic")
    public String aiPic(Model model) {
        return "aiPic";
    }

}
