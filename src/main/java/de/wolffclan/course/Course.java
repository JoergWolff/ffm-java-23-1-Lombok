package de.wolffclan.course;

import de.wolffclan.student.Student;
import de.wolffclan.teacher.Teacher;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Value
public class Course {
    int id;
    String name;
    Teacher teacher;
    List<Student> students;

}
