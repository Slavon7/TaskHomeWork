package org.example.homework_1.task_3;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Omenyuk Vyacheslav
 * JUnit-test for 3D figures
 */
class ShapesTest {
    @Test
    void shape() {
        Map<Integer,String> shapes = new HashMap<>();

        Cube cube = new Cube();
        Sphere sphere = new Sphere();
        Cylinder cylinder = new Cylinder();

        shapes.put(cube.volume(), "Cube");
        shapes.put(sphere.volume(), "Sphere");
        shapes.put(cylinder.volume(), "Cylinder");

        Map<Integer, String> result = new LinkedHashMap<>();
        result.put(512,"Cube");
        result.put(268,"Sphere");
        result.put(100,"Cylinder");

        assertEquals(result, Main.shape(shapes));
    }
}