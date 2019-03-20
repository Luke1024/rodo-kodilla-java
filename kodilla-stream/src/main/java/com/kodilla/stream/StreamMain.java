package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> (LocalDate.now().getYear()-forumUser.getDateOfBirth().getYear())>20)
                .filter(forumUser -> forumUser.getPostCounter()>0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        mapOfUsers.entrySet().stream().map(entry -> "Key: " + entry.getKey() + ", user data: " + entry.getValue())
                .forEach(System.out::println);
    }
}