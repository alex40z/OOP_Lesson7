package controller;

import complex.ComplexNumber;
import model.*;
import view.Logger;
import view.View;

public class Controller {

    private View view;
    private Model model;
    private Logger logger;

    public Controller(View view, Model model, Logger logger) {
        this.view = view;
        this.model = model;
        this.logger = logger;
    }

    public void dataProcessing() {
        double x1 = view.getValue("Введите действительную часть числа X: ");
        double x2 = view.getValue("Введите мнимую часть числа X: ");
        double y1 = view.getValue("Введите действительную часть числа Y: ");
        double y2 = view.getValue("Введите мнимую часть числа Y: ");
        String operator = view.getOperator("Введите оператор: ");
        model.setX(new ComplexNumber(x1, x2));
        model.setY(new ComplexNumber(y1, y2));
        model.setOperator(operator);
        logger.save(view.print(model.getX(), model.getY(), operator, model.result()));
    }
}
