import java.util.Scanner;

public class Main {
    public static void pattern(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            return;
        } else {
            pattern(n - 5);
        }

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        System.out.print("Çıktısı: ");
        pattern(n);

    }
}


