package me.pianorang.cms.member.adapter.out.persistence;

import me.pianorang.cms.member.application.port.out.LoginMemberPort;
import me.pianorang.cms.member.domain.Member;
import org.springframework.stereotype.Component;

@Component
class MemberPersistenceAdapter implements LoginMemberPort {

    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    MemberPersistenceAdapter(MemberRepository memberRepository, MemberMapper memberMapper) {
        this.memberRepository = memberRepository;
        this.memberMapper = memberMapper;
    }


    @Override
    public Member login(String id) {
        return memberMapper.mapToDomainEntity( memberRepository.login(id) );
    }
}
