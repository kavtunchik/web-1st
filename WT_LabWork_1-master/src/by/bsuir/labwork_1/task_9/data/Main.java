package by.bsuir.labwork_1.task_9.data;

import by.bsuir.labwork_1.task_9.logic.model.Ball;
import by.bsuir.labwork_1.task_9.logic.model.Basket;
import by.bsuir.labwork_1.task_9.logic.model.Color;
import by.bsuir.labwork_1.task_9.logic.sevice.Service;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ball> balls = new ArrayList<>();
        balls.add(new Ball(Color.BLACK, 9.0));
        balls.add(new Ball(Color.BLUE, 10.0));
        balls.add(new Ball(Color.WHITE, 7.3));
        balls.add(new Ball(Color.RED, 9.6));
        balls.add(new Ball(Color.BLUE, 5.7));
        balls.add(new Ball(Color.YELLOW, 6.0));
        balls.add(new Ball(Color.BLUE, 8.9));

        Basket basket = new Basket(balls);
        Service service = Service.getInstance();
        System.out.println("Вес мячиков в корзине: " + service.getWeightOfBalls(basket));
        System.out.println("Количество синих мячиков в корзине: " + service.getAmountOfBlueBalls(basket));
    }
}
