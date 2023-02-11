package day14;

import java.util.Arrays;

public class DynamicArray {
    public static void main(String[] args) {
        String alphabet[]= {"a", "b"};
        System.out.println(Arrays.toString(alphabet)); // array with two
        String aphabetNewArray[]= Arrays.copyOf(alphabet, 3); // adding a array
       System.out.println(Arrays.toString(aphabetNewArray));
       aphabetNewArray[2]="c"; // after adding a array
        System.out.println(Arrays.toString(aphabetNewArray));
    }
}
