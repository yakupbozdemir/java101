import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int acilis = 10, mesafe;
        double kmBasi = 2.20, tutar;
        System.out.print("Gidilen Mesafe: ");
        mesafe = input.nextInt();
        tutar = (acilis + (mesafe*kmBasi));
        tutar = tutar <=20?20:tutar;
        System.out.println("Toplam Ücret:" + tutar);

    }
}
