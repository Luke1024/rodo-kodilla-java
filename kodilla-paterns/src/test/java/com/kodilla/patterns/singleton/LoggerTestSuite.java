package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLog() {
        Logger.getInstance().log("opening");
        Logger.getInstance().log("closing");

        Assert.assertEquals("closing", Logger.getInstance().getLastLog());
    }

    @Test
    public void testGetLog2() {
        Logger.getInstance().log("changing");
        Logger.getInstance().log("changing2");

        Assert.assertEquals("changing2", Logger.getInstance().getLastLog());
    }
}
