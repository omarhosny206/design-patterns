package structural.bridge;

public class Triangle extends Shape {
    protected Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle with " + color.fill() + " color");
    }
}
