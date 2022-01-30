package com.library.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Book {
    private int id;
    private String title;
    private String author;
    private String description;
}
