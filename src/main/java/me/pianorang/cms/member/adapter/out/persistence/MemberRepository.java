package me.pianorang.cms.member.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

interface MemberRepository extends JpaRepository<MemberJpaEntity, Long> {

    @Query("select m from MemberJpaEntity m " +
            "where m.userId = :id ")
    MemberJpaEntity login(String id);
}
