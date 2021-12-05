package by.bsuir.labwork_1.task_8.data;

import by.bsuir.labwork_1.task_8.methods.WorkWithSequences;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> in = new ArrayList<>() {
            {
                add(-3);
                add(-2);
                add(0);
                add(8);
                add(10);
                add(19);
                add(27);
            }
        };

        List<Integer> from = new ArrayList<>() {
            {
                add(-5);
                add(-3);
                add(4);
                add(9);
                add(18);
                add(19);
            }
        };

        WorkWithSequences.printResult(in, from);
    }
}
