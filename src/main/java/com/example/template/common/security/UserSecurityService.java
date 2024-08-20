package com.example.template.common.security;

import com.example.template.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserSecurityService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("유저 아이디:{}",Long.valueOf(username));
        return memberRepository.findById(Long.valueOf(username)).orElseThrow(()-> new UsernameNotFoundException("존재하지 않는 유저입니다."));

    }
}
