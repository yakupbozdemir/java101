import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("n1 Sayısını Giriniz: ");
        int n1 = inp.nextInt();

        System.out.print("n2 Sayısını Giriniz: ");
        int n2 = inp.nextInt();

        int count = 1,ebob = 1;

        while (count <= n1){
            if ((n1 % count == 0) && (n2 % count == 0)){
                ebob = count;
            }
            count++;
        }

        int ekok = ((n1*n2)/ebob);
        System.out.println("EBOB: " + ebob + "\nEKOK: " + ekok);

    }
}