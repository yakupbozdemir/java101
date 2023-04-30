import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        double tutar = input.nextDouble();
        double kdvOrani = tutar<=1000?0.18:0.08;
        double kdvTutar = tutar * kdvOrani;
        double kdvliTutar = tutar + kdvTutar;
        System.out.println("Kdv'li Tutar: " + kdvliTutar);
        System.out.println("Kdv Tutarı:" + kdvTutar);
        System.out.println("Kdv Oranı:" +kdvOrani);

    }
}
