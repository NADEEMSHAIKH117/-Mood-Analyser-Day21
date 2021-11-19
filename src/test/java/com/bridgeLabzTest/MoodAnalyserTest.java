package com.bridgeLabzTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgeLabz.MoodAnalyser;

public class MoodAnalyserTest {
	MoodAnalyser moodAnalyser = new MoodAnalyser();
	
	@Test
	public void giveMessage_IsProper_ShouldReturnSad() {
		moodAnalyser.setMessage("I am in Sad Mood");
		String actualResult = moodAnalyser.analyseMood();
		assertEquals("Sad", actualResult);
	}
	
	@Test
    public void givenMessage_IsProper_AndContain_Any_ShouldReturnHappy(){
        moodAnalyser.setMessage("I am in Any Mood");
        String actualResult = moodAnalyser.analyseMood();
        assertEquals("Happy", actualResult);
	}
}