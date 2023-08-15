import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int rowNumber;
    private int colNumber;
    private int mineNumber;
    private String[][] arr;
    private String[][] mineLocation;

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.arr = new String[rowNumber][colNumber];
        this.mineLocation = new String[rowNumber][colNumber];
    }

    public void run() {
        start();
        mineLocation();
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz ! ");

        while (!isWin()){
            printArray();
            Scanner scan = new Scanner(System.in);

            System.out.print("Satır Giriniz " + "(1 - " + (rowNumber) + ") :");
            int row = scan.nextInt();

            System.out.print("Sütun Giriniz " + "(1 - " + (colNumber) + ") :");
            int col  = scan.nextInt();
            row = row - 1;
            col = col - 1;

            if (Objects.equals(mineLocation[row][col], " *")){
                System.out.println("Game Over!!");
                for (int i = 0; i <= rowNumber - 1; i++) {
                    for (int j = 0; j <= colNumber - 1; j++) {
                        System.out.print(mineLocation[i][j]);
                    }
                    System.out.println("");
                }
                break;
            }
            numberOfMines(row,col);
        }

        if (isWin()){
            System.out.println("Oyunu Kazandınız !");
        }

    }

    public void start() {
        for (int i = 0; i <= rowNumber - 1; i++) {
            for (int j = 0; j <= colNumber - 1; j++) {
                arr[i][j] = " -";
            }
        }

    }

    public void printArray() {
        for (int i = 0; i <= rowNumber - 1; i++) {
            for (int j = 0; j <= colNumber - 1; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("=============");
    }

    public void mineLocation() {
        Random random = new Random();
        mineNumber = (rowNumber * colNumber) / 4;

        for (int i = 0; i <= (rowNumber - 1); i++) {
            for (int j = 0; j <= (colNumber - 1); j++) {
                mineLocation[i][j] = " -";
            }
        }

        for (int i = 0; i < mineNumber; i++) {
            int randomRow = random.nextInt(rowNumber);
            int randomCol = random.nextInt(colNumber);

            if (Objects.equals(mineLocation[randomRow][randomCol], " -")) {
                mineLocation[randomRow][randomCol] = " *";
            } else {
                i--;
            }

        }
        System.out.println("=============");

    }

    public boolean isWin () {
        int count = 0;
        for (int i = 0; i <= (rowNumber - 1); i++) {
            for (int j = 0; j <= (colNumber - 1); j++) {
                if ((Objects.equals(arr[i][j], " -"))){
                    count++;
                }
            }
        }
        return count == 2;
    }

    public void numberOfMines(int row,int col){
        int count = 0;
        for (int i = row - 1 ;i <= row + 1 ;i++){
            for (int j = col - 1; j <= col + 1; j++){
                if ((i > -1) && (j > -1) &&  (i <= rowNumber - 1) && (j <= colNumber - 1)){
                    if (Objects.equals(mineLocation[i][j], " *")){
                        count++;
                    }
                }

            }
        }
        arr[row][col] = " " + count;
    }
}