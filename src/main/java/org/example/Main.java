package org.example;

public class Main {
    public static void main(String[] args) {
        // Créer une instance de Circle et afficher l'aire
        Shape circle = new Circle(0);
         circle.displayArea();

        // Créer une instance de Rectangle et afficher l'aire
        Shape rectangle = new Rectangle(4, 6);
        rectangle.displayArea();
    }
}
