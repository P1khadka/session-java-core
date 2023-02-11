package day1;

public class BOFAApp {
    public static void main(String[] args) {
        BankAccount prakashAccount = new BankAccount();
       // prakashAccount.accountHolderName="Prakash Khadka";
        prakashAccount.setAccountHolderName("Prakash Khadka");
        //prakashAccount.accountNumber="123456";
        prakashAccount.setAccountNumber("123456");
        System.out.println(prakashAccount.getAccountNumber()+" "+prakashAccount.getAccountHolderName());

        BankAccount archanaAccount= new BankAccount();
      //  archanaAccount.accountHolderName="Archana Giri";
       // archanaAccount.accountNumber="1234567";

        Address tankaAddress= new Address();
        BankAccount tankaAccount= new BankAccount("12345", "Tanka Khadka", "Checking", 8000.0, 123342552,"Neapal",   "BOFA" );
        tankaAccount.checkBalance();
        tankaAccount.deposit( 1000);
        tankaAccount.linkCard("12233222");
        BankAccount karmaAccount= new BankAccount("12345", "Tanka Khadka", "Checking", 8000.0, 123342552,"Neapal",   "BOFA" );
tankaAccount.tranfer( karmaAccount, 1000);
    }




}
