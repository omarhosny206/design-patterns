package structural.composite.example01;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Drawing drawing1 = new Drawing("drawing1", List.of(circle, rectangle));
        Drawing drawing2 = new Drawing("drawing2", List.of(drawing1, circle, circle));

        System.out.println(drawing1.getInfo());
        System.out.println(drawing2.getInfo());
    }
}
