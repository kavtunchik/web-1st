package by.bsuir.labwork_1.task_9.logic.model;

public class Ball {
    private Color color;
    private double weight;

    public Ball(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
