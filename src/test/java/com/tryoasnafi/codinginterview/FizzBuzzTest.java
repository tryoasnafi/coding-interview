package com.tryoasnafi.codinginterview;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FizzBuzzTest {
    FizzBuzz fb = new FizzBuzz();

    @Test
    void testFizzBuzz() {
        List<String> result;

        result = fb.fizzBuzz(3);
        System.out.println(result);

        result = fb.fizzBuzz(5);
        System.out.println(result);

        result = fb.fizzBuzz(15);
        System.out.println(result);
    }
}
