package me.pianorang.cms.member.adapter.out.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MEMBER")
public class MemberJpaEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String userId;

    private String userPwd;

}
