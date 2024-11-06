package org.example;

public class Circle extends Shape {
    private double radius;

    // Constructeur pour initialiser le rayon
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implémentation de la méthode abstraite area() pour un cercle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
