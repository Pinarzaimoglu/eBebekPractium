import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz:  ");
        Integer length = scanner.nextInt();

        Integer [] array = new Integer[length];

        for(int i=0; i<length; i++){
            System.out.print((i+1) +". Sayıyı giriniz:");
            array[i] = scanner.nextInt();
        }

        System.out.println("En büyük sayı: " + Collections.max(Arrays.asList(array)) );
        System.out.println("En küçük sayı: " + Collections.min(Arrays.asList(array)) );

    }
}