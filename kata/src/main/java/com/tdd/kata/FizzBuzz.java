package com.tdd.kata;

public class FizzBuzz {
    private final int num;

    public FizzBuzz(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        if (this.num % 15 == 0) return "FizzBuzz";
        if (this.num % 5 == 0) return "Buzz";
        if (this.num % 3 == 0) return "Fizz";

        return this.num + "";
    }
}
