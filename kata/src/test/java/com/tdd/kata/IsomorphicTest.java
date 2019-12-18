package com.tdd.kata;

import com.tdd.kata.isomorphic.Isomorphic;
import org.junit.Assert;
import org.junit.Test;

public class IsomorphicTest {
    @Test
    public void should_a_is_isomorphic_a() {
        Isomorphic one = new Isomorphic("a");
        Assert.assertEquals(one.isIsomorphic("a"), true);

    }

    @Test
    public void should_a_is_isomorphic_A(){
        Isomorphic one = new Isomorphic("a");
        Assert.assertEquals(one.isIsomorphic("A"),true);
    }

    @Test
    public void should_a_is_isomorphic_b(){
        Isomorphic one = new Isomorphic("a");
        Assert.assertEquals(one.isIsomorphic("b"),true);
    }
    @Test
    public void should_ab_is_isomorphic_bc(){
        Isomorphic one = new Isomorphic("ab");
        Assert.assertEquals(one.isIsomorphic("bc"),true);
    }

    @Test
    public void should_adca_is_not_isomorphic_bcad_test(){
        Isomorphic one = new Isomorphic("adca");
        Assert.assertEquals(one.isIsomorphic("bcad"),false);
    }

    @Test
    public void should_abcd_is_not_isomorphic_abc_test(){
        Isomorphic one = new Isomorphic("abcd");
        Assert.assertEquals(one.isIsomorphic("abc"),false);
    }

    @Test
    public void should_abcadne_is_isomorphic_abcafng_test(){
        Isomorphic one = new Isomorphic("abcadne");
        Assert.assertEquals(one.isIsomorphic("abcafng"),true);
    }
    @Test
    public void should_abcddne_is_not_isomorphic_abcdfng_test(){
        Isomorphic one = new Isomorphic("abcddne");
        Assert.assertEquals(one.isIsomorphic("abcdfng"),false);
    }
}
