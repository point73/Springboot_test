package com.example.hello_spring.repository;

import com.example.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); // 아이디로 회원 찾기
    Optional<Member> findByName(String name); // 이름으로 회원 찾기
    List<Member> findAll();
}
