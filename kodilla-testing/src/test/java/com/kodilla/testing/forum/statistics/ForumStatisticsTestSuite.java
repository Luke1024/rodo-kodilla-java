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

        //expected values
        int usersCount = 42;
        int postsCount = 0;
        int commentsCount = 0;
        double postAvgPerUser = 0;
        double commentsAvgPerUser = 0;
        double commentsAvgPerPost = 0;

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

        Assert.assertEquals(usersCount, forumStat.getUsersCount());
        Assert.assertEquals(postsCount, forumStat.getPostsCount());
        Assert.assertEquals(commentsCount, forumStat.getCommentsCount());
        Assert.assertEquals(postAvgPerUser, forumStat.getPostAvgPerUser(), 0.01);
        Assert.assertEquals(commentsAvgPerUser, forumStat.getCommentsAvgPerUser(), 0.01);
        Assert.assertEquals(commentsAvgPerPost, forumStat.getCommentsAvgPerPost(), 0.01);
        forumStat.showStatistics();
    }
    @Test
    public void testCase1000Post(){
        Statistics statisticsMock = mock(Statistics.class);

        //expected values
        int usersCount = 15;
        int postsCount = 1000;
        int commentsCount = 2300;
        double postAvgPerUser = 66.66 ;
        double commentsAvgPerUser = 153.33;
        double commentsAvgPerPost = 2.3;

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

        Assert.assertEquals(usersCount, forumStat.getUsersCount());
        Assert.assertEquals(postsCount, forumStat.getPostsCount());
        Assert.assertEquals(commentsCount, forumStat.getCommentsCount());
        Assert.assertEquals(postAvgPerUser, forumStat.getPostAvgPerUser(), 0.01);
        Assert.assertEquals(commentsAvgPerUser, forumStat.getCommentsAvgPerUser(), 0.01);
        Assert.assertEquals(commentsAvgPerPost, forumStat.getCommentsAvgPerPost(), 0.01);
        forumStat.showStatistics();
    }
    @Test
    public void testCaseNoComments(){
        Statistics statisticsMock = mock(Statistics.class);


        //expected values
        int usersCount = 15;
        int postsCount = 1000;
        int commentsCount = 0;
        double postAvgPerUser = 66.66 ;
        double commentsAvgPerUser = 0;
        double commentsAvgPerPost = 0;

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

        Assert.assertEquals(usersCount, forumStat.getUsersCount());
        Assert.assertEquals(postsCount, forumStat.getPostsCount());
        Assert.assertEquals(commentsCount, forumStat.getCommentsCount());
        Assert.assertEquals(postAvgPerUser, forumStat.getPostAvgPerUser(), 0.01);
        Assert.assertEquals(commentsAvgPerUser, forumStat.getCommentsAvgPerUser(), 0.01);
        Assert.assertEquals(commentsAvgPerPost, forumStat.getCommentsAvgPerPost(), 0.01);
        forumStat.showStatistics();
    }
    @Test
    public void testCaseMorePostsThanComments(){
        Statistics statisticsMock = mock(Statistics.class);

        //expected values
        int usersCount = 15;
        int postsCount = 1000;
        int commentsCount = 650;
        double postAvgPerUser = 66.66 ;
        double commentsAvgPerUser = 43.33;
        double commentsAvgPerPost = 0.65;

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

        Assert.assertEquals(usersCount, forumStat.getUsersCount());
        Assert.assertEquals(postsCount, forumStat.getPostsCount());
        Assert.assertEquals(commentsCount, forumStat.getCommentsCount());
        Assert.assertEquals(postAvgPerUser, forumStat.getPostAvgPerUser(), 0.01);
        Assert.assertEquals(commentsAvgPerUser, forumStat.getCommentsAvgPerUser(), 0.01);
        Assert.assertEquals(commentsAvgPerPost, forumStat.getCommentsAvgPerPost(), 0.01);
        forumStat.showStatistics();
    }
    @Test
    public void testCaseMoreCommentsThanPosts(){
        Statistics statisticsMock = mock(Statistics.class);

        //expected values
        int usersCount = 456;
        int postsCount = 5465;
        int commentsCount = 12304;
        double postAvgPerUser = 11.98 ;
        double commentsAvgPerUser = 26.98;
        double commentsAvgPerPost = 2.25;

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

        Assert.assertEquals(usersCount, forumStat.getUsersCount());
        Assert.assertEquals(postsCount, forumStat.getPostsCount());
        Assert.assertEquals(commentsCount, forumStat.getCommentsCount());
        Assert.assertEquals(postAvgPerUser, forumStat.getPostAvgPerUser(), 0.01);
        Assert.assertEquals(commentsAvgPerUser, forumStat.getCommentsAvgPerUser(), 0.01);
        Assert.assertEquals(commentsAvgPerPost, forumStat.getCommentsAvgPerPost(), 0.01);
        forumStat.showStatistics();
    }
    @Test
    public void testCaseNoUsers(){
        Statistics statisticsMock = mock(Statistics.class);

        //expected values
        int usersCount = 0;
        int postsCount = 0;
        int commentsCount = 0;
        double postAvgPerUser = 0;
        double commentsAvgPerUser = 0;
        double commentsAvgPerPost = 0;

        List<String> users = new ArrayList<>();
        for(int u=0; u<usersCount; u++){
            users.add("John");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        ForumStatistics forumStat = new ForumStatistics(statisticsMock);
        forumStat.calculateAdvStatistics();

        System.out.println("Testing case: no customers");

        Assert.assertEquals(usersCount, forumStat.getUsersCount());
        Assert.assertEquals(postsCount, forumStat.getPostsCount());
        Assert.assertEquals(commentsCount, forumStat.getCommentsCount());
        Assert.assertEquals(postAvgPerUser, forumStat.getPostAvgPerUser(), 0.01);
        Assert.assertEquals(commentsAvgPerUser, forumStat.getCommentsAvgPerUser(), 0.01);
        Assert.assertEquals(commentsAvgPerPost, forumStat.getCommentsAvgPerPost(), 0.01);
        forumStat.showStatistics();
    }
    @Test
    public void testCase100Users(){
        Statistics statisticsMock = mock(Statistics.class);

        //expected values
        int usersCount = 100;
        int postsCount = 525;
        int commentsCount = 640;
        double postAvgPerUser = 5.25 ;
        double commentsAvgPerUser = 6.4;
        double commentsAvgPerPost = 1.21;

        List<String> users = new ArrayList<>();
        for(int u=0; u<usersCount; u++){
            users.add("John");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        ForumStatistics forumStat = new ForumStatistics(statisticsMock);
        forumStat.calculateAdvStatistics();

        System.out.println("Testing case: 100 customers");

        Assert.assertEquals(usersCount, forumStat.getUsersCount());
        Assert.assertEquals(postsCount, forumStat.getPostsCount());
        Assert.assertEquals(commentsCount, forumStat.getCommentsCount());
        Assert.assertEquals(postAvgPerUser, forumStat.getPostAvgPerUser(), 0.01);
        Assert.assertEquals(commentsAvgPerUser, forumStat.getCommentsAvgPerUser(), 0.01);
        Assert.assertEquals(commentsAvgPerPost, forumStat.getCommentsAvgPerPost(), 0.01);
        forumStat.showStatistics();
    }
}
