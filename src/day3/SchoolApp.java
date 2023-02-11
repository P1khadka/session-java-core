package day3;

import java.time.LocalDate;

public class SchoolApp {
    public static void main(String[] args) {
        Teacher tanka= new Teacher();
        System.out.println(tanka.getName());
        tanka.getAge();
        tanka.getDob();
        tanka.setGender(Gender.MALE);
        System.out.println(tanka.getGender());

        Student prakash= new Student();
        prakash.getName();
        prakash.getAge();
        prakash.setGender(Gender.MALE);


// we can create the object like this because inheritance is  "is-a "relation
        Person person= new Student();
        Person person1= new Teacher();
        System.out.println(tanka);

        // but we cannot make like
       // Student student= new Person();


    }
}
