import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        Integer x = scanner.nextInt();

        Integer sum=0;

        for(int i=x-1; i>0; i--){
            if(x%i == 0)
                sum +=i;
        }
        if(sum == x)
            System.out.println(x +  " Mükemmel sayıdır");
        else
            System.out.println(x + " Mükemmel sayı değildir.");

    }
}