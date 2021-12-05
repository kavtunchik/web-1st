package by.bsuir.labwork_1.task_1.data;

import by.bsuir.labwork_1.task_1.methods.Methods;

import java.util.Scanner;

public class Main {
    public static double getParameter() {
        System.out.println("Enter your parameter: ");
        return new Scanner(System.in).nextDouble();
    }
    public static void main(String[] args) {
        System.out.println(Methods.calculateExpression(getParameter(), getParameter()));
    }
}
