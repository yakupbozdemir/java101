import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("C(n,r)");

        System.out.print("n: ");
        int n = inp.nextInt();

        System.out.print("r: ");
        int r = inp.nextInt();

        int totalN = 1,totalR = 1,totalNR = 1;

        for (int i =1;i<=n;i++){
            totalN = totalN * i;
        }
        for (int i =1;i<=r;i++){
            totalR = totalR * i;
        }
        for (int i =1;i<=(n-r);i++){
            totalNR = totalNR * i;
        }

        System.out.println("N’in r’li kombinasyonu: " + totalN/(totalR*totalNR));
    }
}