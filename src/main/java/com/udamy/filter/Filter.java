package com.udamy.filter;

import java.util.List;
public class Filter {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        printAllNumber(numbers);
        printEvenNumber(numbers);
    }
    private static boolean isEven(int number){
        return number%2==0;
    }
    private static void printAllNumber(List<Integer> numbers){
        numbers.stream()
                .forEach(System.out::println);
    }
    private static void printEvenNumber(List<Integer> numbers){
        numbers.stream()
                .filter(Filter::isEven)//filter를 사용할 클래스를 적어줘야 한다.
                .forEach(System.out::println);
    }
}
