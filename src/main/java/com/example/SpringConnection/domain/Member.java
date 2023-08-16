package com.example.SpringConnection.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String memberid;

    @Column
    private int phonenumber;

    @OneToMany(mappedBy = "member")
    private List<Order> order = new ArrayList<>();
}
