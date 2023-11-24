package creational.prototype;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with side=" + side);
    }

    @Override
    public Cloneable clone() {
        return new Square(this.side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
