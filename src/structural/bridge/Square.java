package structural.bridge;

public class Square extends Shape {
    protected Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with " + color.fill() + " color");
    }
}
