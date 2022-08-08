package com.soru04.repository.entity;

import java.util.List;

public interface IKiralama {

	/**
	 * 
	 * @param kitap   kiralanacak kitap
	 * @param musteri hangi müşteri kiraliyor
	 */
	public void kitapKirala(Kitap kitap, Musteri musteri);

	public Kitap kitapAra(String stringID);

	public Musteri musteriAra(String stringID);

	public List<Kitap> kiralananKitaplarListesi();

}
