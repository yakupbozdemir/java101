import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kg, m, bmi;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        m = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kg = input.nextDouble();
        bmi = (kg / (m * m));
        System.out.println("Vücut Kitle İndeksiniz : " + bmi);

    }
}
