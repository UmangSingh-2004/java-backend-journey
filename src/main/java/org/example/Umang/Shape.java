package org.example.Umang;

public abstract class Shape {
    abstract public void area();
}

class Circle extends Shape{
    @Override
    public void area() {
        System.out.println("Circle area"+" "+5*6);
    }
}

class Rectangle extends Shape{
    @Override
    public void area() {
        System.out.println("Rectangle area"+" "+3.14*7*7);
    }
}

class Area{
    static void main() {
        Circle c = new Circle();
        c.area();
        Rectangle r = new Rectangle();
        r.area();
    }
}