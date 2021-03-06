package me.pianorang.cms.admin.portfolio.adapter.out.persistence;

import me.pianorang.cms.admin.portfolio.domain.Portfolio;
import org.springframework.stereotype.Component;

@Component
class PortfolioMapper {
    Portfolio mapToDomainEntity(PortfolioJpaEntity portfolio){
        return new Portfolio(
                portfolio.getId(), portfolio.getTitle(),
                portfolio.getContent(), portfolio.getThumbnailPath(),
                portfolio.getFilePath(), portfolio.getDescription(),
                portfolio.getCreatedOn(), portfolio.getCreatedBy(),
                portfolio.getModifiedOn(), portfolio.getModifiedBy()
        );
    }
}
