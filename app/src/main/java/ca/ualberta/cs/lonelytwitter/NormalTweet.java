
/*
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta. You can find a copy of this license in this project. Otherwise please contact yfeng3@ualberta.ca.
 */


>>>>>>> elasticsearch
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * a normal tweet subclass
 */
public class NormalTweet extends Tweet{

    /**
     * constructor of normal tweet with one parameter
     * @param message
     */

public class NormalTweet extends Tweet {


    public NormalTweet(String message) {
        super(message);
    }


    /**
     * constructor for normal tweeet with two parameter
     * @param message
     * @param date
     */


    public NormalTweet(String message, Date date){
        super(message, date);
    }

    @Override

    /**
     * method that return False
     *
     * @return
     */
    public Boolean isImprotant() {

    public Boolean isImportant() {

        return Boolean.FALSE;
    }
}
