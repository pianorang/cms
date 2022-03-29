package me.pianorang.cms.admin.portfolio.application.port.out;

import me.pianorang.cms.admin.portfolio.domain.Portfolio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface LoadPortfolioListPort {
    Page<Portfolio> loadPortfolioList(Pageable pageable);
}
