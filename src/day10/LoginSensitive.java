package day10;

import java.io.Console;

public class LoginSensitive {
    public static void main(String[] args) {
        Console console= System.console(); // we have to use the console for this
        System.out.println("Enter Username");
        String userName= console.readLine("");
        System.out.println("Enter Password");
        char[] password= console.readPassword();

        if (password.equals("password")){
            System.out.println("Login Successful");
        }
        else System.out.println("Login is not Successful");
    }
}
