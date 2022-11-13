package org.example.homework_1.task_3;

import java.util.*;

/**
 * @author Omenyuk Vyacheslav
 * A program that sorts geometric shapes by volume
 */
public class Main {
    public static void main(String[] args) {

        Map<Integer,String> shapes = new HashMap<Integer,String>();

        shape(shapes);
    }

    /*
    * A method that takes a Map and returns
    * a sorted collection of 3D shapes by volume
     */
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