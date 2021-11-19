package com.bridgeLabz;
												
public class MoodAnalyser {
	private String message;
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public MoodAnalyser() {
		
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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
