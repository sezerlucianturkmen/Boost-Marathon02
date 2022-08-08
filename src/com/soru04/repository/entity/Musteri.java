package com.soru04.repository.entity;

public class Musteri extends Kullanici {

	private int age;

	public Musteri(String name, String surname, int age) {
		super(name, surname);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Musteri [age=" + age + "]";
	}

}
