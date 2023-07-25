package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        /* 스트림의 최종 연산 중 하나인 collect에 대해 이해하고 사용할 수 있다.
         * collect()는 Collector 타입을 받아서 처리하는데, 해당 메소드를 통해 컬렉션을 출력하고 받을 수 있다.
         * collect() 메소드는 Collector 객체에서 제공하는 정적 메소드를 사용할 수 있다.
         * */

        List<Member> memberList = Arrays.asList(
                new Member("test01", "testName01"),
                new Member("test02", "testName02"),
                new Member("test03", "testName03")
        );

        List<String> collectorCollection = memberList
                                            .stream()
                                            .map(Member::getMemberName)
                                            .collect(Collectors.toList());

        System.out.println("collectorCollection = " + collectorCollection);

        String str = memberList
                                            .stream()
                                            .map(Member::getMemberName)
                                            .collect(Collectors.joining());     //joining 가지고 있는 것을 합친다.

        System.out.println("str = " + str);


        String str2 = memberList
                .stream()
                .map(Member::getMemberName)
                .collect(Collectors.joining(" || ", "**", "**"));       //중간중간, 접두사, 접미사

        System.out.println("str2 = " + str2);


    }
}
