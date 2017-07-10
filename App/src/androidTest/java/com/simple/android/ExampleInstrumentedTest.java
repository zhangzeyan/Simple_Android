package com.simple.android;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.simple.android.home.MainActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.simple.android", appContext.getPackageName());


//        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
    }
}

//@RunWith(RobolectricTestRunner.class)
//public class MyActivityTest {
//
//    @Test
//    public void clickingButton_shouldChangeResultsViewText() throws Exception {
//        MyActivity activity = Robolectric.setupActivity(MyActivity.class);
//
//        Button button = (Button) activity.findViewById(R.id.button);
//        TextView results = (TextView) activity.findViewById(R.id.results);
//
//        button.performClick();
//        assertThat(results.getText().toString()).isEqualTo("Robolectric Rocks!");
//    }
//}
