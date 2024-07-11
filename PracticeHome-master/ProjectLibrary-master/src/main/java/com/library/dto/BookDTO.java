package com.library.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {
    private String code;
    private String name;
    private String category;
    private String author;
}
