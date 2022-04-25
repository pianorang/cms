package me.pianorang.cms.member.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class MemberListController {

    @GetMapping("/member/list")
    public String lists(){
        return "member/list";
    }
}
