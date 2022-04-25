package me.pianorang.cms.admin.portfolio.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
class PortfolioRegisterController {
    @GetMapping("/sys/portfolio/register")
    String registerForm(Model model){
        model.addAttribute("portfolio");
        return "/admin/portfolio/portfolio_register";
    }

    @PostMapping("/sys/portfolio/register")
    String register( @RequestParam("uploadFile") MultipartFile[] files){




        return "";

    }
}
