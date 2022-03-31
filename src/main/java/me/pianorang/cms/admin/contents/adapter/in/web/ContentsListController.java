package me.pianorang.cms.admin.contents.adapter.in.web;

import me.pianorang.cms.admin.common.AdminBaseController;
import org.springframework.web.bind.annotation.GetMapping;

@AdminBaseController
public class ContentsListController {
    @GetMapping("/contents")
    String list(){
        return "/admin/contents/contents_list";
    }
}
