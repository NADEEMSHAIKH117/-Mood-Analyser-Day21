package com.bridgeLabzTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgeLabz.MoodAnalyser;

public class MoodAnalyserTest {
	MoodAnalyser moodanalyser = new MoodAnalyser();
	@Test
	public void giveMessage_IsProper_ShouldReturnSad () {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String actualResult = moodAnalyser.analyseMood("I am in Sad Mood");
		assertEquals("Sad", actualResult);
	}
}
