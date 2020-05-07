package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner circle = new Scanner(System.in);

        System.out.print("반지름을 입력하세요: ");
        double circleRadius = circle.nextDouble();
        System.out.println("원의 넓이는 " +circleRadius*circleRadius*pi);

        circle.close();

    }
}
