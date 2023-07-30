import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double price;

        System.out.print("Mesafeyi km türünden giriniz: ");
        int distance = inp.nextInt();

        System.out.print("Yaşınızı giriniz ");
        int age = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int type = inp.nextInt();

        if (age<0 || distance<=0 || !(type == 1 || type == 2)){
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            price = distance * 0.10;
            if (type==1){
                if (age<12){
                    price = price/2;
                } else if ((age>12)&&(age<24)) {
                    price = price-(price/10);
                }else if (age>65){
                    price = price-((price*3)/10);
                }
                System.out.println("Toplam Tutar = " + price);
            }else {
                if (age<12){
                    price = price/2;
                } else if ((age>12)&&(age<24)) {
                    price = price-(price/10);
                }else if (age>65){
                    price = price-((price*3)/10);
                }
                price = price-((price*2)/10);
                price = price * 2;
                System.out.println("Toplam Tutar = " + price);
            }
        }
    }
}