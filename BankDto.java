package com.xworkz.crud;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor


public class BankDto {

    private int id;
    private String name;
    private long contactNumber;
    private String bankType;
    private String email;


}
