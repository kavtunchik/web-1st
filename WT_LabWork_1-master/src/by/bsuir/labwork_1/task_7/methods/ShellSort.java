package by.bsuir.labwork_1.task_7.methods;

public class ShellSort {
    public static double[] sort(double[] array) {
        int i, j, step;
        double temp;
        for (step = array.length; step > 0; step /= 2) {
            for (i = step; i < array.length; i++) {
                temp = array[i];
                for (j = i; j >= step; j -= step) {
                    if (temp < array[j - step]) {
                        array[j] = array[j - step];
                    } else {
                        break;
                    }
                }
                array[j] = temp;
            }
        }
        return array;
    }
}
