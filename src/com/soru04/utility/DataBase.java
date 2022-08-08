package com.soru04.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.soru04.repository.entity.Kitap;
import com.soru04.repository.entity.Musteri;

public class DataBase {

	public static List<Kitap> kitapListesi = new ArrayList<Kitap>();
	public static List<Musteri> musteriListesi = new ArrayList<Musteri>();
	public static Map<Kitap, Musteri> kiralanmisKitapListesi = new HashMap<>();

}
