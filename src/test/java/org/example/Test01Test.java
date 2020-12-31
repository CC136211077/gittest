package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test01Test {

    private Test01 test01;

    @Before
    public void setUp() throws Exception {
        test01 = new Test01();
    }

    @Test
    public void getInt() {
        int anInt = test01.getInt();
        Assert.assertEquals(1,anInt);
    }
}