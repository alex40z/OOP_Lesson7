package model;

import complex.ComplexNumber;

public interface Model {

    public void setX(ComplexNumber value);

    public ComplexNumber getX();

    public void setY(ComplexNumber value);

    public ComplexNumber getY();

    public void setOperator(String value);

    public ComplexNumber result();
}
