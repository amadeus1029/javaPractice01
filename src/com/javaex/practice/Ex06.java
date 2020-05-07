package com.javaex.practice;

public class Ex06 {
    public static void main(String[] args) {
        int i = 10;
        int n = i++ %2; //i가 증가한 값은 계산식에서 반영되지 않으므로 그대로 0이 남을 것으로 예상 i는 11로 증가

        System.out.println(i);
        System.out.println(n);
    }
}
