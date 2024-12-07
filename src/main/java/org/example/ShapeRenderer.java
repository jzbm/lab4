package org.example;

public class ShapeRenderer {
    public static void render(Shape shape) {
        System.out.println(getColorCode(shape.color));

        if (shape instanceof Rectangle) {
            renderRectangle((Rectangle) shape);
        } else if (shape instanceof Triangle) {
            renderTriangle((Triangle) shape);
        } else {
            System.out.println("Unknown shape");
        }

        System.out.println("\u001B[0m"); // Reset color
    }

    private static void renderRectangle(Rectangle rectangle) {
        int width = (int) rectangle.getWidth();
        int height = (int) rectangle.getHeight();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void renderTriangle(Triangle triangle) {
        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();

        double area = triangle.getArea();
        double base = Math.max(a, Math.max(b,c));
        int height = (int)Math.round((2*area) / base);

        for (int i = 1; i <= height; i++) {
            int stars = (int)Math.round((i*base)/height);
            System.out.println(" ".repeat(height - i) + "*".repeat(stars));
        }
    }

    public static String getColorCode(Color color){
        return String.format("\u001B[38;2;%d;%d;%dm", color.red(), color.green(), color.blue());
    }
}