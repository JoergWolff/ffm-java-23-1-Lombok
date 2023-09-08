package de.wolffclan;

import de.wolffclan.course.Course;
import de.wolffclan.student.Student;
import de.wolffclan.teacher.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("ffm-java-23-1-Lombok \n ------------");
        Student student1 = new Student(1,"Berti","Hamburg",2);
        System.out.println(student1);
        Student student2 = new Student(2,"Berti","Hamburg",1);
        Student student3 = new Student(3,"Berti","Hamburg",2);
        Student student4 = new Student(4,"Berti","Hamburg",4);
        List<Student> students1 = new ArrayList<>();
        students1.add(student1);
        students1.add(student2);
        students1.add(student3);
        students1.add(student4);
        Teacher teacher1 = new Teacher(8,"Meier", "Mathe");
        System.out.println(teacher1);
        Course courseMathe8 = new Course(20,"Mathe 8", teacher1,students1);
        /* courseMathe8.setId(20);
        courseMathe8.setName("Mathe 8");
        courseMathe8.setTeacher(teacher1);
        courseMathe8.setStudents(students1);*/

        System.out.println(courseMathe8);
        List<Student> students2 = new ArrayList<>();
        students2 = students1;
        Student studentWith = student1.withGrade(6);
        students2.add(studentWith);
        Teacher teacherMueller = Teacher.builder().id(23).name("Müller").subject("Deutsch").build();
        Course course2 = Course.builder().id(12).name("Deutsch 8").teacher(teacherMueller).students(students2).build();
        System.out.println(course2);

    }
}