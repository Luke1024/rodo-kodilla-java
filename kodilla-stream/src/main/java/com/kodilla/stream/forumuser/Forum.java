package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1, "Daisy_1024", 'F', LocalDate.of(1992,6,21), 23));
        userList.add(new ForumUser(2, "Martin_095", 'M', LocalDate.of(1995,6,21), 0));
        userList.add(new ForumUser(3, "Tamrix24", 'F', LocalDate.of(1990,6,21), 234));
        userList.add(new ForumUser(4, "TomYY", 'M', LocalDate.of(1993,6,21), 543));
        userList.add(new ForumUser(5, "Gilfoyle", 'M', LocalDate.of(1985,6,21), 312));
    }

    public List<ForumUser> getUserList(){ return new ArrayList<>(userList); }
}
