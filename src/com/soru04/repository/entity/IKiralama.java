package com.soru04.repository.entity;

import java.util.List;

public interface IKiralama {

	/**
	 * 
	 * @param kitap   kiralanacak kitap
	 * @param musteri hangi müşteri kiraliyor
	 */
	public void kitapKirala(Kitap kitap, Musteri musteri);

	/**
	 * 
	 * @param stringID aranan kitap ID si
	 * @return aranan kitap
	 */
	public Kitap kitapAra(String stringID);

	/**
	 * 
	 * @param stringID aranan Müsteri ID si
	 * @return aranan Müsteri
	 */
	public Musteri musteriAra(String stringID);

	/**
	 * 
	 * @return kira da bulunan kitapların listesini verir.
	 */
	public List<Kitap> kiralananKitaplarListesi();

}
