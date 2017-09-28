/*
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta. You can find a copy of this license in this project. Otherwise please contact yfeng3@ualberta.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * class for mood objects
 *
 */
public abstract class currentMood {
    private String mood;
    private Date date;

    /**
     * constructs a mood object with one parameter
     *
     * @param mood
     */
    public currentMood(String mood){
        date= new Date();
        this.mood = mood;
    }

    /**
     * constructs a mood object with two parameter
     *
     * @param mood
     * @param date
     */
    public currentMood(String mood, Date date){
        this.date = date;
        this.mood = mood;
    }

    /**
     * method to get mood
     *
     * @return
     */
    public String getMood(){
        return mood;
    }

    /**
     * method to set mood
     *
     * @param mood
     */
    public void setMood(String mood){
        this.mood = mood;
    }

    /**
     * method to get date
     *
     * @return
     */
    public Date getDate(){
        return date;
    }

    /**
     * a method to check mood is happy or sad
     *
     * @return
     */
    public abstract Boolean ifHappy();
}
