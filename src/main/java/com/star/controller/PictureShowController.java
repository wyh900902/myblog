package com.star.controller;

import com.star.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: 照片墙页面显示控制器
 * @Date: Created in 22:08 2020/6/27
 * @Author: HUIGE
 * @QQ群: 530311074
 * @URL: https://huige.work/
 */
@Controller
public class PictureShowController {

    @Autowired
    private PictureService pictureService;

    @GetMapping("/picture")
    public String friends(Model model) {
        model.addAttribute("pictures",pictureService.listPicture());
        return "picture";
    }

    @GetMapping("/fire")
    public String fire(Model model) {
        return "fire";
    }
    @GetMapping("/huige")
    public String fire2(Model model) {
        return "fire2";
    }


}