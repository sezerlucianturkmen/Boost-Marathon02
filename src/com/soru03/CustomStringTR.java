package com.soru03;

public class CustomStringTR {

	String string;

	public int uzunluk() {

		return string.length();
	}

	public boolean iceriyormu(String kontrol) {

		return string.contains(kontrol);

	}

	public char indeksdekiDeger(int index) {

		return string.charAt(index);

	}

	public boolean ilemiBaslıyor(String baslangıc) {

		return string.startsWith(baslangıc);

	}

	public boolean ilemiBitiyor(String bitis) {

		return string.startsWith(bitis);

	}

	public int degerinIndeksiniBul(String deger) {

		return string.indexOf(deger);

	}

	public void bosluklariSil() {

		string.trim();
	}

	public String degerDegiştirme(String eskideger, String yeniDeger) {
		string = string.replace(eskideger, yeniDeger);
		return string;
	}

	public void degeriBolme(int index) {

		string.substring(index);

	}

	public void degeriBolme(int baslangıc, int bitis) {

		string.substring(baslangıc, bitis);

	}

}
