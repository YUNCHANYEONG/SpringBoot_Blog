package com.bootproject.bootproject.controller;

import com.bootProject.bootProject.core.model.ImsIndex;
import com.bootProject.bootProject.core.service.IndexService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class AdminIndexController {

    private IndexService indexService;

    @GetMapping("/")
    public String list(Model model){
        ImsIndex imsIndex = indexService.read(Long.parseLong("1"));
        model.addAttribute("imsIndex", imsIndex);
        return "index.html";
    }
}
