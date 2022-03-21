package me.pianorang.cms.admin.home.adapter.in.web;

import me.pianorang.cms.admin.common.AdminController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController extends AdminController {
    @GetMapping(value = {"","/"})
    String index(){
        return "admin/home/index";
    }
}
