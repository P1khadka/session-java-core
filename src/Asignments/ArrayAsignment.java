package Asignments;

import java.util.Arrays;

public class ArrayAsignment {
    public static void main(String[] args) {
       // Find the min and mx value of an array of length 10
        int num[]={1,20,30,10,44,20,90,80,70,26};
        Arrays.sort(num);
        System.out.println(num[num.length-1]); // max number
        System.out.println(num[0]);// minimum number
    }
}
