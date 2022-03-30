package me.pianorang.cms.admin.home.adapter.in.web;

import me.pianorang.cms.admin.common.AdminBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@AdminBaseController
public class HomeController {
    @GetMapping(value = {"","/"})
    String index(){
        return "admin/home/index";
    }
}
