package com.codingblocks.codeup.match;

/**
 * Created by naman on 21/6/17.
 */

public class Match {

    private User user1;
    private User user2;

    public Match(User user1, User user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }
}
