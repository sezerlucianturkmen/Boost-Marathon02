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
		return DataBase.kitapListesi.stream().filter(k -> k.getId().equals(stringID)).findAny().get();
	}

	@Override
	public Musteri musteriAra(String stringID) {
		return DataBase.musteriListesi.stream().filter(m -> m.getId().equals(stringID)).findAny().get();
	}

	@Override
	public List<Kitap> kiralananKitaplarListesi() {
		return DataBase.kitapListesi.stream().filter(k -> k.getEstatusKiralama() == EstatusKiralama.RENT).toList();
	}

}
