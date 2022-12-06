public class Main {
    public static void main(String[] args) {

        for(int number=2; number<100; number++){
            Integer count = 0;
            for(int i=2; i<number; i++){
                if(number%i == 0)
                    count++;
            }
            if(count == 0)
                System.out.print(number +" ");
        }
    }
}