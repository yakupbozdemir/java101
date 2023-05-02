import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        double avarege = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = inp.nextInt();

        int dersSayisi = 0;

        if (0 <= mat && mat <= 100){
            avarege +=  mat;
            dersSayisi++;
        }
        if (0 <= fizik && fizik <= 100){
            avarege +=  fizik;
            dersSayisi++;
        }
        if (0 <= turkce && turkce <= 100){
            avarege +=  mat;
            dersSayisi++;
        }
        if (0 <= kimya && kimya <= 100){
            avarege +=  kimya;
            dersSayisi++;
        }
        if (0 <= muzik && muzik <= 100){
            avarege +=  muzik;
            dersSayisi++;
        }

        avarege /= dersSayisi;

        if (avarege <= 55){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        }else{
            System.out.println("Tebriler, sınıfı geçtiniz !");
        }

        System.out.println("Ortalamanız: " + avarege);

    }
}