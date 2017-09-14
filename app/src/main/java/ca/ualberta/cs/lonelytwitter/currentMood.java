package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yfeng3 on 2017-09-13.
 */

public abstract class currentMood {
    private String mood;
    private Date date;

    public currentMood(String mood){
        date= new Date();
        this.mood = mood;
    }

    public currentMood(String mood, Date date){
        this.date = date;
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    }

    public void setMood(String mood){
        this.mood = mood;
    }
    public Date getDate(){
        return date;
    }
    public abstract Boolean ifHappy();
}
