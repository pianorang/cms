package me.pianorang.cms.admin.contents.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class ContentsListController {
    @GetMapping("/sys/contents")
    String list(){
        return "/admin/contents/contents_list";
    }
}
