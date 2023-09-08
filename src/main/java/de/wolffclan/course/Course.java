package de.wolffclan.course;

import de.wolffclan.student.Student;
import de.wolffclan.teacher.Teacher;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class Course {
    private  int id;
    private  String name;
    private  Teacher teacher;
    private  List<Student> students;

}
