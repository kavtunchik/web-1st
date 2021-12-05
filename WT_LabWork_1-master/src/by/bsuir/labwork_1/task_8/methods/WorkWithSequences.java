package by.bsuir.labwork_1.task_8.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkWithSequences {
    private static List<Integer> getIndexes(List<Integer> in, List<Integer> from) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < from.size(); i++) {
            int dex = Collections.binarySearch(in, from.get(i));
            if (dex < 0) {
                result.add(-(dex + 1) + i);
            } else {
                result.add(dex + i);
            }
        }
        return result;
    }

    public static void printResult(List<Integer> in, List<Integer> from) {
        List<Integer> indexes = getIndexes(in, from);
        System.out.println("Места, на которые нужно вставлять элементы: " + indexes);

        for (int i = 0; i < indexes.size(); i++) {
            in.add(indexes.get(i), from.get(i));
        }
        System.out.println("Результат: "+ in);
    }
}
