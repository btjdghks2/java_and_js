package com.example.SpringConnection.startbean;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BeanMemberRepository {

    private final EntityManager em;
}
