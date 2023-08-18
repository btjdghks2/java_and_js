package com.example.SpringConnection.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String memberid;

    @Column
    private String memberpasswd;

    @Column
    private int phonenumber;

    @OneToMany(mappedBy = "member")
    private List<Order> order = new ArrayList<>();
}
