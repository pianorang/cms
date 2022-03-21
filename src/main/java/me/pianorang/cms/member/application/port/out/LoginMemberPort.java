package me.pianorang.cms.member.application.port.out;

import me.pianorang.cms.member.domain.Member;

public interface LoginMemberPort {
    Member login(String id);
}
