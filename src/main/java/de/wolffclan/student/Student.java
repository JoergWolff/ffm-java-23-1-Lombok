package de.wolffclan.student;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class Student {
    private final int id;
    private final String name;
    private final String address;
    @With
    private final String grade;
}
