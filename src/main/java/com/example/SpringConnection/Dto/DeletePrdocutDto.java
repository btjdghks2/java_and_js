package com.example.SpringConnection.Dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class DeletePrdocutDto {

    @Column
    private Long id;

    @Column
    private String productname;

    @Column
    private String productcontent;

    @Column
    private int price;

    @Column
    private int count;

}
