package com.tdd.kata;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
    @Test
    public void mars_rover_test() {
        Args args = new Args("p 100:200 s:N");
        Assert.assertEquals(args.getStatus(),"{100,200} N");
    }
}
