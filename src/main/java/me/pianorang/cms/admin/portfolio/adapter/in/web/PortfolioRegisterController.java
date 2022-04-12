package me.pianorang.cms.admin.portfolio.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioRegisterController {
    @GetMapping("/sys/portfolio/register")
    String registerForm(Model model){
        model.addAttribute("portfolio");
        return "/admin/portfolio/portfolio_register";
    }
}
