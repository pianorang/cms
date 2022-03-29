package me.pianorang.cms.admin.portfolio.adapter.in.web;

import lombok.RequiredArgsConstructor;
import me.pianorang.cms.admin.common.AdminBaseController;
import me.pianorang.cms.admin.common.DataTableInput;
import me.pianorang.cms.admin.common.DataTableOutput;
import me.pianorang.cms.admin.portfolio.application.port.in.PortfolioDataTableListQuery;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AdminBaseController
@RestController
@RequiredArgsConstructor
public class PortfolioDataTableListController {

    final private PortfolioDataTableListQuery portfolioDataTableListQuery;

    @GetMapping("/api/portfolio")
    DataTableOutput getList(@RequestParam int page, @RequestParam int length, @RequestParam int draw){

        Pageable pageable = PageRequest.of(page, length, Sort.Direction.DESC, "id");
        DataTableInput dataTableInput = new DataTableInput(pageable, draw);

        return this.portfolioDataTableListQuery.getDataTableList(dataTableInput);
    }


}
