package com.ioet.pair;

import org.junit.Assert;
import org.junit.Test;

public class NumberToOrdinalTest {

    @Test
    public void itShouldPrint1st(){
        NumberUtility numberUtility = new NumberUtility();
        Assert.assertEquals("1st", numberUtility.getOrdinalRepresentation(1));
    }
}
