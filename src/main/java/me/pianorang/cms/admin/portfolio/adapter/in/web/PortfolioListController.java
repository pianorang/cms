package me.pianorang.cms.admin.portfolio.adapter.in.web;

import me.pianorang.cms.admin.common.AdminBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@AdminBaseController
public class PortfolioListController {
    @GetMapping("/portfolio")
    String list(){
        return "/admin/portfolio/portfolio_list";
    }
}
