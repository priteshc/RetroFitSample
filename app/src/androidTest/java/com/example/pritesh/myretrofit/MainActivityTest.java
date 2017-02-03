package com.example.pritesh.myretrofit;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

/**
 * Created by pritesh on 2/3/2017.
 */

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);
    }


    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }


   @SmallTest
    public void testtextView() {
        TextView textView = (TextView) getActivity().findViewById(R.id.textView);
        assertNotNull(textView);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
