package by.bsuir.labwork_1.task_7.data;

import by.bsuir.labwork_1.task_7.methods.ShellSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = {2.5, 1, 8, 9, 11, 0, 4, 8.7, 8.6, 9, 13};
        System.out.println(Arrays.toString(ShellSort.sort(array)));
    }
}
