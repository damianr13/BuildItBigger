package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by robert_damian on 01.07.2018.
 */
@RunWith(AndroidJUnit4.class)
public class JokeRetrieverAsyncTaskTest {

    @Rule
    public ActivityTestRule mActivityRule =
            new ActivityTestRule(MainActivity.class);


    @Test
    public void testJokeRetrieving() {
        Context targetContext = InstrumentationRegistry.getTargetContext();
        Espresso.onView(ViewMatchers.withText(targetContext.getString(R.string.button_text)))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.tv_fun_holder))
                .check(ViewAssertions.matches(Matchers.not(ViewMatchers.withText(""))));
    }
}
