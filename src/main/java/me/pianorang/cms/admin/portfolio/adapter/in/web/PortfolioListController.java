package me.pianorang.cms.admin.portfolio.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioListController {
    @GetMapping("/sys/portfolio")
    String list(){
        return "/admin/portfolio/portfolio_list";
    }
}
