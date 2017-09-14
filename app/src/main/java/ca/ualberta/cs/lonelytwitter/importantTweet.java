package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by YFENG3 on 2017-09-13.
 */

public class importantTweet extends Tweet{
    public importantTweet(String message){
        super(message);
    }
    public importantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImprotant(){
        return Boolean.TRUE;
    }
}

