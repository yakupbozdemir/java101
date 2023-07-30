import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        int year = inp.nextInt();
        int yearMod400= year % 400;
        int yearMod100= year % 100;
        int yearMod4= year % 4;

        if ((yearMod4==0)&&!(yearMod100==0)) {
            System.out.println(year + " bir artık yıldır !");
        } else if (yearMod400==0){
            System.out.println(year + " bir artık yıldır !");
        } else {
            System.out.println(year + " bir artık yıldır değildir !");
        }
    }
}