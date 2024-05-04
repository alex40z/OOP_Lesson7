package model;

import complex.ComplexNumber;

public class CalcModel implements Model {

    private ComplexNumber x, y;
    private String operator;

    @Override
    public void setX(ComplexNumber value) {
        x = value;
    }

    @Override
    public ComplexNumber getX() {
        return x;
    }

    @Override
    public void setY(ComplexNumber value) {
        y = value;
    }

    @Override
    public ComplexNumber getY() {
        return y;
    }

    @Override
    public void setOperator(String value) {
        operator = value;
    }

    @Override
    public ComplexNumber result() {
        switch (operator) {
            case "+":
                return new ComplexNumber(x.getRealPart() + y.getRealPart(), x.getImaginaryPart() + y.getImaginaryPart());
            case "-":
                return new ComplexNumber(x.getRealPart() - y.getRealPart(), x.getImaginaryPart() - y.getImaginaryPart());
            case "*":
                return new ComplexNumber(x.getRealPart() * y.getRealPart() - x.getImaginaryPart() * y.getImaginaryPart(),
                    x.getRealPart() * y.getImaginaryPart() + x.getImaginaryPart() * y.getRealPart());
            case "/":
                return new ComplexNumber((x.getRealPart() * y.getRealPart() + x.getImaginaryPart() * y.getImaginaryPart())
                    / (y.getRealPart() * y.getRealPart() + y.getImaginaryPart() * y.getImaginaryPart()),
                    ((x.getImaginaryPart() * y.getRealPart() - x.getRealPart() * y.getImaginaryPart())
                     / (y.getRealPart() * y.getRealPart() + y.getImaginaryPart() * y.getImaginaryPart())));
        }
        return null;
    }
}
