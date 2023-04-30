import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, u, alan;
        System.out.print("İlk Kenarın uzunluğu: ");
        a = input.nextDouble();
        System.out.print("İkinci Kenarın Uzunluğu: ");
        b = input.nextDouble();
        c = (a*a) + (b*b);
        c = Math.sqrt(c);

        u = (a + b+ c)/2;
        alan = u*(u-a)*(u-b)*(u-c);
        alan = Math.sqrt(alan);

        System.out.println("Hipotenüs= " + c);
        System.out.println("Alan=" + alan);

    }
}
