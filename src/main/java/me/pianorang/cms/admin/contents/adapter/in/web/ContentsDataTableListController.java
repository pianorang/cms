package me.pianorang.cms.admin.contents.adapter.in.web;

import lombok.RequiredArgsConstructor;
import me.pianorang.cms.admin.common.DataTableInput;
import me.pianorang.cms.admin.common.DataTableOutput;
import me.pianorang.cms.admin.contents.application.port.in.ContentsDataTableListQuery;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
class ContentsDataTableListController {
    final private ContentsDataTableListQuery contentsDataTableListQuery;

    @GetMapping("/sys/api/contents")
    DataTableOutput getList(@RequestParam int page, @RequestParam int length, @RequestParam int draw){

        Pageable pageable = PageRequest.of(page, length, Sort.Direction.DESC, "id");
        DataTableInput dataTableInput = new DataTableInput(pageable, draw);

        return this.contentsDataTableListQuery.getDataTableList(dataTableInput);
    }
}
