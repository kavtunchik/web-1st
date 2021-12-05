package by.bsuir.labwork_1.task_5.methods;

public class SmallestGreatestIndex {
    public static int findSmallestGreatestIndex(int[] array, int rightBorder, int key) {
        int leftBorder = -1;
        while (rightBorder - leftBorder > 1) {
            int m = leftBorder + (rightBorder - leftBorder) / 2;
            if (array[m] >= key) {
                rightBorder = m;
            } else {
                leftBorder = m;
            }
        }

        return rightBorder;
    }
}
