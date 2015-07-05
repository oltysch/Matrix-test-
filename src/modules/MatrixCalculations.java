package modules;

/**
 * Created by Admin on 19.05.2015.
 */
public class MatrixCalculations {
    //    function of matrix multiplication
    public static Matrix multiplication(Matrix matrix1, Matrix matrix2) {
        int h1 = matrix1.getRows();
        int w1 = matrix1.getColls();
        int h2 = matrix2.getRows();
        int w2 = matrix2.getColls();
        int[][] res;
        if (w1 != h2) {
            res = new int[][]{{0}, {0}};
            return new Matrix(res);
        } else {
            res = new int[h1][w2];
            for (int i = 0; i < h1; i++) {
                for (int j = 0; j < w2; j++) {
                    res[i][j] = 0;
                    for (int k = 0; k < w1; k++) {
                        res[i][j] += matrix1.getValue(i, k) * matrix2.getValue(k, j);
                    }
                }
            }
            return new Matrix(res);
        }
    }
}