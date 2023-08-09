public class Main {

    public static void main(String[] args) {
        int size = 7;
        char[][] letterMatrix = new char[size][size];

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                letterMatrix[row][col] = ' ';
            }
        }

        for (int row = 0; row < size; row++) {
            letterMatrix[row][0] = '*';
            letterMatrix[row][size - 1] = '*';
            letterMatrix[0][row] = '*';
            letterMatrix[size / 2][row] = '*';
            letterMatrix[size - 1][row] = '*';
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(letterMatrix[row][col]);
            }
            System.out.println();
        }
    }
}
