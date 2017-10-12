/*
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta. You can find a copy of this license in this project. Otherwise please contact yfeng3@ualberta.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by onepunch on 2017-10-11.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){};

    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public int getCount(){
        return tweets.size();

    }
}
