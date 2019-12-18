package com.tdd.kata;

import org.junit.Assert;
import org.junit.Test;
public class FizzBuzzTest {

    @Test
    public void should_3_is_Fizz_test() {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        Assert.assertEquals(fizzBuzz.toString(),"Fizz");
    }
    @Test
    public void should_5_is_buzz_test(){
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        Assert.assertEquals(fizzBuzz.toString(),"Buzz");
    }
    @Test
    public void should_15_is_Fizz_Buzz_test(){
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        Assert.assertEquals(fizzBuzz.toString(),"FizzBuzz");
    }
    @Test
    public void should_others_is_themself_test(){
        FizzBuzz fizzBuzz = new FizzBuzz(14);
        Assert.assertEquals(fizzBuzz.toString(),"14");
    }
    @Test
    public void normal_test(){
        FizzBuzz fizzBuzz_65 = new FizzBuzz(65);
        FizzBuzz fizzBuzz_75 = new FizzBuzz(75);
        Assert.assertEquals(fizzBuzz_65.toString(),"Buzz");
        Assert.assertEquals(fizzBuzz_75.toString(),"FizzBuzz");
    }


}
