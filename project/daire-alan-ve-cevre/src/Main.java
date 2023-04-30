import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14, r, a, alan;
        System.out.print("Dairenin Yarıçapı: ");
        r = input.nextDouble();
        System.out.print("Daire Diliminin Merkez Açısı: ");
        a = input.nextDouble();

        alan = ((pi* (r*r)* a)/360);
        System.out.println("Dairenin Alanı: " + alan);

    }
}
