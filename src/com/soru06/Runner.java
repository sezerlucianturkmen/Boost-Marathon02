package com.soru06;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.soru04.repository.entity.Kiralama;
import com.soru04.repository.entity.Kitap;
import com.soru04.repository.entity.Musteri;
import com.soru04.utility.DataBase;

public class Runner implements Serializable {

	public static void main(String[] args) {
		Kiralama kiralama = new Kiralama();

		Kitap kitap01 = new Kitap("Harry Potter", "J. K. Rowling", "2000");
		DataBase.kitapListesi.add(kitap01);

		Musteri musteri01 = new Musteri("Ahmet", "Yılmaz", 30);
		DataBase.musteriListesi.add(musteri01);
		Musteri musteri02 = new Musteri("Enime", "Taş", 20);
		DataBase.musteriListesi.add(musteri02);

		try {
			kiralama.kitapKirala(kitap01, musteri01);
			kiralama.kitapKirala(kitap01, musteri02);
		} catch (Exception e) {

			try {
				System.out.println(e.getMessage());
				FileOutputStream fl = new FileOutputStream("logText");
				ObjectOutputStream oj = new ObjectOutputStream(fl);
				oj.writeObject(new Log(e.getMessage(), System.currentTimeMillis(), "Runner", "main"));
				oj.close();
			} catch (Exception e2) {
				System.out.println("Beklenmeye bir sorun oluştu");
			}

		}

	}

}
