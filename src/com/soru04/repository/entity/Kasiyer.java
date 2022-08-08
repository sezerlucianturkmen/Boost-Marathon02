package com.soru04.repository.entity;

public class Kasiyer extends Kullanıcı {

	private EDeneyim eDeneyim;

	public Kasiyer(String name, String surname, EDeneyim eDeneyim) {
		super(name, surname);
		this.eDeneyim = eDeneyim;
	}

	public EDeneyim geteDeneyim() {
		return eDeneyim;
	}

	public void seteDeneyim(EDeneyim eDeneyim) {
		this.eDeneyim = eDeneyim;
	}

	@Override
	public String toString() {
		return "Kasiyer [eDeneyim=" + eDeneyim + "]";
	}

}
