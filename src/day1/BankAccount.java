package day1;

public class BankAccount {
    // states it must be very specific
    private String accountHolderName;
    private String accountNumber;
    private String accountType;
    private String accountBalance;
    private Address address;
    private long socialSecurityNumber;
    private String openingBranch;
    private final String BANK_NAME="Bank of America";

    public void setAccountHolderName( String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    public String getAccountHolderName(){
        return this.accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // behaviour
    // deposit
    public double deposit(BankAccount toAccount, double amountToBeDeposit ){
        return 0.0;
    }

    //withdraw
    public double withdraw( BankAccount fromAccount , double amountToBeWithdraw){
        return 0.00;
    }
    // transfer
    public  boolean tranfer(BankAccount fromAccount, BankAccount toAccount, double amountToBeTransfer){
        return true;
    }
    // download statemen
    public String downloadStatements(BankAccount account, String fromDate,String toDate ){
return "";
    }
    //  link cards
    public void linkCard(BankAccount account, String cardNumber){

    }
    // check balance
    public String checkBalance(BankAccount account){
       return account.accountBalance;
    }





}
