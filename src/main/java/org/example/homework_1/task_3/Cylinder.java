package org.example.homework_1.task_3;

/**
 * @author Omenyuk Vyacheslav
 */
public class Cylinder extends Shapes{
    /* A method that calculates the volume */
    public int volume(){
        return (int) (Math.PI*Math.pow(R, 2)*h);
    }
}
