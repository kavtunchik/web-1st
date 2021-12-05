package by.bsuir.labwork_1.task_3.methods;

public class Methods {

    private static double[] getResult(double a,double b, double h) {
        double[] result = new double[(int)(((b - a) / h) + 1)];
        double count = a;

        for (int i = 0; i < result.length; i++) {
            result[i] = Math.tan(count);
            count += h;
        }

        return result;
    }

    public static void printResult(double count, double h) {
        double[] input = getResult(4, 29,6);
        for (int i = 0; i < input.length; i++) {
            System.out.format("%d.\t%f\t%f\n", i + 1, count, input[i]);
            count += h;
        }
    }
}
