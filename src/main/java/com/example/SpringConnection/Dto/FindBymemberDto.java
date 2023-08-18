package com.example.SpringConnection.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
public class FindBymemberDto {

    @Column
    private Long id;

    @Column
    private String memberid;

    @Column
    private String memberpasswd;

    @Column
    private int phonenumber;

    public FindBymemberDto(Long id, String memberid, String memberpasswd, int phonenumber) {
        this.id = id;
        this.memberid = memberid;
        this.memberpasswd = memberpasswd;
        this.phonenumber = phonenumber;
    }
}
