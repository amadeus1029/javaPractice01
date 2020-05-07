package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner degree = new Scanner(System.in);
        System.out.print("화씨: ");
        int fdegree = degree.nextInt();
        System.out.println("화씨 "+(double)fdegree+"의 섭씨 온도는 "+((double)5/9*((double)fdegree-32))+" 입니다.");

        degree.close();
    }
}
