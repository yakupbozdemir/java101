import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = inp.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < list.length;i++){
            System.out.print((i+1) + ". Elemanı : ");
            list[i] = inp.nextInt();
        }

        Arrays.sort(list);
        System.out.print("Sıralama : ");
        int j = 0;

        for (int i : list){
            System.out.print(list[j] + " ");
            j++;
        }

    }
}