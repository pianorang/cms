package me.pianorang.cms.member.adapter.out.persistence;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="member")
@Data
class MemberJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;

    private String userPwd;

}
