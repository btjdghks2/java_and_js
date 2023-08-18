package com.example.SpringConnection.Dto;

import jakarta.persistence.Column;
import lombok.*;

@Data
@Getter
@NoArgsConstructor
@Setter
public class EditMemberDto {
    @Column
    private Long id;

    @Column
    private String memberid;

    @Column
    private String memberpasswd;

    @Column
    private int phonenumber;

    public EditMemberDto(Long id, String memberid, String memberpasswd, int phonenumber) {
        this.id = id;
        this.memberid = memberid;
        this.memberpasswd = memberpasswd;
        this.phonenumber = phonenumber;
    }
}
