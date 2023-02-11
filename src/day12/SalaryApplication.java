package day12;

public class SalaryApplication {
    public static void main(String[] args) {
        double targetSale=1000;
        int salary=50000;
        if (targetSale>=2000){
            System.out.println("Salary is "+(salary+10000));
        }
        else if (targetSale <2000 && targetSale>=1000) {
            System.out.println("Salary is "+(salary+5000));
        }
        else{
            System.out.println("Salary is "+salary);}


    }
}
