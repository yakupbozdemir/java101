import java.util.Scanner;
public class Main {
    public static int power(int base,int exp){
        if (exp == 0){
            return 1;
        } else {
            return base * power(base, exp - 1);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban: ");
        int base = inp.nextInt();

        System.out.print("Üs: ");
        int exp = inp.nextInt();
        
        int result = power(base,exp);
        System.out.println("Sonuç: "+ result);
    }
}