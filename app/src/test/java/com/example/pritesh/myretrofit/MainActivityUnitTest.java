package com.example.pritesh.myretrofit;

import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.TestCase;

/**
 * Created by pritesh on 2/3/2017.
 */

public class MainActivityUnitTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SmallTest
    public void testcheck() {
        MainActivity mainActivity = new MainActivity();
        boolean result = mainActivity.checker("Hellow world");
        assertEquals(true, result);
    }


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
