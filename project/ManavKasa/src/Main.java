import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican=5;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo, tutar;
        System.out.print("Armut Kaç Kilo ? :");
        armutKilo = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elmaKilo = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        domatesKilo = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        muzKilo = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKilo = input.nextDouble();

        tutar = ((armut*armutKilo) + (elma*elmaKilo) + (domates*domatesKilo) + (muz*muzKilo) + (patlican*patlicanKilo));
        System.out.println("Toplam Tutar :" + tutar);
    }
}
