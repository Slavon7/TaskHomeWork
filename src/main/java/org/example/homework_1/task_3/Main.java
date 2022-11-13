package org.example.homework_1.task_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer,String> shapes = new HashMap<Integer,String>();

        shape(shapes);
    }

    public static Map<Integer,String> shape(Map<Integer,String> shapes){

        Cube cube = new Cube();
        Sphere sphere = new Sphere();
        Cylinder cylinder = new Cylinder();

        shapes.put(cube.volume(), "Cube");
        shapes.put(sphere.volume(), "Sphere");
        shapes.put(cylinder.volume(), "Cylinder");

        shapes.entrySet().stream()
                .sorted(Map.Entry.<Integer,String>comparingByKey().reversed())
                .forEach(System.out::println); // или

        return shapes;
    }
}