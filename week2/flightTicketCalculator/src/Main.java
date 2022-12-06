import calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        Integer distance, age, flightType;

        do{
            System.out.println("Mesafeyi km türünden giriniz :");
            distance = scanner.nextInt();
            if(distance<0)
                System.out.println("Hatalı Veri Girdiniz !");
        }while(distance<0);

        do{
            System.out.println("Yaşınızı giriniz :");
            age = scanner.nextInt();
            if(age<0)
                System.out.println("Hatalı Veri Girdiniz !");
        }while(age<0);

        do{
            System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
            flightType = scanner.nextInt();
            if(flightType !=1 && flightType !=2)
                System.out.println("Hatalı Veri Girdiniz !");
        }while(flightType == 1 && flightType == 2);

        calculator.calculate(distance, age, flightType);

    }
}