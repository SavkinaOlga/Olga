package org.example;

public class Ellipse extends Figure{
    private double maxAxis;//объявления переменной
    public  double minAxis;//объявление переменной

    public Ellipse(double maxAxis, double minAxis){
        this.maxAxis = maxAxis;
        this.minAxis = minAxis;
    }
    @Override
    public double getArea() {
        return Math.PI * maxAxis * minAxis;//вычисление площади
    }

    @Override
    public double gerPerimeter() {
        return 2 * Math.PI * Math.sqrt((maxAxis * maxAxis + minAxis * minAxis) / 2);//вычисление периметра
    }
}
