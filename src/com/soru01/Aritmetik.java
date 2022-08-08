package com.soru01;

import java.util.Scanner;

public class Aritmetik {

	Scanner scanner = new Scanner(System.in);
	String input;
	int sayi;

	public int askNumber() {
		int sayi;
		System.out.println("Lütfen Bir sayı giriniz");
		sayi = scanner.nextInt();
		return sayi;
	}

	public int select() {

		int select = 0;
		System.out.println("-----Calculator-----");
		System.out.println("1- Topla");
		System.out.println("2- Çıkar");
		System.out.println("3- Çarp");
		System.out.println("4- Böl");
		System.out.println("5- Alan");

		System.out.println("0- Çıkış");
		System.out.println("Bir işlem Seçiniz");
		select = scanner.nextInt();

		return select;
	}

	public void topla() {

		int toplam = 0;
		do {
			sayi = askNumber();
			toplam += sayi;
			System.out.println("Sayı eklemek için -ENTER- tuşuna basın..");
			System.out.println("İşlemi sonlandırmak için = tuşuna basın..");
			input = scanner.nextLine();
		} while (!input.equals("="));
		System.out.println("toplam=" + toplam);
	}

	public void cikar() {

		int count = 0;
		int fark = 0;
		do {
			sayi = askNumber();
			count++;

			if (count == 1) {
				fark = sayi;
			} else {
				fark -= sayi;
			}
			System.out.println("Sayı çıkartmak  -ENTER- tuşuna basın..");
			System.out.println("İşlemi sonlandırmak için = tuşuna basın..");

			input = scanner.nextLine();

		} while (!input.equals("="));
		System.out.println("toplam=" + fark);
	}

	public void carp() {

		int carpim = 1;

		do {
			sayi = askNumber();
			carpim *= sayi;
			System.out.println("Sayı çarpan eklemek için  -ENTER- tuşuna basın..");
			System.out.println("İşlemi sonlandırmak için = tuşuna basın..");

			input = scanner.nextLine();
		} while (!input.equals("="));
		System.out.println("carpim=" + carpim);
	}

	public void bolme() {

		int count = 0;
		int bolum = 0;
		do {

			sayi = askNumber();
			count++;
			scanner.nextLine();
			if (count == 1) {
				bolum = sayi;
			} else {
				bolum /= sayi;

			}
			System.out.println("Sayı bölen eklemek için  -ENTER- tuşuna basın..");
			System.out.println("İşlemi sonlandırmak için = tuşuna basın..");
			input = scanner.nextLine();

		} while (!input.equals("="));
		System.out.println("bolum=" + bolum);
	}

	public void alan() {
		double alan = 0;
		System.out.println("----Geometrik bir şekil Seçiniz----");
		System.out.println("1-Ucgen");
		System.out.println("2-Kare");
		System.out.println("3-Dikdortgen");

		int secim = scanner.nextInt();

		if (secim == 1) {

			System.out.println("Üçgenin taban boyut değeri için");
			double taban = askNumber();
			System.out.println("Üçgenin yükseklik değeri için");
			double yukseklik = askNumber();

			alan = taban * yukseklik / 2;
			System.out.println("alan=" + alan);
		} else if (secim == 2) {

			System.out.println("Kenar uzunlugu değeri için");
			double kenar = askNumber();

			alan = kenar * kenar;
			System.out.println("alan=" + alan);

		} else if (secim == 3) {

			System.out.println("Birinci uzunlugu değeri için");
			double kenar1 = askNumber();
			System.out.println("İkinici uzunlugu değeri için");
			double kenar2 = askNumber();

			alan = kenar1 * kenar2;
			System.out.println("alan=" + alan);
		} else {
			System.out.println("Lütfen doğru bir işlem girişi yapınız...");
		}

	}

}
