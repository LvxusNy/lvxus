package com.tdd.kata;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
    @Test
    public void mars_rover_test() {
        MarsRover marsRover = new MarsRover("p 100:200 s:N");
        Assert.assertEquals(marsRover.getStatus(),"{100,200} N");
    }
}
