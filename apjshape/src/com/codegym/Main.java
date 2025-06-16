package com.codegym;
import com.codegym.Shape;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(7);


        Random rand = new Random();

        for (Shape shape : shapes) {
            System.out.println("\nTrước khi resize:");
            System.out.println(shape);

            double percent = rand.nextInt(100) + 1;
            System.out.printf("Resize với tỷ lệ: %.2f%%\n", percent);

            if (shape instanceof Resizeable) {
                ((Resizeable) shape).resize(percent);
            }

            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }

            System.out.println("Sau khi resize:");
            System.out.println(shape);
        }
    }
}
