package by.bsuir.labwork_1.task_2.methods;

import by.bsuir.labwork_1.task_2.data.Main;

public class Methods {
    private static boolean isDotResideToTheFirstRegion(double x, double y) {
        return (((x < (Main.POSITIVE_COORDINATE_X - 2)) && (x > (Main.NEGATIVE_COORDINATE_X + 2)))) &&
                (((y < (Main.POSITIVE_COORDINATE_Y)) && (y > (Main.NEGATIVE_COORDINATE_Y + 3))));
    }

    private static boolean isDotResideToTheSecondRegion(double x, double y) {
        return (((x < (Main.POSITIVE_COORDINATE_X)) && (x > (Main.NEGATIVE_COORDINATE_X)))) &&
                (((y < (Main.POSITIVE_COORDINATE_Y - 5)) && (y > (Main.NEGATIVE_COORDINATE_Y))));
    }

    public static boolean isDotReside(double x, double y) {
        return (isDotResideToTheFirstRegion(x, y) || isDotResideToTheSecondRegion(x, y));
    }
}
