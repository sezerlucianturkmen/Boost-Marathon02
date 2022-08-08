package com.soru06;

import java.io.Serializable;

public class Log implements Serializable {

	private String hata;
	private Long time;
	private String className;
	private String methodName;

	public Log() {
		super();
	}

	public Log(String hata, Long time, String className, String methodName) {
		super();
		this.hata = hata;
		this.time = time;
		this.className = className;
		this.methodName = methodName;
	}

	public String getHata() {
		return hata;
	}

	public void setHata(String hata) {
		this.hata = hata;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	@Override
	public String toString() {
		return "Log [hata=" + hata + ", time=" + time + ", className=" + className + ", methodName=" + methodName + "]";
	}

}
