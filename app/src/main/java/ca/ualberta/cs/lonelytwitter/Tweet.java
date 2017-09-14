package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by YFENG3 on 2017-09-13.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    protected int i;


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
