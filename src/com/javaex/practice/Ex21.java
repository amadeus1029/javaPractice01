package com.javaex.practice;

public class Ex21 {
    public static void main(String[] args) {
        int num = 10;
        for(int i=0;i<num;i++) {
            for(int b=1;b<num-i;b++) {
                System.out.print(" ");
            }
            for(int m=0;m<2*i+1;m++) {
                System.out.print("★");
            }
            System.out.println();
        }
    }
}
