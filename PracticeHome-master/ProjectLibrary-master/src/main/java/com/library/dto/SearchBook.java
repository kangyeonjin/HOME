package com.library.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SearchBook {
    private String condition;
    private String value;
}
