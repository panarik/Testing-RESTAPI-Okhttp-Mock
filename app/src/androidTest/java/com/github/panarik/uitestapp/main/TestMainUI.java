package com.github.panarik.uitestapp.main;

import com.github.panarik.uitestapp.R;
import com.github.panarik.uitestapp.TestBase;

import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class TestMainUI extends TestBase {

    @Test
    public void clickButtonHome(){
        onView(withId(R.id.navigation_home)).perform(click()).check(matches(isDisplayed()));
    }

    @Test
    public void clickButtonGet(){
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.button)).check(matches(isDisplayed()));
    }



}
