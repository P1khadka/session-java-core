package day1;

public class BankAccount {
    // states it must be very specific
    private String accountHolderName;
    private String accountNumber;
    private String accountType;
    private double accountBalance;
    private Address address;
    private long socialSecurityNumber;
    private String openingBranch;
    private final String BANK_NAME="Bank of America";
    private int licenceNumber;

    public BankAccount(){ // default constructer
    }

    public BankAccount(String accountNumber, String accountHolderName, String accountType, double accountBalance, long socialSecurityNumber, String openingBranch, String BANK_NAME){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.accountBalance=accountBalance;
        this.openingBranch=openingBranch;
        this.address=address;
       this.socialSecurityNumber=socialSecurityNumber;
       this.accountType=accountType;
    }
    public BankAccount(String accountNumber, String accountHolderName, String accountType, double accountBalance, long socialSecurityNumber, String openingBranch, String BANK_NAME, int licenceNumber){
//        this.accountNumber=accountNumber;
//        this.accountHolderName=accountHolderName;
//        this.accountBalance=accountBalance;
//        this.openingBranch=openingBranch;
//        this.address=address;
//        this.socialSecurityNumber=socialSecurityNumber;
//        this.accountType=accountType;
        this(accountNumber,accountHolderName,accountType, accountBalance,socialSecurityNumber,openingBranch, BANK_NAME);
        this.licenceNumber=licenceNumber;
    }

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
    public double deposit( double amountToBeDeposit ){
        return 0.0;
    }

    //withdraw
    public double withdraw( BankAccount fromAccount , double amountToBeWithdraw){
        return 0.00;
    }
    // transfer
    public  boolean tranfer( BankAccount toAccount, double amountToBeTransfer){
        return true;
    }
    // download statemen
    public String downloadStatements(BankAccount account, String fromDate,String toDate ){
return "";
    }
    //  link cards
    public void linkCard( String cardNumber){

    }
    // check balance
    public double checkBalance(){
       return this.accountBalance=accountBalance;
    }





}
