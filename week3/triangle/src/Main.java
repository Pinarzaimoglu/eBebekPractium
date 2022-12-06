import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısı giriniz : ");
        Integer size = scanner.nextInt();

        int i, j;

        for (i = size; i >= 1; i--) {
            for (j = i; j < size; j++)
                System.out.print(" ");

            for (j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");

            System.out.println("");
        }
    }
}