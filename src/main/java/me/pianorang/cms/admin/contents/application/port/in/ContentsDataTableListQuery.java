package me.pianorang.cms.admin.contents.application.port.in;

import me.pianorang.cms.admin.common.DataTableInput;
import me.pianorang.cms.admin.common.DataTableOutput;

public interface ContentsDataTableListQuery {
    DataTableOutput getDataTableList(DataTableInput dataTableInput);
}
