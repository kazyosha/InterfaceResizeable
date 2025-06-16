package com.codegym;

public class Square extends Rectangle implements Colorable {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth(); //
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "with side = " + getSide() + ", area = " + getArea();
    }
}
