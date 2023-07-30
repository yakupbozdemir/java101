import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int value = inp.nextInt();
        int number,max=-999999999,min=999999999;
        for (int i =1;i<=value;i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            number = inp.nextInt();
            if (number>max){
                max = number;
            }
            if (number<min){
                min = number;
            }
        }
        System.out.println("En büyük sayı: " + max + "\nEn küçük sayı: " + min);
    }
}