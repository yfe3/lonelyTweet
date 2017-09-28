/*
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta. You can find a copy of this license in this project. Otherwise please contact yfeng3@ualberta.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * subclass for important tweets
 */
public class importantTweet extends Tweet{
    /**
     * constructs a important tweet with one parameter
     *
     * @param message
     */
    public importantTweet(String message){
        super(message);
    }

    /**
     * constructs a important tweet with two parameter
     *
     * @param message
     * @param date
     */
    public importantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    /**
     * a method that return true
     *
     * @return
     */
    public Boolean isImprotant(){
        return Boolean.TRUE;
    }
}

