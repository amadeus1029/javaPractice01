package com.javaex.practice;

public class Ex07 {
    public static void main(String[] args) {
        int i = 10;
        int n = ++i%2; // i가 증가한 후 계산하므로 나머지는 1이 되며 i 역시 1 증가하여 11;

        System.out.println(i);
        System.out.println(n);
    }
}
