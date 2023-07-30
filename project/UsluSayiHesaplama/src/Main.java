import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = 1;

        System.out.print("Taban Sayısı: ");
        int base = inp.nextInt();

        System.out.print("Üs Sayısı: ");
        int exp = inp.nextInt();

        for (int i = 1; i<=exp;i++){
            total *= base;
        }

        System.out.println(base + " ^ " + exp + " : " + total);
    }
}