package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        final double mileToKm = 1.609;
        Scanner distance = new Scanner(System.in);
        System.out.print("마일을 입력하세요: ");
        double mile = distance.nextDouble();
        System.out.println(mile+"마일은 "+mile*mileToKm+"킬로미터 입니다.");

        distance.close();
    }
}
