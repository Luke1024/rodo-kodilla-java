package com.kodilla.testing.collection;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList blank = new ArrayList();
        System.out.println("Testing empty list.");
        Assert.assertEquals(blank, exterminator.exterminate(blank));
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList evenAndOdd = new ArrayList();
        ArrayList even = new ArrayList();
        for (int x=0; x<20; x++) {
            evenAndOdd.add(x);
            if (x % 2 == 0) {
                even.add(x);
            }
        }
        System.out.println("Testing list with even and odd numbers.");
        Assert.assertEquals(even, exterminator.exterminate(evenAndOdd));
    }
}
