package com.kodilla.testing.forum.statistics;

import java.util.HashMap;
import java.util.List;

public class ForumStatistics
{
    Statistics statistics;

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double postAvgPerUser;
    private double commentsAvgPerUser;
    private double commentsAvgPerPost;

    public ForumStatistics(Statistics statistics){
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(){
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if(usersCount>0){
            postAvgPerUser = Double.valueOf(postsCount)/usersCount;
            commentsAvgPerUser = Double.valueOf(commentsCount)/usersCount;
        }else{
            postAvgPerUser = 0;
            postsCount = 0;
        }
        if(postsCount>0){
            commentsAvgPerPost = Double.valueOf(commentsCount)/postsCount;
        }else{
            commentsAvgPerPost = 0;
        }
    }

    public void showStatistics(){
        System.out.println("Number of users: " + usersCount);
        System.out.println("Number of posts: " + postsCount);
        System.out.println("Number of comments: " + commentsCount);
        System.out.println("Average number of posts per user: " + postAvgPerUser);
        System.out.println("Average number of comments per user: " + commentsAvgPerUser);
        System.out.println("Average number of comments per post: " + commentsAvgPerPost);
    }

    //getters
    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostAvgPerUser() {
        return postAvgPerUser;
    }

    public double getCommentsAvgPerUser() {
        return commentsAvgPerUser;
    }

    public double getCommentsAvgPerPost() {
        return commentsAvgPerPost;
    }
}
