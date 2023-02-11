package day14;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        long value =1223333;
        BigInteger bigInteger= new BigInteger("112266262662"); // to print big numbers
        System.out.println(bigInteger);
        System.out.println(bigInteger.add(BigInteger.valueOf(100))); // to add numbers

        BigDecimal principal= new BigDecimal(1000);
        BigDecimal time= new BigDecimal(12);
        BigDecimal rate= new BigDecimal(7.33);

        BigDecimal interest= principal.multiply(time).multiply(rate).divide(BigDecimal.valueOf(100));
        System.out.println(interest);

    }

}
