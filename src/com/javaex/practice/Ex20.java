package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner coinCount = new Scanner(System.in);
        System.out.print("500원 개수: ");
        int amount500 = coinCount.nextInt();
        System.out.print("100원 개수: ");
        int amount100 = coinCount.nextInt();
        System.out.print("50원 개수: ");
        int amount50 = coinCount.nextInt();
        System.out.print("10원 개수: ");
        int amount10 = coinCount.nextInt();
        System.out.println("동전의 총합은 "+(amount500*500+amount100*100+amount50*50+amount10*10)+" 원 입니다.");
        coinCount.close();
    }
}
