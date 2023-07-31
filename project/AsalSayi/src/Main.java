public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 100;i++){
            boolean isPrime = true;

            for (int divisor = 2; divisor < i; divisor++) {
                if (i % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
