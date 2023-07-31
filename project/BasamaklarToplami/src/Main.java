import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = inp.nextInt();
        int tempNumber = number;
        int basNumber = 0;

        while (tempNumber > 0) {
            int digit = tempNumber%10;
            basNumber += digit;
            tempNumber /= 10;
        }
        System.out.println("Girilen sayının basamakları toplamı: " + basNumber);
    }
}