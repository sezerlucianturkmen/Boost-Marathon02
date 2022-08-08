package com.soru04.repository.entity;

import java.util.UUID;

public class Kullanici {

	private String id;
	private String name;
	private String surname;

	public Kullanici(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.id = UUID.randomUUID().toString();
	}

	@Override
	public String toString() {
		return "Kullanıcı [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
