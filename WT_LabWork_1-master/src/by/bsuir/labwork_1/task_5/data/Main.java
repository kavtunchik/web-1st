package by.bsuir.labwork_1.task_5.data;

import by.bsuir.labwork_1.task_5.methods.Methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¬ведите длину последовательности: ");
        int sequenceLength = scanner.nextInt();
        int[] sequence = new int[sequenceLength];

        for (int i = 0; i < sequenceLength; i++) {
            System.out.printf("¬ведите [%d] элемент: ", i + 1);
            sequence[i] = scanner.nextInt();
        }

        System.out.println(Methods.findAmountValuesToRemove(sequence) + " элементов необходимо удалить");
    }
}
