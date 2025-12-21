package org.example.generic_class_challenge;

import java.util.HashMap;
import java.util.List;

public class Line implements Mappable {
    private final HashMap<Double, Double> lineLocations = new HashMap<>();

    public Line(List<Point> points) {
        for (Point p : points) {
            this.addLineLocations(p);
        }
    }

    @Override
    public void render() {
        System.out.print("as Line location data: ");
        for (var entry : lineLocations.entrySet()) {
            System.out.print("["+entry.getKey()+", "+entry.getValue()+"]");
        }
        System.out.println();
    }

    private void addLineLocations(Point point) {
        this.lineLocations.put(point.getX(), point.getY());
    }
}
