package org.example.homework_1.task_3;

/**
 * @author Omenyuk Vyacheslav
 */
public class Sphere extends Shapes{
    /* A method that calculates the volume */
    public int volume() {
        return (int) ((4*Math.PI*Math.pow(R, 3))/3);
    }
}
