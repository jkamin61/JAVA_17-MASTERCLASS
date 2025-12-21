package org.example.generic_class_challenge;

public class Park extends Point {
    private String name;

    public Park(double x, double y, String name) {
        super(x, y);
        this.name = name;
    }

    @Override
    public void render() {
        System.out.print(name+": ");
        super.render();
    }
}
