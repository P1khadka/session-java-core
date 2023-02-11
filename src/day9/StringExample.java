package day9;

public class StringExample {
    public static void main(String[] args) {
        String s1="Test";
        String s2=  "Test";
        System.out.println(s1==s2); // do not use this kind of compare
        System.out.println(s1.equals(s2)); // s1 iput implicitly

        String a1="Hello";
        String a2="Hello Prakash";
        String a3= a2.substring(0,5);
        System.out.println(a1.equals(a3));

        String b=String.format("Hello! %s, How are you? Thanks", "Prakash");
        System.out.println(b);

        String name="prakash Khadka";
        char name1= name.toUpperCase().charAt(0);
        System.out.println(name1);
    }
}
