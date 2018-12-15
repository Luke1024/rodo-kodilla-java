package com.kodilla.testing.shape;
import org.junit. *;

public class ShapeCollectorTestSuite{
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
    public void testCaseAddingGettingFigure(){
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure(new Circle());
        shapes.addFigure(new Rectangle());
        shapes.addFigure(new Triangle());
        System.out.println("Testing adding and getting figures.");
        Assert.assertEquals(new Circle().getShapeName(), shapes.getFigure(0).getShapeName());
        Assert.assertEquals(new Rectangle().getShapeName(), shapes.getFigure(1).getShapeName());
        Assert.assertEquals(new Triangle().getShapeName(), shapes.getFigure(2).getShapeName());
    }
    @Test
    public void testCaseRemovingFigure(){
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure(new Circle());
        shapes.addFigure(new Rectangle());
        shapes.addFigure(new Triangle());
        System.out.println("Testing removing figures.");
        shapes.removeFigure(new Rectangle());
        Assert.assertEquals(new Triangle().getShapeName(), shapes.getFigure(1).getShapeName());
    }
    @Test
    public void testCaseGettingField(){
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure(new Circle());
        double circleField = 25.4;
        System.out.println("Testing getting fields.");
        Assert.assertTrue(shapes.getFigure(0).getField()==circleField);
    }
}