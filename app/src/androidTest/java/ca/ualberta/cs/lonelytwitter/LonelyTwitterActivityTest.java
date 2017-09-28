/*
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta. You can find a copy of this license in this project. Otherwise please contact yfeng3@ualberta.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

/**
 * Created by wz on 14/09/15.
 *
 * a test for the tweet program, unmodified, from the original
 */
public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 {

    /**
     * a method to start the test
     */
    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    /**
     * exception handler
     *
     * @throws Exception
     */
    public void testStart() throws Exception {
        Activity activity = getActivity();

    }
}