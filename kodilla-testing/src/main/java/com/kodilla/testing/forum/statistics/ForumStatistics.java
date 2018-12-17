package com.kodilla.testing.forum.statistics;

import java.util.HashMap;
import java.util.List;

public class ForumStatistics
{
    Statistics statistics;

    int usersCount;
    int postsCount;
    int commentsCount;
    double postAvgPerUser;
    double commentsAvgPerUser;
    double commentsAvgPerPost;

    public ForumStatistics(Statistics statistics){
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(){
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        postAvgPerUser = Double.valueOf(postsCount)/usersCount;
        commentsAvgPerUser = Double.valueOf(commentsCount)/usersCount;
        commentsAvgPerPost = Double.valueOf(commentsCount)/postsCount;
    }

    public void showStatistics(){
        System.out.println("Number of users: " + usersCount);
        System.out.println("Number of posts: " + postsCount);
        System.out.println("Number of comments: " + commentsCount);
        System.out.println("Average number of posts per user: " + postAvgPerUser);
        System.out.println("Average number of comments per user: " + commentsAvgPerUser);
        System.out.println("Average number of comments per post: " + commentsAvgPerPost);
    }
}
