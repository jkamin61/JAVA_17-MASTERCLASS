package org.example.generic_class_challenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Park park = new Park(33.121, 53.111, "park");

        Point point1 = new Point(53.121, 66.1212);
        Point point2 = new Point(13.121, 61.1212);
        Point point3 = new Point(63.121, 62.1212);

        List<Point> points = new ArrayList<>();

        points.add(point1);
        points.add(point2);
        points.add(point3);

        River river = new River(points, "river");

        List<Mappable> forLayer = new ArrayList<>();
        forLayer.add(river);
        forLayer.add(park);

        Layer<Mappable> layer = new Layer<>(forLayer);
        layer.renderLayer();
    }
}
