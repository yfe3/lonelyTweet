package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by YFENG3 on 2017-09-13.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private List<currentMood> moodList;
    protected int i;

    private currentMood happy = new happyMood("happy");
    private currentMood sad = new sadMood("sad");

    public void setMood(currentMood mood){ // a method to add mood to tweet
        this.moodList.add(mood);
    }
    
    public Tweet(String message){
        date = new Date();
        this.message = message;


    }

    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;

    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() < 140 ){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }
    public Date getDate(){
        return date;
    }
    public abstract Boolean isImprotant();
}
