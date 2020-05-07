package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner countCash = new Scanner(System.in);
        System.out.print("상품가격: ");
        int price = countCash.nextInt();
        System.out.print("받은돈: ");
        int paid = countCash.nextInt();
        System.out.println("==========================");
        System.out.println("받은돈: "+(double)paid);
        System.out.println("상품가격: "+(double)price);
        System.out.println("부가세: "+(double)price/10);
        System.out.print("잔액: "+((double)paid-(double)price));

        countCash.close();
    }
}
