package calculator;

import java.util.Scanner;

public class Calculator {
    public void calculate(int distance, int age, int type) {
        double ageDiscount=0, typeDiscount=0, totalPrice = 0;

        double price = distance*0.10;

        if(age<12)
            ageDiscount = price*0.50;
        else if (age>=12 && age<=24)
            ageDiscount = price*0.10;
        else if (age>65)
            ageDiscount = price*0.30;

        double ageDiscountPrice = price - ageDiscount;

        if(type == 2) {
            typeDiscount = ageDiscountPrice * 0.20;
            totalPrice = (ageDiscountPrice - typeDiscount) * 2;
        }else
            totalPrice = ageDiscountPrice - typeDiscount;

        System.out.println("Toplam tutar: " + totalPrice);

    }
}
