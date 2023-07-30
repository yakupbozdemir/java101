import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = inp.nextInt();

        System.out.print("4'ün kuvvetleri: ");
        for (int i = 1; i<=number;i*=4){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("5'in kuvvetleri: ");
        for (int i = 1; i<=number;i*=5){
            System.out.print(i + " ");
        }
    }
}