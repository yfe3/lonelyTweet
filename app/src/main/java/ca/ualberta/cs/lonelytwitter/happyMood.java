package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yfeng3 on 2017-09-13.
 */

public class happyMood extends currentMood{
    public happyMood(String mood){
        super(mood);
    }
    public happyMood(String mood, Date date){
        super(mood, date);
    }

    @Override
    public Boolean ifHappy(){
        return Boolean.TRUE;
    }
}
