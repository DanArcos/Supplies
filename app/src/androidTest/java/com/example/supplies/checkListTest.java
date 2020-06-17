package com.example.supplies;

import android.provider.ContactsContract;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;


//Import JUnit Test Classes
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

//Import Android Test Classes
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isChecked;
import static androidx.test.espresso.matcher.ViewMatchers.isNotChecked;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class checkListTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void test_all_checkboxes() {
        onView(withId(R.id.checkbox_bison))
                .perform(click())
                .check(matches(isChecked()))
                .perform(click())
                .check(matches(isNotChecked()));

        onView(withId(R.id.checkbox_bear))
                .perform(click())
                .check(matches(isChecked()))
                .perform(click())
                .check(matches(isNotChecked()));

        onView(withId(R.id.checkbox_chipmunk))
                .perform(click())
                .check(matches(isChecked()))
                .perform(click())
                .check(matches(isNotChecked()));

        onView(withId(R.id.checkbox_kitters))
                .perform(click())
                .check(matches(isChecked()))
                .perform(click())
                .check(matches(isNotChecked()));

        onView(withId(R.id.checkbox_sleepy_sheepy))
                .perform(click())
                .check(matches(isChecked()))
                .perform(click())
                .check(matches(isNotChecked()));
    }
}
