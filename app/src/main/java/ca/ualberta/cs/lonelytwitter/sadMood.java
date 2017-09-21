package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by OnePunch on 2017-09-13.
 */

public class sadMood extends  currentMood{
    public sadMood(String mood) {
        super(mood);
    }

    public sadMood(String mood, Date date){
        super(mood, date);
    }

    @Override
    public Boolean ifHappy() {
        return Boolean.FALSE;
    }
}
