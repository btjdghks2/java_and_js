package com.example.SpringConnection.Service;

import com.example.SpringConnection.Dto.EditMemberDto;
import com.example.SpringConnection.Repository.MemberRepository;
import com.example.SpringConnection.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public Member EditMemberService(EditMemberDto editMemberDto) {

        Member member = new Member();
        member.setId(editMemberDto.getId());
        member.setMemberid(editMemberDto.getMemberid());
        member.setMemberpasswd(editMemberDto.getMemberpasswd());
        memberRepository.save(member);
        return member;
    }

}
