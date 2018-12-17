package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
        System.out.println();
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
    public void testCaseNoPost(){
        Statistics statisticsMock = mock(Statistics.class);

        int usersCount = 15;
        int postsCount = 0;
        int commentsCount = 0;
        double postAvgPerUser = Double.valueOf(postsCount)/usersCount;
        double commentsAvgPerUser = Double.valueOf(commentsCount)/usersCount;
        double commentsAvgPerPost = Double.valueOf(commentsCount)/postsCount;

        List<String> users = new ArrayList<>();
        for(int u=0; u<usersCount; u++){
            users.add("John");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        ForumStatistics forumStat = new ForumStatistics(statisticsMock);
        forumStat.calculateAdvStatistics();

        System.out.println("Testing case: no posts");

        Assert.assertEquals(usersCount, forumStat.usersCount);
        Assert.assertEquals(postsCount, forumStat.postsCount);
        Assert.assertEquals(commentsCount, forumStat.commentsCount);
        Assert.assertEquals(postAvgPerUser, forumStat.postAvgPerUser, 0.01);
        Assert.assertEquals(commentsAvgPerUser, forumStat.commentsAvgPerUser, 0.01);
        Assert.assertEquals(commentsAvgPerPost, forumStat.commentsAvgPerPost, 0.01);
        forumStat.showStatistics();
    }
    @Test
    public void testCase1000Post(){
        Statistics statisticsMock = mock(Statistics.class);

        int usersCount = 15;
        int postsCount = 1000;
        int commentsCount = 2300;
        double postAvgPerUser = Double.valueOf(postsCount)/usersCount;
        double commentsAvgPerUser = Double.valueOf(commentsCount)/usersCount;
        double commentsAvgPerPost = Double.valueOf(commentsCount)/postsCount;

        List<String> users = new ArrayList<>();
        for(int u=0; u<usersCount; u++){
            users.add("John");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        ForumStatistics forumStat = new ForumStatistics(statisticsMock);
        forumStat.calculateAdvStatistics();

        System.out.println("Testing case: 1000 posts");

        Assert.assertEquals(usersCount, forumStat.usersCount);
        Assert.assertEquals(postsCount, forumStat.postsCount);
        Assert.assertEquals(commentsCount, forumStat.commentsCount);
        Assert.assertEquals(postAvgPerUser, forumStat.postAvgPerUser, 0.01);
        Assert.assertEquals(commentsAvgPerUser, forumStat.commentsAvgPerUser, 0.01);
        Assert.assertEquals(commentsAvgPerPost, forumStat.commentsAvgPerPost, 0.01);
        forumStat.showStatistics();
    }
    @Test
    public void testCaseNoComments(){
        Statistics statisticsMock = mock(Statistics.class);

        int usersCount = 15;
        int postsCount = 10;
        int commentsCount = 0;
        double postAvgPerUser = Double.valueOf(postsCount)/usersCount;
        double commentsAvgPerUser = Double.valueOf(commentsCount)/usersCount;
        double commentsAvgPerPost = Double.valueOf(commentsCount)/postsCount;

        List<String> users = new ArrayList<>();
        for(int u=0; u<usersCount; u++){
            users.add("John");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        ForumStatistics forumStat = new ForumStatistics(statisticsMock);
        forumStat.calculateAdvStatistics();

        System.out.println("Testing case: no comments");

        Assert.assertEquals(usersCount, forumStat.usersCount);
        Assert.assertEquals(postsCount, forumStat.postsCount);
        Assert.assertEquals(commentsCount, forumStat.commentsCount);
        Assert.assertEquals(postAvgPerUser, forumStat.postAvgPerUser, 0.01);
        Assert.assertEquals(commentsAvgPerUser, forumStat.commentsAvgPerUser, 0.01);
        Assert.assertEquals(commentsAvgPerPost, forumStat.commentsAvgPerPost, 0.01);
        forumStat.showStatistics();
    }
    @Test
    public void testCaseMorePostsThanComments(){
        Statistics statisticsMock = mock(Statistics.class);

        int usersCount = 15;
        int postsCount = 500;
        int commentsCount = 10;
        double postAvgPerUser = Double.valueOf(postsCount)/usersCount;
        double commentsAvgPerUser = Double.valueOf(commentsCount)/usersCount;
        double commentsAvgPerPost = Double.valueOf(commentsCount)/postsCount;

        List<String> users = new ArrayList<>();
        for(int u=0; u<usersCount; u++){
            users.add("John");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        ForumStatistics forumStat = new ForumStatistics(statisticsMock);
        forumStat.calculateAdvStatistics();

        System.out.println("Testing case: more posts than comments");

        Assert.assertEquals(usersCount, forumStat.usersCount);
        Assert.assertEquals(postsCount, forumStat.postsCount);
        Assert.assertEquals(commentsCount, forumStat.commentsCount);
        Assert.assertEquals(postAvgPerUser, forumStat.postAvgPerUser, 0.01);
        Assert.assertEquals(commentsAvgPerUser, forumStat.commentsAvgPerUser, 0.01);
        Assert.assertEquals(commentsAvgPerPost, forumStat.commentsAvgPerPost, 0.01);
        forumStat.showStatistics();
    }
    @Test
    public void testCaseMoreCommentsThanPosts(){
        Statistics statisticsMock = mock(Statistics.class);

        int usersCount = 15;
        int postsCount = 3;
        int commentsCount = 10;
        double postAvgPerUser = Double.valueOf(postsCount)/usersCount;
        double commentsAvgPerUser = Double.valueOf(commentsCount)/usersCount;
        double commentsAvgPerPost = Double.valueOf(commentsCount)/postsCount;

        List<String> users = new ArrayList<>();
        for(int u=0; u<usersCount; u++){
            users.add("John");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        ForumStatistics forumStat = new ForumStatistics(statisticsMock);
        forumStat.calculateAdvStatistics();

        System.out.println("Testing case: more comments than posts");

        Assert.assertEquals(usersCount, forumStat.usersCount);
        Assert.assertEquals(postsCount, forumStat.postsCount);
        Assert.assertEquals(commentsCount, forumStat.commentsCount);
        Assert.assertEquals(postAvgPerUser, forumStat.postAvgPerUser, 0.01);
        Assert.assertEquals(commentsAvgPerUser, forumStat.commentsAvgPerUser, 0.01);
        Assert.assertEquals(commentsAvgPerPost, forumStat.commentsAvgPerPost, 0.01);
        forumStat.showStatistics();
    }
    @Test
    public void testCaseNoUsers(){
        Statistics statisticsMock = mock(Statistics.class);

        int usersCount = 0;
        int postsCount = 0;
        int commentsCount = 0;
        double postAvgPerUser = Double.valueOf(postsCount)/usersCount;
        double commentsAvgPerUser = Double.valueOf(commentsCount)/usersCount;
        double commentsAvgPerPost = Double.valueOf(commentsCount)/postsCount;

        List<String> users = new ArrayList<>();
        for(int u=0; u<usersCount; u++){
            users.add("John");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        ForumStatistics forumStat = new ForumStatistics(statisticsMock);
        forumStat.calculateAdvStatistics();

        System.out.println("Testing case: no users");

        Assert.assertEquals(usersCount, forumStat.usersCount);
        Assert.assertEquals(postsCount, forumStat.postsCount);
        Assert.assertEquals(commentsCount, forumStat.commentsCount);
        Assert.assertEquals(postAvgPerUser, forumStat.postAvgPerUser, 0.01);
        Assert.assertEquals(commentsAvgPerUser, forumStat.commentsAvgPerUser, 0.01);
        Assert.assertEquals(commentsAvgPerPost, forumStat.commentsAvgPerPost, 0.01);
        forumStat.showStatistics();
    }
    @Test
    public void testCase100Users(){
        Statistics statisticsMock = mock(Statistics.class);

        int usersCount = 100;
        int postsCount = 230;
        int commentsCount = 350;
        double postAvgPerUser = Double.valueOf(postsCount)/usersCount;
        double commentsAvgPerUser = Double.valueOf(commentsCount)/usersCount;
        double commentsAvgPerPost = Double.valueOf(commentsCount)/postsCount;

        List<String> users = new ArrayList<>();
        for(int u=0; u<usersCount; u++){
            users.add("John");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        ForumStatistics forumStat = new ForumStatistics(statisticsMock);
        forumStat.calculateAdvStatistics();

        System.out.println("Testing case: 100 users");

        Assert.assertEquals(usersCount, forumStat.usersCount);
        Assert.assertEquals(postsCount, forumStat.postsCount);
        Assert.assertEquals(commentsCount, forumStat.commentsCount);
        Assert.assertEquals(postAvgPerUser, forumStat.postAvgPerUser, 0.01);
        Assert.assertEquals(commentsAvgPerUser, forumStat.commentsAvgPerUser, 0.01);
        Assert.assertEquals(commentsAvgPerPost, forumStat.commentsAvgPerPost, 0.01);
        forumStat.showStatistics();
    }
}
