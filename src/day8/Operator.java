package day8;

public class Operator {
    public static void main(String[] args) {
        int sum=0;
        sum +=3;
        sum +=6;
        System.out.println(sum);

        int multiply=1;
        multiply *=10;
        multiply *=20;
        System.out.println(multiply);
int sum1=0;
        int a=123456;
        int remainder=a%10;
        int quotient=a/10;
        System.out.println(remainder);
        System.out.println(quotient);
        sum1 +=remainder;
        System.out.println(sum1);

        int newNumber = quotient;
        int remainder1=newNumber%10;
        int quotient1=newNumber/10;
        sum1+=remainder1;
        System.out.println(sum1);

        int newNumber1 = quotient1;
        int remainder2=newNumber1%10;
        int quotient2=newNumber1/10;
        sum1+=remainder2;
        System.out.println(sum1);

        int newNumber2 = quotient2;
        int remainder3=newNumber2%10;
        int quotient3=newNumber2/10;
        sum1+=remainder3;
        System.out.println(sum1);

        int newNumber3 = quotient3;
        int remainder4=newNumber3%10;
        int quotient4=newNumber3/10;
        sum1+=remainder4;
        System.out.println(sum1);

        int newNumber4 = quotient4;
        int remainder5=newNumber4%10;
        int quotient5=newNumber4/10;
        sum1+=remainder5;
        System.out.println(sum1);

    }
}
