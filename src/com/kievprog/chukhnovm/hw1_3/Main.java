package com.kievprog.chukhnovm.hw1_3;

public class Main {

    public static void main(String[] args) {

        Vector3d v1 = new Vector3d(0,0,5);
        Vector3d v2 = new Vector3d(1,3,5);

        System.out.println(v1.sum(v2));
        System.out.println(v1.diff(v2));
        System.out.println(v1.dot(v2));
        System.out.println(v1.cross(v2));
    }
}
