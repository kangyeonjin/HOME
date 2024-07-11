package com.library.dto;

import lombok.*;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class BorrowDTO {
    private String borrowCode;
    private Date borrowDay;
    private Date returnDay;
    private String bookCode;
    private String memberCode;
}
