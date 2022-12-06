import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        Integer number = scanner.nextInt();

        if (isPrime(number, 2))
            System.out.println(number + " sayısı ASALDIR !");
        else
            System.out.println(number + " sayısı ASAL değildir !");
    }
    static boolean isPrime(int n, int i){
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, i + 1);
    }
}