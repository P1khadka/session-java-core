package day3;

public class SchoolApp {
    public static void main(String[] args) {
        Teacher tanka= new Teacher();
        tanka.getName();
        tanka.getAge();

        Student prakash= new Student();
        prakash.getName();
        prakash.getAge();


// we can create the object like this because inheritance is  "is-a "relation
        Person person= new Student();
        Person person1= new Teacher();

        // but we cannot make like
       // Student student= new Person();

    }
}
