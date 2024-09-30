package no.hvl.dat100.tabeller;

import no.hvl.dat100.tabeller.Tabeller.tallSjekker;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.println("[");
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i] + " ");
		}
		System.out.println("]");
	}

	// b)

	public static void main(String[] args) {

		int[] tabell = { 42, 67, 89 };

		String resultat = tilStreng(tabell);

		System.out.println(resultat);
	}

	public static String tilStreng(int[] tabell) {

		StringBuilder streng = new StringBuilder("[");

		for (int i = 0; i < tabell.length; i++) {

			streng.append(tabell[i]);

			if (i < tabell.length - 1) {

				streng.append(",");
			}
		}

		streng.append("]");

		return streng.toString();
	}

	// c)

	public static int summer(int[] tabell) {

		int[] heltall = { 1, 2, 3, 4, 5 };

		int total = summer(heltall);

		System.out.println("Summen av tallene i tabellen er: " + total);

		int sum = 0;

		for (int tall : tabell) {

			sum += tall;
		}

		System.out.println(sum);

		return sum;

	}

	// d)
	

		public static boolean finnesTall(int[] tabell, int tall) {

			for (int i = 0; i < tabell.length; i++) {

				if (tabell[i] == tall) {
					return true; // Tallet er funnet
				}
			}
			return false; // Finner ikkje tallet
		}

			
	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		for (int i = 0; i < tabell.length; i++) {

			if (tabell[i] == tall) {
				return i; 
			}
		}
		return -1; 
		
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		for (int i = 0; i < tabell.length; i++) {
		
	}return;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
