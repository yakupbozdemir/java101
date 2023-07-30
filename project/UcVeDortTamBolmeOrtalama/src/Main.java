import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int k = inp.nextInt();

        double sum = 0;
        int count= 0;

        for (int i = 1; i <= k; i++){
            if (i % 3 == 0 || i % 4 == 0){
                sum += i;
                count++;
            }
        }

        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + sum/count);

    }
}