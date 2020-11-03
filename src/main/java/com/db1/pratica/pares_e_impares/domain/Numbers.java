package com.db1.pratica.pares_e_impares.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {

    private List<Long> numberList = new ArrayList<>();

    public Numbers() {
    }

    public Numbers(String[] numberList) {
        for (String number : numberList) {
            addNumber(Long.valueOf(number));
        }
    }

    public void addNumber(Long number) {
        numberList.add(number);
    }

    public List<Long> getSpecialOrder() {
        checkEmptyList();

        List<Long> specialOrderedNumbers = new ArrayList<>();

        specialOrderedNumbers.addAll(getOrderedEvenNumbers());
        specialOrderedNumbers.addAll(getReverseOrderedOddNumbers());

        return specialOrderedNumbers;
    }

    public List<Long> getOrderedEvenNumbers() {
        return numberList.stream()
                .filter(this::isEven)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Long> getReverseOrderedOddNumbers() {
        return numberList.stream()
                .filter(this::isOdd)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public boolean hasNumber(Long number) {
        return numberList.contains(number);
    }

    private boolean isEven(Long number) {
        return number % 2 == 0;
    }

    private boolean isOdd(Long number) {
        return number % 2 != 0;
    }

    private void checkEmptyList() {
        if (numberList.size() == 0) {
            System.out.println("A lista de números está vazia");
        }
    }
}
