package com.soru04.repository.entity;

import java.util.List;

import com.soru04.utility.DataBase;

public class Kiralama implements IKiralama {

	@Override
	public void kitapKirala(Kitap kitap, Musteri musteri) {

		kitap.setEstatusKiralama(EstatusKiralama.RENT);
		musteri.whichBooksRent.add(kitap);
		DataBase.kiralanmisKitapListesi.put(kitap, musteri);
		System.out.println(musteri.getName() + " isimli müşteri " + kitap.getKitapAdi() + " isimli kitabı kiraladı.");

	}

	@Override
	public Kitap kitapAra(String stringID) {

		Kitap tempKitap = null;
		for (Kitap kitap : DataBase.kitapListesi) {

			if (kitap.getId() == stringID) {
				tempKitap = kitap;
			} else {
				System.out.println("Aradığınız " + stringID + " ID ile kayıtlı bir kitap bulunamıştır");
			}
		}
		return tempKitap;
	}

	@Override
	public Musteri musteriAra(String stringID) {
		Musteri tempMusteri = null;
		for (Musteri musteri : DataBase.musteriListesi) {

			if (musteri.getId() == stringID) {
				tempMusteri = musteri;
			} else {
				System.out.println("Aradığınız " + stringID + " ID ile kayıtlı bir müşteri bulunamıştır");
			}
		}
		return tempMusteri;

	}

	@Override
	public List<Kitap> kiralananKitaplarListesi() {
		return DataBase.kitapListesi.stream().filter(k -> k.getEstatusKiralama() == EstatusKiralama.RENT).toList();
	}

}
