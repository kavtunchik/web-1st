package by.bsuir.labwork_1.task_9.logic.sevice;

import by.bsuir.labwork_1.task_9.logic.model.Ball;
import by.bsuir.labwork_1.task_9.logic.model.Basket;
import by.bsuir.labwork_1.task_9.logic.model.Color;

public class Service {
    private static Service instance;

    private Service() {
    }

    public static Service getInstance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }

    public double getWeightOfBalls(Basket basket) {
        return basket.getBalls().stream().mapToDouble(Ball::getWeight).sum();
    }

    public int getAmountOfBlueBalls(Basket basket) {
        return (int) basket.getBalls().stream().filter(ball -> ball.getColor() == Color.BLUE).count();
    }
}
