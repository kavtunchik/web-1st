package by.bsuir.labwork_1.task_6.data;

import by.bsuir.labwork_1.task_6.methods.Matrix;
import by.bsuir.labwork_1.task_6.methods.Methods;


public class Main {
    public static void main(String[] args) {
        double[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Matrix.print(Methods.getMatrix(input));
    }
}
