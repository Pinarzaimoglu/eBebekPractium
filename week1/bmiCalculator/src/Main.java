import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double height = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        Integer weight  = scanner.nextInt();

        double bmi = (double)weight  / (height  * height );

        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    }
}