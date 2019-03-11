package com.stefanini;

import com.stefanini.model.Cachorro;

public class Main {

	public static void main(String[] args) {

		Cachorro pingo = new Cachorro("Pingo", 5);
		Cachorro shrek = new Cachorro("Shrek", 8);
		Cachorro apolo = new Cachorro("Apolo", 10);

		System.out.println(pingo.toString());
		pingo.latir();
		pingo.correr();

		System.out.println(shrek.toString());
		shrek.latir();
		shrek.correr();

		System.out.println(apolo.toString());
		apolo.latir();
		apolo.correr();

	}

}
