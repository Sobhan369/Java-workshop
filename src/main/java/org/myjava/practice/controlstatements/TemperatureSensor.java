package org.myjava.practice.controlstatements;

import java.util.Scanner;

public class TemperatureSensor {
    public void temperature(double t1,double t2, double t3, double t4, double t5){
        if(t1 >= 28){
            System.out.println("t1 is high :"+t1);
        } else if (t2 >= 28) {
            System.out.println("t2 is high :"+ t2);
        }
        else if (t3 >= 28) {
            System.out.println("t2 is high :"+ t3);
        }
        else if (t4 >= 28) {
            System.out.println("t2 is high :"+ t4);
        }
        else if (t5 >= 28) {
            System.out.println("t2 is high :"+ t5);
        }
        else {
            System.out.println(" All are below 28 degrees");
        }
    }

    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        temperatureSensor.temperature(21,22,12,36,25);
    }
}
