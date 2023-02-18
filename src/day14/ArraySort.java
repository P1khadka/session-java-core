package day14;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        String a[] = {"Prakash", "AAkash", "Tanka"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        // TODO
        Student student[] = new Student[3];
        student[0] = new Student("Prakash", 31);
        student[1] = new Student("rakash", 18);
        student[2] = new Student("akash", 51);

        Arrays.sort(student);
        System.out.println(Arrays.toString(student));


    }
}
