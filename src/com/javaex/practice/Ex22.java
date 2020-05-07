package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.print("계산할 금액을 입력하세요: ");
        int total = money.nextInt();
        int i = 50000;
        int amount;
        boolean firstNum = true;

        for(int j=0;j<8;j++) {
            amount = total/i;
            if(amount>0) {
                System.out.println(i+"원권 "+amount+"매");
            }
            total = total - (amount*i);
            if(firstNum) {
                i = i/5;
                firstNum = false;
            } else {
                i = i/2;
                firstNum = true;
            }
        }
        money.close(); 
    }
}
