package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        int[] numbers = {2,5,4,3,5,3,11,22,43,65,41,31,65,45,34,4,3,1,3,67};

        ArrayAVG avg = new ArrayAVG();

        Assert.assertEquals(22.85, avg.getAvg(numbers),0.01);
    }
}
