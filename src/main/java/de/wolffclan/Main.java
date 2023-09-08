package de.wolffclan;

import de.wolffclan.course.Course;
import de.wolffclan.student.Student;
import de.wolffclan.teacher.Teacher;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ffm-java-23-1-Lombok \n ------------");
        Student student1 = new Student(1,"Berti","Hamburg","8a");
        Student student2 = new Student(2,"Berti","Hamburg","8a");
        Student student3 = new Student(3,"Berti","Hamburg","8a");
        Student student4 = new Student(4,"Berti","Hamburg","8a");
        List<Student> students1 = new List<Student>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Student> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Student student) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Student> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Student> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Student get(int index) {
                return null;
            }

            @Override
            public Student set(int index, Student element) {
                return null;
            }

            @Override
            public void add(int index, Student element) {

            }

            @Override
            public Student remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Student> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Student> listIterator(int index) {
                return null;
            }

            @Override
            public List<Student> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        students1.add(student1);
        students1.add(student2);
        students1.add(student3);
        students1.add(student4);
        Teacher teacher1 = new Teacher(8,"Meier", "Mathe");
        Course courseMathe8 = new Course();
        courseMathe8.setId(20);
        courseMathe8.setName("Mathe 8");
        courseMathe8.setTeacher(teacher1);
        courseMathe8.setStudents(students1);

        System.out.println(courseMathe8);
    }
}