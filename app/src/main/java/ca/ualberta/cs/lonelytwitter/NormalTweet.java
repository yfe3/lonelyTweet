package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by OnePunch on 2017-09-13.
 */

public class NormalTweet extends Tweet{
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImprotant() {
        return Boolean.FALSE;
    }
}
