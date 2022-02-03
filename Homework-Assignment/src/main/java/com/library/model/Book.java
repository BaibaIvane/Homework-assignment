package com.library.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Book {
    private Long id;
    private String title;
    private String author;
    private String book_description;
}
