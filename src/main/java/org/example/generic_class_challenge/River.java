package org.example.generic_class_challenge;

import java.util.List;

public class River extends Line {
    private String name;

    public River(List<Point> points, String name) {
        super(points);
        this.name = name;
    }

    @Override
    public void render() {
        System.out.print(name + ": ");
        super.render();
    }
}
