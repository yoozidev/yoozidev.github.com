package com.uz;

public class VoClass {

	private String firstString;
	private String secondString;
	
	public VoClass() {}

	public VoClass(String firstString, String secondString) {
		super();
		this.firstString = firstString;
		this.secondString = secondString;
	}

	public String getFirstString() {
		return firstString;
	}

	public void setFirstString(String firstString) {
		this.firstString = firstString;
	}
	
	public String getSecondString() {
		return secondString;
	}

	public void setSecondString(String secondString) {
		this.secondString = secondString;
	}

	@Override
	public String toString() {
		return "VoClass [firstString=" + firstString + ", secondString=" + secondString + "]";
	}

	
	
	
}



