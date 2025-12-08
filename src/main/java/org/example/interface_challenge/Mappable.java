package org.example.interface_challenge;

enum Geometry {
    LINE, POINT, POLYGON
}

enum Color {
    BLACK, BLUE, GREEN, RED, ORANGE
}

enum LineMarker {
    DASHED, DOTTED, SOLID
}

enum PointMarker {
    CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE
}

public interface Mappable {
    String JSON_PROPERTY = """
            "properties":{%s}
            """;

    String getLabel();

    Geometry getShape();

    String getMarker();

    default String toJSON() {
        return """
                "type": "%s", "label": "%s", "marker": "%s"
                """.formatted(getShape(), getLabel(), getMarker());
    }

    static void map(Mappable mappable) {
        System.out.printf((JSON_PROPERTY) + "%n", mappable.toJSON());
    }
}
