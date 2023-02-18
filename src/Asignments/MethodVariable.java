package Asignments;

import java.util.Arrays;

public class MethodVariable {
    public static void main(String[] args) {
add(1,2,3,4,5);
add(1,3,4,5);
add(1,2);
    }
    public static void add(int ...values){
        System.out.println(Arrays.toString(values));
        int sum=0;
//        for (int i=0; i<values.length; i++){
//            sum=sum+values[i];
//        }
//        System.out.println(sum);

//        for (int value:values
//             ) {
//            sum=sum+value;
//        }
//        System.out.println(sum);

        int sum1=Arrays.stream(values).sum();
        System.out.println(sum1);
    }
}
