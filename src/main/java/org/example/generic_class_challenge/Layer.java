package org.example.generic_class_challenge;

import java.util.List;

public class Layer<T extends Mappable> {
private final List<T> elements;

    public Layer(List<T> elements) {
        this.elements = elements;
    }

    public void renderLayer() {
        for (T element : this.elements) {
            element.render();
        }
    }
}
