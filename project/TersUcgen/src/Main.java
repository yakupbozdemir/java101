import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = inp.nextInt();

        for (int i = n; i >=1 ; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
