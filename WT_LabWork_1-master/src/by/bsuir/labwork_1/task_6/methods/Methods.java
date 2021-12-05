package by.bsuir.labwork_1.task_6.methods;

import java.util.Arrays;

public class Methods {
    public static double[] getNewArray(double[] input) {
        double temp = input[0];
        input = Arrays.copyOfRange(input, 1, input.length + 1);
        input[input.length - 1] = temp;
        return input;
    }

    public static double[][] getMatrix(double[] input) {
        double[][] matrix = new double[input.length][input.length];

        System.arraycopy(input, 0, matrix[0], 0, matrix.length);
        for (int i = 1; i < matrix.length; i++) {
            System.arraycopy(getNewArray(matrix[i - 1]), 0, matrix[i], 0, matrix.length);
        }

        return matrix;
    }
}
