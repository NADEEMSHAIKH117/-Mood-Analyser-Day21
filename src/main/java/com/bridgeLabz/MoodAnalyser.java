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

	public String analyseMood(){
		try {	
			if (message.toLowerCase().contains("sad")) {
				return "Sad";
			} else {
				return "Happy";
			}
		} catch (NullPointerException e) {
			return "Exception Handled";
		}
	
	}
}
