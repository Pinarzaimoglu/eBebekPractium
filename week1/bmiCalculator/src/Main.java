import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double b = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        Integer k = scanner.nextInt();

        double bmi = (double)k / (b * b);

        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    }
}