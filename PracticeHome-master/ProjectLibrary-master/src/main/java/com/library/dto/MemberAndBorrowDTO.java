package com.library.dto;

import lombok.*;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberAndBorrowDTO {

    private MemberDTO membercode;
    private String membername;
    private String memberphone;
    private String memberno;
    private String borrowCode;
    private Date borrowDay;
    private Date returnDay;
    private String bookCode;

}
