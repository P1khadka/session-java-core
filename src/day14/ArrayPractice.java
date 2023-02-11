package day14;

import java.util.Arrays;

import static java.lang.Thread.sleep;

public class ArrayPractice {
    public static void main(String[] args) {
        int i = 0;
        int a=10;
        int marks[]={10,20,30};
        System.out.println(marks[2]);

        String name[]= new String[5];
        System.out.println(Arrays.toString(name));
        name[2]= "Prakash";
        System.out.println(Arrays.toString(name));
        String value= name[2];
        System.out.println(value);
        int length=name.length;
        System.out.println(length);


//        for ( int i=0,  i<name.length;i++){
//            System.out.println(i);
//            String value1= name[i];
//            System.out.println(value1);
//        }
        for (String names:name
             ) {
            System.out.println(i++ +" "+names);
        }

    }
}
