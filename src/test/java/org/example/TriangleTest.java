package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void calculatesCorrectArea() {
        Triangle tri = new Triangle(7, 24, 25);
        assertEquals(84, tri.getArea(), 0.001);
    }

    @Test
    void calculatesCorrectPerimeter() {
        Triangle tri = new Triangle(7, 24, 25);
        assertEquals(56, tri.getPerimeter());
    }

    @Test
    void setsCustomColorCorrectly() {
        Color color = new Color(255, 50, 50);
        Triangle tri = new Triangle(7, 24, 25, color);
        assertEquals(color, tri.color);
    }
}
