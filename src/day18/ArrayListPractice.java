package day18;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
//        Student [] students= new Student[5];
        // we cannot delete from the array thats why we use arraylist
//        students[0]= new Student("Prakash", 10, 8000);
//        students[1]= new Student("Prakash", 10, 8000);
//        students[2]= new Student("Prakash", 10, 8000);
//        students[3]= new Student("Prakash", 10, 8000);
//        students[4]= new Student("Prakash", 10, 8000);
        ArrayList<Student> students= new ArrayList<Student>();
        students.add(new Student("Prakash", 10, 2000));
        students.add(new Student("rakash", 1, 1000));
        students.add(new Student("akash", 11, 3000));
        students.add(new Student("kash", 12, 4000));
        students.add(new Student("ash", 13, 5000));
        System.out.println(students);
        students.add(2, new Student("Archu", 2, 6000));
        System.out.println(students);
        students.set(2, new Student("Archana", 3, 6000));
        System.out.println(students);

        ArrayList<Student> students1= new ArrayList<>(students); // copy of all students
        System.out.println(students1.contains(new Student("Archana", 3, 6000)));
        System.out.println(students1.indexOf(new Student("Archana", 3, 6000)));

        students1.forEach(System.out::println);

        boolean isEmpty= students1.isEmpty();
        System.out.println(isEmpty);
        boolean isEmpty1= students.isEmpty();
        System.out.println(isEmpty1);
        System.out.println(students.size());

        System.out.println(students1.subList(3,6));
        System.out.println(students1.subList(students1.size()-1, students1.size()));



    }
}
