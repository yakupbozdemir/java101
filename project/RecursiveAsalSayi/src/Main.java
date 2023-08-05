import java.util.Scanner;

public class Main {
    public static boolean isPrime(int number){
        return prime(number, 2);
    }
    public static boolean prime(int number,int divisor){
        if (number <= 2) {
            return (number == 2);
        }

        if (number % divisor == 0) {
            return false;
        }

        if (divisor * divisor > number) {
            return true;
        }

        return prime(number, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int number = inp.nextInt();

        if (isPrime(number))
            System.out.println(number + " asal bir sayıdır.");
        else
            System.out.println(number + " asal bir sayı değildir.");

    }
}