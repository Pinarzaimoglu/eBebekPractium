import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double ARMUT=2.14, ELMA=3.67, DOMATES=1.11, MUZ=0.95, PATLICAN=5.00, tutar;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        Integer armut = scanner.nextInt();

        System.out.print("Elma Kaç Kilo ? : ");
        Integer elma = scanner.nextInt();

        System.out.print("Domates Kaç Kilo ? : ");
        Integer domates = scanner.nextInt();

        System.out.print("Muz Kaç Kilo ? : ");
        Integer muz = scanner.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        Integer patlican = scanner.nextInt();

        tutar = (ARMUT*armut) + (ELMA*elma) + (DOMATES*domates) + (MUZ*muz) + (PATLICAN*patlican);

        System.out.println("Toplam tutar : " + tutar);

    }
}