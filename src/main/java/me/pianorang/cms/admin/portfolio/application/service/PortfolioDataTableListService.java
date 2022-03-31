package me.pianorang.cms.admin.portfolio.application.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.pianorang.cms.admin.common.DataTableInput;
import me.pianorang.cms.admin.common.DataTableOutput;
import me.pianorang.cms.admin.portfolio.application.port.in.PortfolioDataTableListQuery;
import me.pianorang.cms.admin.portfolio.application.port.out.LoadPortfolioListPort;
import me.pianorang.cms.admin.portfolio.domain.Portfolio;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
class PortfolioDataTableListService implements PortfolioDataTableListQuery {
    private final LoadPortfolioListPort loadPortfolioListPort;

    @Override
    public DataTableOutput getDataTableList(DataTableInput dataTableInput) {
        Page<Portfolio> portfolios = loadPortfolioListPort.loadPortfolioList(dataTableInput.getPageable());
        return new DataTableOutput(
                dataTableInput.getDraw(),
                portfolios.getTotalElements(),
                portfolios.getTotalElements(),
                portfolios.getContent()
        );
    }
}
