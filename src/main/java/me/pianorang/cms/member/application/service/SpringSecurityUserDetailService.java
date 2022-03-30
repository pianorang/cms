package me.pianorang.cms.member.application.service;

import lombok.extern.slf4j.Slf4j;
import me.pianorang.cms.member.application.port.out.LoginMemberPort;
import me.pianorang.cms.member.domain.Member;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Slf4j
@Service
public class SpringSecurityUserDetailService implements UserDetailsService {

    private final LoginMemberPort loginMemberPort;

    public SpringSecurityUserDetailService(LoginMemberPort loginMemberPort) {
        this.loginMemberPort = loginMemberPort;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = loginMemberPort.login(username);

        var user = new UserDetails(){
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                List<GrantedAuthority> authorities = new ArrayList<>();

                if(member.getUserId().equals("cmsadmin")) {
                    authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
                }
                else {
                    authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
                }

                return authorities;
            }

            @Override
            public String getPassword() {

                return member.getUserPwd();
            }

            @Override
            public String getUsername() {
                return member.getUserId();
            }

            @Override
            public boolean isAccountNonExpired() {
                return true;
            }

            @Override
            public boolean isAccountNonLocked() {
                return true;
            }

            @Override
            public boolean isCredentialsNonExpired() {
                return true;
            }

            @Override
            public boolean isEnabled() {
                return true;
            }
        };

        return user;
    }
}
