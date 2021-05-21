package com.tryoasnafi.codinginterview;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        return fizzBuzzRecursive(result, n, 0);
    }

    private List<String> fizzBuzzRecursive(List<String> result, int n, int i) {
        if (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            }

            result.add(String.valueOf(i));

            return fizzBuzzRecursive(result, n, i + 1);
        }

        return result;
    }
}
