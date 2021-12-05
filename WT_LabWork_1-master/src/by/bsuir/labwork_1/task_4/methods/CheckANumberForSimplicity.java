package by.bsuir.labwork_1.task_4.methods;

public class CheckANumberForSimplicity {
    public static boolean CheckNumberForSimplicity(int number) {
        boolean isSimple = true;

        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }
}
