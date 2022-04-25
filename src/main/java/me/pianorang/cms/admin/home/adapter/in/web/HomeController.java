package me.pianorang.cms.admin.home.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HomeController {
    @GetMapping(value = {"/sys","/sys/"})
    String index(){
        return "admin/home/index";
    }
}
