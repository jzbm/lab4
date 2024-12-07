package org.example;

import org.junit.jupiter.api.Test;

class ShapeDescriberTest {

    @Test
    void describesRectangle() {
        ShapeDescriber describer = new ShapeDescriber();
        Rectangle rect = new Rectangle(10.0, 15.0, new Color(200, 150, 50, 0.85f));
        describer.describe(rect);
    }

    @Test
    void describesTriangle() {
        ShapeDescriber describer = new ShapeDescriber();
        Triangle tri = new Triangle(7.0, 24.0, 25.0, new Color(50, 50, 200, 0.7f));
        describer.describe(tri);
    }
}
