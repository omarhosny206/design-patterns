package structural.composite.example01;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    private final String name;
    private List<Shape> shapes = new ArrayList<>();

    public Drawing(String name) {
        this.name = name;
    }

    public Drawing(String name, List<Shape> shapes) {
        this.name = name;
        addAll(shapes);
    }

    void add(Shape shape) {
        shapes.add(shape);
    }

    void addAll(List<Shape> shapes) {
        this.shapes.addAll(shapes);
    }

    void remove(Shape shape) {
        shapes.remove(shape);
    }

    void removeAll() {
        shapes.clear();
    }

    @Override
    public String getInfo() {
        List<String> shapesInfos = shapes.stream().map(shape -> shape.getInfo()).toList();
        return "Drawing (" + name + ") ==> " + shapesInfos;
    }
}
