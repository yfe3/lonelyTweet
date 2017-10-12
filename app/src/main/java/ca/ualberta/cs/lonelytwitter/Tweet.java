
/*
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta. You can find a copy of this license in this project. Otherwise please contact yfeng3@ualberta.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import io.searchbox.annotations.JestId;

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    @JestId
    private String id;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    @Override
    public String toString(){
        return message;
    }

    public abstract Boolean isImportant();

    public String getId(){return id;}
    public void setId(String id){this.id = id;}


    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }


    public void setDate(Date date) {
        this.date = date;
    }



//    public currentMood getHappy() {
//        public String toString()+ "|" + message
//    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

}
