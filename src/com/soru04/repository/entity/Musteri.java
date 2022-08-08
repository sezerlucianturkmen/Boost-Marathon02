package com.soru04.repository.entity;

import java.util.ArrayList;
import java.util.List;

public class Musteri extends Kullanici {

	private int age;
	List<Kitap> whichBooksRent;

	public Musteri(String name, String surname, int age) {
		super(name, surname);
		this.age = age;
		this.whichBooksRent = new ArrayList<Kitap>();

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Kitap> getWhichBooksRent() {
		return whichBooksRent;
	}

	public void setWhichBooksRent(List<Kitap> whichBooksRent) {
		this.whichBooksRent = whichBooksRent;
	}

	@Override
	public String toString() {
		return "Musteri [age=" + age + ", whichBooksRent=" + whichBooksRent + "]";
	}

}
