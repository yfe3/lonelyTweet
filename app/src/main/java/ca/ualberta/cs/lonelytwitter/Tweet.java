package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by YFENG3 on 2017-09-13.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private ArrayList<currentMood> moodList;
    protected int i;

    private currentMood happy = new happyMood("happy");
    private currentMood sad = new sadMood("sad");

    public Tweet(String message){
        date = new Date();
        this.message = message;
        moodList.add(happy);
        moodList.add(sad);

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
