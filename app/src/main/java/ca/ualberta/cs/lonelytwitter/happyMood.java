/*
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta. You can find a copy of this license in this project. Otherwise please contact yfeng3@ualberta.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * subclass happy mood extents mood
 */
public class happyMood extends currentMood{
    /**
     * constructs a happy mood with one parameter
     *
     * @param mood
     */
    public happyMood(String mood){
        super(mood);
    }

    /**
     * constructs a happy mood with two parameter
     *
     * @param mood
     * @param date
     */
    public happyMood(String mood, Date date){
        super(mood, date);
    }

    @Override
    /**
     * a method return true
     *
     * @return
     */
    public Boolean ifHappy(){
        return Boolean.TRUE;
    }
}
