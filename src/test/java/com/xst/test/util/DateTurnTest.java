package com.xst.test.util;

import com.xst.util.DateTurn;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by jeff on 16/3/7.
 */
public class DateTurnTest {
    @Test
    public void testDateTurn() {
        long t = 1454320399000L;
        String test1 = DateTurn.Turn(t);
        Assert.assertEquals(test1, "很久以前");
    }
}
