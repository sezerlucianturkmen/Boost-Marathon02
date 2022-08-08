package com.soru01;

public class Runner {

	public static void main(String[] args) {
		Aritmetik aritmetik = new Aritmetik();

		int secim = 0;

		do {
			secim = aritmetik.select();

			switch (secim) {
			case 1 -> aritmetik.topla();
			case 2 -> aritmetik.cikar();
			case 3 -> aritmetik.carp();
			case 4 -> aritmetik.bolme();
			case 5 -> aritmetik.alan();

			case 0 -> System.out.println("Güle Güle ...");

			}

		} while (secim != 0);

	}

}
