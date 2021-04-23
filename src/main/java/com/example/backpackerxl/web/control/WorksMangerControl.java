package com.example.backpackerxl.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author by：Backpackersxl
 * Date: 2021/4/23/023
 * Time: 22:20
 **/
@Controller
@RequestMapping("/worksmanger")
public class WorksMangerControl {
    @RequestMapping("/list")
    public String list() {
        return "worksmanger/list";
    }
}
