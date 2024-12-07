package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeDAOTest {
    private SessionFactory sessionFactory;
    private ShapeDAO shapeDAO;

    @BeforeEach
    public void setUp() {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        shapeDAO = new ShapeDAO(sessionFactory);
    }

    @AfterEach
    public void tearDown() {
        shapeDAO.close();
    }

    @Test
    public void savesAndFindsRectangle() {
        Rectangle rectangle = new Rectangle(10.0, 15.0);
        shapeDAO.saveShape(rectangle);

        Shape retrievedShape = shapeDAO.getShapeById(Rectangle.class, rectangle.id);
        assertNotNull(retrievedShape);
        assertEquals(rectangle.getWidth(), ((Rectangle) retrievedShape).getWidth(), 0.01);
        assertEquals(rectangle.getHeight(), ((Rectangle) retrievedShape).getHeight(), 0.01);
    }

    @Test
    public void retrievesAllShapes() {
        Rectangle rectangle = new Rectangle(10.0, 15.0);
        Triangle triangle = new Triangle(7.0, 24.0, 25.0);
        shapeDAO.saveShape(rectangle);
        shapeDAO.saveShape(triangle);
        List<? extends Shape> rectangles = shapeDAO.getAllShapes(Rectangle.class);
        List<? extends Shape> triangles = shapeDAO.getAllShapes(Triangle.class);

    }

    @Test
    public void updatesRectangleWidth() {
        Rectangle rectangle = new Rectangle(10.0, 15.0);
        shapeDAO.saveShape(rectangle);

        rectangle = new Rectangle(12.0, 15.0);
        shapeDAO.updateShape(rectangle);

        Shape updatedShape = shapeDAO.getShapeById(Rectangle.class, rectangle.id);
        assertEquals(12.0, ((Rectangle) updatedShape).getWidth(), 0.01);
    }

    @Test
    public void removesRectangle() {
        Rectangle rectangle = new Rectangle(10.0, 15.0);
        shapeDAO.saveShape(rectangle);

        shapeDAO.deleteShape(rectangle);

        Shape deletedShape = shapeDAO.getShapeById(Rectangle.class, rectangle.id);
        assertNull(deletedShape);
    }
}
