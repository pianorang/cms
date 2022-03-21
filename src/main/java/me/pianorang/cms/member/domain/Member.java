package me.pianorang.cms.member.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@AllArgsConstructor
public class Member {
    private Long id;

    private String userId;

    private String userPwd;

}
