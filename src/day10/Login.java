package day10;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username");
        String userName= scanner.next();
        System.out.println("Enter Password");
        String password=scanner.next();
        if (password.equals("password")){
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Unsuccessful");
        }
    }
}
