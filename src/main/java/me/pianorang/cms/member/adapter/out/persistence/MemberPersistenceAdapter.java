package me.pianorang.cms.member.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import me.pianorang.cms.common.PersistenceAdapter;
import me.pianorang.cms.member.application.port.out.LoginMemberPort;
import me.pianorang.cms.member.domain.Member;
import org.springframework.stereotype.Component;

@PersistenceAdapter
@RequiredArgsConstructor
class MemberPersistenceAdapter implements LoginMemberPort {

    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    @Override
    public Member login(String id) {
        return memberMapper.mapToDomainEntity( memberRepository.login(id) );
    }
}
