package org.example;

public class Triangle extends Figure {
    private double a;//бъявление переменной а
    private double b;//объявление переменной b
    private double c;//объявление переменной с

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getArea() {
        double p = (a + b + c) / 2;//вычисление полупериметра
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));//вычисление площади
    }

    @Override
    public double gerPerimeter() {
        return a + b + c;//вычисление периметра
    }
}
