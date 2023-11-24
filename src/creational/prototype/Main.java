package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle clonedCircle = (Circle) Client.clone(circle);
        System.out.println("Original circle: " + circle);
        System.out.println("Cloned circle: " + clonedCircle);

        Square square = new Square(5);
        Square clonedSquare = (Square) Client.clone(square);
        System.out.println("Original square: " + square);
        System.out.println("Cloned square: " + clonedSquare);
    }
}
