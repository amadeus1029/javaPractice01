package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sphere = new Scanner(System.in);
        final double pi = 3.14;
        System.out.print("반지름: ");
        double radius = sphere.nextDouble();
        System.out.println("구의 부피는: "+((double)4/3*pi*radius*radius*radius)+" 입니다.");

        sphere.close();
    }
}
