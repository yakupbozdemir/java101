public class Main {
    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int row = matrix.length;
        int column = matrix[0].length;
        int[][] transpoze = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpoze[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpoze : ");
        printMatrix(transpoze);
    }
}