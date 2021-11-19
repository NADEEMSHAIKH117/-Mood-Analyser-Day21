package com.bridgeLabz;
												
public class MoodAnalyser {
	
	public String analyseMood(String message) {
		if (message.toLowerCase().contains("sad")) {
			return "Sad";
		} else if(message.toLowerCase().contains("any")) {
			return "Happy";
			
		}else {
			return null;
		}
	}

}
