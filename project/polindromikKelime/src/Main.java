import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str){
        int i = 0;
        int j = (str.length() - 1);
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("bir Kelime Giriniz : ");
        String str = inp.nextLine();

        if (isPalindrome(str)){
            System.out.println(str + " Bir Palindrom Kelimedir. ");
        } else {
            System.out.println(str + " Bir Palindrom Kelime Değildir. ");
        }
    }

}