package com.javaex.practice;

public class Ex09 {
    public static void main(String[] args) {
        double f = 80.0;
        System.out.println(5/9*(f-32.0)); // 5/9는 정수형 제한에 의해 0이 되므로 결과도 0일 것으로 예상
        System.out.println((double)5/(double)9*(f-32.0)); //따라서 이와 같이 실수형으로 고쳐준 후에 계산
    }
}
