package day1;

public class BOFAApp {
    public static void main(String[] args) {
        BankAccount prakashAccount = new BankAccount();
        prakashAccount.accountHolderName="Prakash Khadka";
        prakashAccount.accountNumber="123456";
        System.out.println(prakashAccount.accountHolderName+" "+prakashAccount.accountNumber);

        BankAccount archanaAccount= new BankAccount();
        archanaAccount.accountHolderName="Archana Giri";
        archanaAccount.accountNumber="1234567";
    }

}
