package com.soru04.repository.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Kitap {

	private String id;
	private String kitapAdi;
	private String yazarAdi;
	private String yayinYili;
	private EstatusKiralama estatusKiralama;
	static List<Musteri> whoRentThisList = null;

	public Kitap(String kitapAdi, String yazarAdi, String yayinYili) {
		super();
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.yayinYili = yayinYili;
		this.id = UUID.randomUUID().toString();
		this.estatusKiralama = EstatusKiralama.AVAILABLE;
		this.whoRentThisList = new ArrayList<Musteri>();
	}

	public String getId() {
		return id;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public String getYayinYili() {
		return yayinYili;
	}

	public void setYayinYili(String yayinYili) {
		this.yayinYili = yayinYili;
	}

	public EstatusKiralama getEstatusKiralama() {
		return estatusKiralama;
	}

	public void setEstatusKiralama(EstatusKiralama estatusKiralama) {
		this.estatusKiralama = estatusKiralama;
	}

	public List<Musteri> getWhoRentThisList() {
		return whoRentThisList;
	}

	public void setWhoRentThisList(List<Musteri> whoRentThisList) {
		this.whoRentThisList = whoRentThisList;
	}

	@Override
	public String toString() {
		return "Kitap [id=" + id + ", kitapAdi=" + kitapAdi + ", yazarAdi=" + yazarAdi + ", yayinYili=" + yayinYili
				+ ", estatusKiralama=" + estatusKiralama + ", whoRentThisList=" + whoRentThisList + "]";
	}

}
