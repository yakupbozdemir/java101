import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = inp.nextInt();
        int a = 0,b = 1;

        System.out.print(a + " ");
        for (int i = 1; i < number; i++){
            System.out.print(b + " ");

            int result = a + b;
            a = b;
            b = result;
        }
    }
}