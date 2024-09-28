package lec5;

import java.math.*;

public class BigDecimalEx {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("45");
        BigDecimal b = new BigDecimal("15.3");

//        System.out.println(a.add(b));
//
//        System.out.println(a.subtract(b));
//        System.out.println(a.multiply(b));



//        System.out.println(a.divide(b, 2,  RoundingMode.HALF_UP));

        BigDecimal d = new BigDecimal("123.4567");

        BigDecimal t = BigDecimalUtil.defaultRound(d);

        System.out.println("d = " + d);
        System.out.println("t = " + t);


    }


}
