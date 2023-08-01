package com.book.webservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/posts/save")
    public String index() {
        return "posts-save";
    }
}
