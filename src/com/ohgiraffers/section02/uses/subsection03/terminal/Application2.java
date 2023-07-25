package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application2 {

    public static void main(String[] args) {
        /* 스트림의 최종 연산 중 하나인 reduce에 대해 이해하고 사용할 수 있다. */

        OptionalInt reduceOneParam = IntStream.range(1, 4)
                .reduce((a, b) -> {          //reduce 누적해나가는 연산
                        System.out.println("a :" + a + ", b : " + b);
                    return Integer.sum(a, b);
                });

        System.out.println("reduceOneParam = " + reduceOneParam.getAsInt());

        /* reduce에 인자를 2개 전달 할 때는 첫번째 인자가 초기값으로 기능하며 reduce의 결과 값이 반드시 존재하므로
        * OptionalInt 타입이 아닌 int 타입이 반환 값으로 설정 되어 있다. */
        int reduceTwoParam = IntStream.range(1, 10)
                .reduce(100, Integer::sum);     //첫번째 인자는 초기값, 수행하고자하는 동작

        System.out.println("reduceTwoParam = " + reduceTwoParam);
    }
}
