package me.pianorang.cms.member.adapter.out.persistence;

import me.pianorang.cms.member.domain.Member;
import org.springframework.stereotype.Component;

@Component
public class MemberMapper {
    Member mapToDomainEntity(MemberJpaEntity member){
        return new Member(member.getId(), member.getUserId(), member.getUserPwd());
    }
}
