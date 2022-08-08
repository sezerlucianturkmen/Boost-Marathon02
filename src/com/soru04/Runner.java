package com.soru04;

import com.soru04.repository.entity.Kiralama;
import com.soru04.repository.entity.Kitap;
import com.soru04.repository.entity.Musteri;
import com.soru04.utility.DataBase;

public class Runner {

	public static void main(String[] args) {

		Kitap kitap01 = new Kitap("Harry Potter", "J. K. Rowling", "2000");
		DataBase.kitapListesi.add(kitap01);
		Kitap kitap02 = new Kitap("Acımak", "Reşat Nuri Gültekin", "1900");
		DataBase.kitapListesi.add(kitap02);
		Kitap kitap03 = new Kitap("Yol", "Metin Hara", "2010");
		DataBase.kitapListesi.add(kitap03);
		Kitap kitap04 = new Kitap("Tours Papazı", "Balzac", "1940");
		DataBase.kitapListesi.add(kitap04);

		Musteri musteri01 = new Musteri("Ahmet", "Yılmaz", 30);
		DataBase.musteriListesi.add(musteri01);
		Musteri musteri02 = new Musteri("Enime", "Taş", 20);
		DataBase.musteriListesi.add(musteri02);

		Kiralama kiralama = new Kiralama();
		kiralama.kitapKirala(kitap01, musteri01);
		System.out.println(kiralama.kiralananKitaplarListesi());

	}

}
