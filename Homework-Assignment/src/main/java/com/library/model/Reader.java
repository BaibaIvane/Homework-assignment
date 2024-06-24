package com.library.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Reader {
    private Long id;
    private String firstName;
    private String lastName;
    private String readingStatus;
}
