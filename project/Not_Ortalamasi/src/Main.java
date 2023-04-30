import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat + turkce + fizik + kimya + tarih +muzik);
        double sonuc = toplam / 6.0;
        System.out.println(sonuc);
        System.out.println(sonuc >=60? "Sınıfı Geçti":"Sınıfta Kaldı");
    }
}