package com.example.backpackerxl.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author by：Backpackersxl
 * Date: 2021/4/23/023
 * Time: 18:50
 **/
@Controller
public class IndexControl {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
