package com.soru05;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.soru04.repository.entity.Kitap;
import com.soru04.repository.entity.Musteri;
import com.soru04.utility.DataBase;

public class EkIslemler {

	/**
	 * 
	 * @param kitap ID si giriniz
	 * @return Kitap şuan kim tarafından kiralanmış
	 */
	public Optional<Musteri> kimtarafindanKirada(String iDString) {
		Musteri musteri;
		musteri = DataBase.kiralanmisKitapListesi.entrySet().stream().filter(x -> x.getKey().getId().equals(iDString))
				.findFirst().get().getValue();
		System.out.println(musteri.getName() + " bu kitabi kiralamıştır.");
		return Optional.ofNullable(musteri);
	}

	/**
	 * 
	 * @param kitap ismi giriniz
	 * @return Bu kitabı kiralamış olan müşterilerin listesi
	 */
	public Optional<List<Musteri>> kimlerTarafindanKiralanmis(String string) {
		Optional<List<Musteri>> musteriList = DataBase.kitapListesi.stream().filter(k -> k.getKitapAdi().equals(string))
				.map(b -> b.getWhoRentThisList()).findFirst();
		return musteriList;
	}

	/**
	 * 
	 * @param Müşteri isminde aranacak olan değeri giriniz (Örnek: 'Ahm')
	 * @return Aranan niteliklere uygun olan müşterilerin listesini döner.
	 */
	public Optional<List<Musteri>> ismindeGecenMusteri(CharSequence string) {
		return Optional.ofNullable(DataBase.musteriListesi.stream().filter(m -> m.getName().contains(string)).toList());
	}

	/**
	 * 
	 * @param Bir müşteri ID si giriniz
	 * @return Bu müşterinin kiralamış olduğu kitaplar listesi
	 */
	public Optional<List<Kitap>> tarafindanKiralanmisKitaplar(String iDString) {

		List<Kitap> kitapList = DataBase.kitapListesi.stream()
				.filter(k -> k.getWhoRentThisList().contains(
						DataBase.musteriListesi.stream().filter(m -> m.getId().equals(iDString)).findAny().get()))
				.collect(Collectors.toList());

		return Optional.ofNullable(kitapList);
	}

}
