package me.pianorang.cms.admin.contents.application.service;

import lombok.RequiredArgsConstructor;
import me.pianorang.cms.admin.common.DataTableInput;
import me.pianorang.cms.admin.common.DataTableOutput;
import me.pianorang.cms.admin.contents.application.port.in.ContentsDataTableListQuery;
import me.pianorang.cms.admin.contents.application.port.out.LoadContentListPort;
import me.pianorang.cms.admin.contents.domain.Contents;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
class ContentsDataTableListService implements ContentsDataTableListQuery {
    private final LoadContentListPort loadContentListPort;
    @Override
    public DataTableOutput getDataTableList(DataTableInput dataTableInput) {
        Page<Contents> contents = loadContentListPort.loadContentListPort(dataTableInput.getPageable());

        return new DataTableOutput(
                dataTableInput.getDraw(),
                contents.getTotalElements(),
                contents.getTotalElements(),
                contents.getContent()
        );
    }
}
