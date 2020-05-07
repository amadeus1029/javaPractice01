package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scSalary = new Scanner(System.in);
        System.out.print("월급을 입력하세요: ");
        int scSalaryCount = scSalary.nextInt()*12*10;
        System.out.println("10년동안 최대 저축액은 "+scSalaryCount+"원 입니다.");

        scSalary.close();
    }
}
