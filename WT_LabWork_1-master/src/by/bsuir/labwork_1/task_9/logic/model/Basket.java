package by.bsuir.labwork_1.task_9.logic.model;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Ball> balls;

    public Basket(List<Ball> balls) {
        this.balls = balls;
    }

    public Basket() {
        balls = new ArrayList<>();
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }
}
