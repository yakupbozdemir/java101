import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double deger1, deger2;
        int islem;
        System.out.print("ilk sayıyı giriniz: ");
        deger1 = input.nextDouble();
        System.out.print("ikinci sayıyı giriniz: ");
        deger2 = input.nextDouble();
        System.out.println("Toplama:1 çıkarma:2 Çarpma:3 Bölme:4");
        System.out.print("Hangi işlem yapılacak? :");
        islem = input.nextInt();
        double sonuc;

        switch (islem) {
            case 1 -> {
                sonuc = deger1 + deger2;
                System.out.println("Sonuç: " + sonuc);
            }
            case 2 -> {
                sonuc = deger1 - deger2;
                System.out.println("Sonuç: " + sonuc);
            }
            case 3 -> {
                sonuc = deger1 * deger2;
                System.out.println("Sonuç: " + sonuc);
            }
            case 4 -> {
                sonuc = deger1 / deger2;
                System.out.println("Sonuç: " + sonuc);
            }
            default -> System.out.println("Value is invalid");
        }
    }
}
