import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.print("Girilen Sayı : ");
        int number = inp.nextInt();
        Arrays.sort(list);

        int min = -1;
        int max = -1;

        for (int j : list) {
            if (j < number) {
                min = j;
            } else {
                max = j;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
