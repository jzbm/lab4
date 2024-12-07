package org.example;

import jakarta.persistence.*;

@MappedSuperclass
abstract public class Shape {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public Color color;
    Shape(Color color) {
        this.color = color;
    }
    Shape(){
        this.color = new Color(255,255,255,0);
    }

    public void print() {
        System.out.print(this.getClass().getSimpleName());
    }

    public void getColorDescription(){
        System.out.print(color.toString());
    };

    public abstract double getArea();

    public abstract double getPerimeter();
}