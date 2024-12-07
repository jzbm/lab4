package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void verifiesDefaultColorIsWhite() {
        Shape shape = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        assertEquals(new Color(255, 255, 255, 0), shape.color);
    }

    @Test
    void setsCustomColorCorrectly() {
        Shape shape = new Shape(new Color(120, 80, 90)) {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        assertEquals(new Color(120, 80, 90), shape.color);
    }

    @Test
    void ensuresPrintDoesNotThrowException() {
        Shape shape = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        assertDoesNotThrow(shape::print);
    }

    @Test
    void ensuresColorDescriptionDoesNotThrowException() {
        Shape shape = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        assertDoesNotThrow(shape::getColorDescription);
    }
}
