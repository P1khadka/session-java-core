package day5;

import day1.BankAccount;

public class WorkingWithNull {
    public static void main(String[] args) {
        BankAccount karmaAccount= new BankAccount();
        System.out.println(karmaAccount.getAccountNumber());
        System.out.println(karmaAccount.getAccountHolderName());
        int length= karmaAccount.getAccountNumber().length();
    }
}
