package me.pianorang.cms.admin.portfolio.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface PortfolioRepository extends JpaRepository<PortfolioJpaEntity, Long> {
}
