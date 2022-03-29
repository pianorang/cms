package me.pianorang.cms.admin.portfolio.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import me.pianorang.cms.admin.portfolio.application.port.out.LoadPortfolioListPort;
import me.pianorang.cms.admin.portfolio.domain.Portfolio;
import me.pianorang.cms.common.PersistenceAdapter;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@PersistenceAdapter
@RequiredArgsConstructor
class PortfolioPersistenceAdapter implements LoadPortfolioListPort {

    private final PortfolioRepository portfolioRepository;
    private final PortfolioMapper portfolioMapper;

    @Override
    public Page<Portfolio> loadPortfolioList(Pageable pageable) {
        Page<PortfolioJpaEntity> portfolios = portfolioRepository.findAll(pageable);
        return portfolios.map(p-> portfolioMapper.mapToDomainEntity(p));
    }
}
