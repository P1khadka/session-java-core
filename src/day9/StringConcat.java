package day9;

public class StringConcat {
    public static void main(String[] args) {
        String message= "Hello"+" This" + " is" + " Prakash"; // we dont use this method because
        // this takes lots of memory. it creates object every time when concat. in this sample
        // it creates 9 objects
        System.out.println(message);

        StringBuilder stringBuilder= new StringBuilder(); // in this there are 7 objects
        stringBuilder.append(" Hello");
        stringBuilder.append(" This");
        stringBuilder.append(" is");
        stringBuilder.append(" Prakash");

        System.out.println(stringBuilder.toString());

        System.out.println("Prakash ".repeat(10));


    }
}
