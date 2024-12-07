package org.example;

import org.junit.jupiter.api.Test;

class ShapeRendererTest {

    @Test
    void rendersRectangle() {
        Rectangle rect = new Rectangle(8, 12);
        ShapeRenderer.render(rect);
    }

    @Test
    void rendersTriangle() {
        Triangle tri = new Triangle(7, 24, 25);
        ShapeRenderer.render(tri);
    }

    @Test
    void rendersColoredShape() {
        Rectangle rect = new Rectangle(6, 9, new Color(255, 100, 50, 0.9f));
        ShapeRenderer.render(rect);
    }
}
