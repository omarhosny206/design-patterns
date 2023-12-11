package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(new Red());
        Shape triangle = new Triangle(new Green());

        square.draw();
        triangle.draw();
    }
}
