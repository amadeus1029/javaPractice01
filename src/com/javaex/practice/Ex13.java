package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        final double exchangeRate = 1230.95;
        Scanner money = new Scanner(System.in);
        System.out.print("환전할 원화를 입력하세요: ");
        int koreanMoney = money.nextInt();
        System.out.println("받으실 달러는 "+koreanMoney/exchangeRate);
        money.close();
    }
}
