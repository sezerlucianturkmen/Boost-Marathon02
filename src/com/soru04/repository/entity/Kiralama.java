package com.soru04.repository.entity;

import java.util.List;
import java.util.stream.Collectors;

import com.soru04.utility.DataBase;

public class Kiralama implements IKiralama {

	@Override
	public void kitapKirala(Kitap kitap, Musteri musteri) throws ExceptionKiralanmisKitap {

		if (kitap.getEstatusKiralama() == EstatusKiralama.RENT) {

			throw new ExceptionKiralanmisKitap("Bu kitap şuan kiralmış durumda, başkabir kitap seçiniz");

		} else {
			kitap.setEstatusKiralama(EstatusKiralama.RENT);
			kitap.whoRentThisList.add(musteri);
			DataBase.kiralanmisKitapListesi.put(kitap, musteri);
			System.out
					.println(musteri.getName() + " isimli müşteri " + kitap.getKitapAdi() + " isimli kitabı kiraladı.");
		}

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
		return DataBase.kitapListesi.stream().filter(k -> k.getEstatusKiralama() == EstatusKiralama.RENT)
				.collect(Collectors.toList());
	}

}
