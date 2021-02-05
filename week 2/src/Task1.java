public class Task1 {
    public static void main(String[] args) {
        Solute a = new Solute();
        int[][] matrix = new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16} };
        a.rotate(matrix);
    }

    static class Solute {
        void rotate(int[][] matrix) {
            int len = matrix.length;
            for (int i = 0; i < len / 2; i++) {
                for (int j = i; j < len - 1 - i; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[len - 1 - j][i];
                    matrix[len - 1 - j][i] = matrix[len - 1 - i][len - 1 - j];
                    matrix[len - 1 - i][len - 1 - j] = matrix[j][len - 1 - i];
                    matrix[j][len - 1 - i] = temp;
                }
            }
            for (int i=0;i<len;i++) {
                for (int j = 0; j < len; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
                }
            }
        }
