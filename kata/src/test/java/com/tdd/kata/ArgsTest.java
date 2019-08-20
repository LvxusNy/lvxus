package com.tdd.kata;

import org.junit.Assert;
import org.junit.Test;

public class ArgsTest {
    @Test
    public void args_test() {
        Args args = new Args();
        Assert.assertEquals(args.getValue(),"1");

    }
}
