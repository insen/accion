package com.example.accion;

import android.content.Context;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.example.accion.HelloWorldActivityTest \
 * com.example.accion.tests/android.test.InstrumentationTestRunner
 */
public class HelloWorldActivityTest extends ActivityInstrumentationTestCase2<HelloWorldActivity> {

    public HelloWorldActivityTest() {
        super("com.example.accion", HelloWorldActivity.class);
    }

    public void testTrueIsTrue() {
        assertTrue("first test says true", true);
    }

//    public void testToCheckCI() {
//        assertTrue("first test says true", true);
//    }

    public void testWelcomeMessageIsOk() {
        HelloWorldActivity act = getActivity();
        assertNotNull(act);

        TextView main = (TextView)act.findViewById(R.id.welcome);
        assertNotNull(main);

        Context ctx = act.getBaseContext();
        CharSequence actual = main.getText();
        String expected = ctx.getString(R.string.welcome);
        assertEquals(expected, actual);
    }
}
