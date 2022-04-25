package me.pianorang.cms.member.adapter.in.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
class LoginController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/auth/login")
    String login(){
        log.info("!!pwd: {}", passwordEncoder.encode("wjstjdgks"));
        return "member/login";
    }
}
