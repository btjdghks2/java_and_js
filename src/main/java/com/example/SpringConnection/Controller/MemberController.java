package com.example.SpringConnection.Controller;


import com.example.SpringConnection.Dto.EditMemberDto;
import com.example.SpringConnection.Repository.MemberRepository;
import com.example.SpringConnection.Service.MemberService;
import com.example.SpringConnection.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MemberController {


    // 여기에는 findall 조회 기능 하나면 됨

    // 여기서 만들것은 주문 목록으로 이동하는 기능은 오더에서 만들면 되고, 기본 정보를 뜨게하고get 수정하는 기능 update,
    private final MemberRepository memberRepository;
    private final MemberService memberService;

    @GetMapping("/api/main/mypage/{id}")
    public ResponseEntity<Member> Findbymembercontrol(@PathVariable Long id) {

        Member member = memberRepository.findById(id).orElseThrow();
        return ResponseEntity.ok(member);

    }

    @PatchMapping("/api/main/mypage/{id}/edit")
    public ResponseEntity<Member> EditMemberControl(@PathVariable Long id, @RequestBody EditMemberDto editMemberDto){

        Member member = memberService.EditMemberService(editMemberDto);
        return ResponseEntity.ok(member);
    }




}
