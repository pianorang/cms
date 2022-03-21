package me.pianorang.cms.admin.portfolio.adapter.in.web;

import me.pianorang.cms.admin.common.AdminController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioListController extends AdminController {
    @GetMapping("/portfolio")
    String list(){
        return "/admin/portfolio/portfolio_list";
    }
}
