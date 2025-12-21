package org.example.generic_class_challenge;

public class Point implements Mappable {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render() {
        System.out.println("as Point: [" + this.x + ", " + this.y + "]");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
