package com.example.backpackerxl.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author by：Backpackersxl
 * Date: 2021/4/23/023
 * Time: 22:11
 **/
@Controller
@RequestMapping("/wroks")
public class WroksControl {
    @RequestMapping("/list")
    public String list() {
        return "works/list";
    }
}
