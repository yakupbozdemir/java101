import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int reset;

        Scanner inp = new Scanner(System.in);
        Scanner psw = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz :");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız !");
        } else {
            System.out.println("Bilgileriniz yanlış !");
        }

        if (!password.equals("java123")){
            System.out.println("Şifre değiştirmek için: 1 çıkmak için: 0");
        }else {System.exit(0);}
        reset = inp.nextInt();
        switch (reset) {
            case 0:
                System.exit(0);
            case 1:
                System.out.print("Yeni şifre: ");
                break;
        }
        newPassword = psw.nextLine();
        if (newPassword.equals("java123")){
            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
        }else{
            System.out.println("Şifre oluşturuldu");
        }
    }
}
