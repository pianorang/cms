package me.pianorang.cms.admin.contents.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface ContentsRepository extends JpaRepository<ContentsJpaEntity, Long> {

}
