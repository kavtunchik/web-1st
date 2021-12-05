package by.bsuir.labwork_1.task_4.methods;

import java.util.ArrayList;

public class CheckAnArray {

    public static ArrayList<Integer> CheckArray(int[] input) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (CheckANumberForSimplicity.CheckNumberForSimplicity(input[i])) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public static void printResult(ArrayList<Integer> arrayList) {
        System.out.println(arrayList.toString());
    }
}
