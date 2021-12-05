package by.bsuir.labwork_1.task_5.methods;

public class Methods {
    private static int findMaxSequenceLength(int[] array) {
        int[] subsequenceTails = new int[array.length];
        subsequenceTails[0] = array[0];
        int length = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < subsequenceTails[0]) {
                subsequenceTails[0] = array[i];
            } else if (array[i] > subsequenceTails[length - 1]) {
                subsequenceTails[length++] = array[i];
            } else {
                subsequenceTails[SmallestGreatestIndex.findSmallestGreatestIndex(subsequenceTails, length - 1, array[i])] = array[i];
            }
        }

        return length;
    }

    public static int findAmountValuesToRemove(int[] array) {
        return array.length - findMaxSequenceLength(array);
    }
}
