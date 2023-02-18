package day26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionPractice {
    public static void main(String[] args) {
        //ArrayList names= new ArrayList();
        HashSet names= new HashSet();
        names.add("Prakash");
        names.add("Ram");
        names.add("Prakash");
        System.out.println(names);

        HashSet<Student> students= new HashSet<Student>();
        students.add(new Student("Ram", 20));
        students.add(new Student("aRam", 22));
        students.add(new Student("Ram", 21));
        System.out.println(students);

        TreeSet<Integer> numbers= new TreeSet<>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(11);
        numbers.add(9);
        System.out.println(numbers);
    }
}
