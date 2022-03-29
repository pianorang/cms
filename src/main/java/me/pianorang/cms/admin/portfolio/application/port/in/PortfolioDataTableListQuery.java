package me.pianorang.cms.admin.portfolio.application.port.in;

import me.pianorang.cms.admin.common.DataTableInput;
import me.pianorang.cms.admin.common.DataTableOutput;
import me.pianorang.cms.admin.portfolio.domain.Portfolio;
import org.springframework.data.domain.Page;

public interface PortfolioDataTableListQuery {
    DataTableOutput getDataTableList(DataTableInput dataTableInput);
}
