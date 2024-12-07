package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculatesAreaCorrectly() {
        Rectangle rect = new Rectangle(6, 7);
        assertEquals(42, rect.getArea());
    }

    @Test
    void calculatesPerimeterCorrectly() {
        Rectangle rect = new Rectangle(6, 7);
        assertEquals(26, rect.getPerimeter());
    }

    @Test
    void assignsColorCorrectly() {
        Color color = new Color(255, 0, 255);
        Rectangle rect = new Rectangle(6, 7, color);
        assertEquals(color, rect.color);
    }
}
