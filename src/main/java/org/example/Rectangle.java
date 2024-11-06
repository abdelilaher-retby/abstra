package org.example;

public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructeur pour initialiser la longueur et la largeur
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implémentation de la méthode abstraite area() pour un rectangle
    @Override
    public double area() {
        return length * width;
    }
}
