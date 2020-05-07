package com.javaex.practice;

public class Ex03 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int a = ++x * 2;
        int b = y++ * 2;
        System.out.println("a="+a); //증가 후 값을 반영하므로 4일것
        System.out.println("b="+b); //증가 전 값을 반영하므로 2일것
        System.out.println("x="+x); // 2
        System.out.println("y="+y); // 2
    }
}
