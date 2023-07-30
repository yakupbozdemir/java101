import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number,sum= 0;

        do {
            System.out.print("Tek Bir Sayı Giriniz: ");
            number = inp.nextInt();
            if (number % 2 == 0){
                System.out.println("Girdiğiniz Sayı Çift Bir Sayı!");
            }
        }while (number % 2 == 0);

        for (int i = 1; i <= number; i++){
            if (i % 2 == 0){
                sum += i;
            }
            if (i % 4 == 0) {
                sum += i;
            }
        }

        System.out.println(" çift ve 4'ün katları olan sayıların toplamı: " + sum);
    }
}