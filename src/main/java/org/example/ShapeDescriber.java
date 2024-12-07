package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ShapeDescriber {
    private static final Logger logger = LoggerFactory.getLogger(ShapeDescriber.class);

    ShapeDescriber() {
    }

    public static void describe(Shape shape) {
        logger.info("lab4.Shape: {}", shape.getClass().getSimpleName());
        logger.info("lab4.Color: {}", shape.color.toString());
        logger.info("Area: {}", shape.getArea());
        logger.info("Perimeter: {}", shape.getPerimeter());
    }
}