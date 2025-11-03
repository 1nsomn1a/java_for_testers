package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateTriangleArea(){
        Assertions.assertEquals(14.5, new Triangle(5.0, 8.0, 12.0).area(), 0.1);
    }

    @Test
    void canCalculateTrianglePerimeter(){
        Assertions.assertEquals(25.0, new Triangle(5.0, 8.0, 12.0).perimeter());
    }

    @Test
    void cannotCreateTriangleWithNegativeSide(){
        try {
            new Triangle(-5.0, 8.0, 12.0);
            System.out.println("Triangle created successfully");
        } catch (IllegalArgumentException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    void triangleCreateValidator(){
        try {
            new Triangle(3.0, 8.0, 12.0);
            System.out.println("Triangle created successfully");
        } catch (IllegalArgumentException exception) {
            exception.printStackTrace();
        }
    }
}
