package com.soru04;

import com.soru04.repository.entity.Kitap;
import com.soru04.utility.DataBase;

public class Runner {

	public static void main(String[] args) {

		Kitap kitap01 = new Kitap("Harry Potter", "J. K. Rowling", "2000");
		DataBase.kitapListesi.add(kitap01);

		Kitap kitap02 = new Kitap("Acımak", "Reşat Nuri Gültekin", "1900");
		DataBase.kitapListesi.add(kitap02);

	}

}
