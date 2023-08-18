package com.example.SpringConnection.Repository;


import com.example.SpringConnection.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
