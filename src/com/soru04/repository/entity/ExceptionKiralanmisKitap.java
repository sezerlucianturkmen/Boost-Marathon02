package com.soru04.repository.entity;

public class ExceptionKiralanmisKitap extends RuntimeException {

	String messageString;

	public ExceptionKiralanmisKitap(String messageString) {
		super();
		this.messageString = messageString;
	}

	public ExceptionKiralanmisKitap() {
		super();
	}

	public String getMessageString() {
		return messageString;
	}

	public void setMessageString(String messageString) {
		this.messageString = messageString;
	}

	@Override
	public String getMessage() {
		return messageString;
	}

}
