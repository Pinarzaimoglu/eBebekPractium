import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz : ");
        Integer base = scanner.nextInt();

        System.out.print("Üs değerini giriniz : ");
        Integer powerRaised = scanner.nextInt();

        int result = power(base, powerRaised);

        System.out.println("Sonuç :" + result);
    }

    public static int power(int base, int powerRaised) {
        if (powerRaised != 0) {
            return (base * power(base, powerRaised - 1));
        }
        else {
            return 1;
        }
    }

}