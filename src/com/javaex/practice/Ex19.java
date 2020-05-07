package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        final long light = 300000L;
        long lightDistance = light * 3600 * 24 * 365;
        System.out.println("빛이 1년 동안 가는 거리는 "+lightDistance+" km 입니다.");
    }
}
