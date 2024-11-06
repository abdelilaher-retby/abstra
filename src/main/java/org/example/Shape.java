package org.example;

public abstract class Shape {
    // Méthode abstraite pour calculer l'aire
    public abstract double area();

    // Méthode pour afficher l'aire
    public void displayArea() {
        System.out.println("L'aire st : " + area());
    }
}
