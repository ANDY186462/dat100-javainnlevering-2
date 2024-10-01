package no.hvl.dat100.tabeller;

public class Main {

	public static void main(String[] args) {

		int[] tabell = { 1, 2, 3, 4, 5 };

		int tall = 5;

		if (Tabeller.finnesTall(tabell, tall)) {
			System.out.println(tall + " finnes i tabellen.");
		} else {
			System.out.println(tall + " finnes ikke i tabellen.");
		}

		int posisjon = Tabeller.posisjonTall(tabell, tall);

		if (posisjon != -1) {
			System.out.println("Tallet " + tall + " finnes på posisjon: " + posisjon);
		} else {
			System.out.println("Tallet " + tall + " finnes ikke i tabellen.");
		}

		int[] reversTabell = Tabeller.reverser(tabell);
		System.out.print("Reversert tabell: ");
		for (int r : reversTabell) {
			System.out.print(r + " ");
		}
		System.out.println();

		boolean sortert = Tabeller.erSortert(tabell);
		if (sortert) {
			System.out.println("Tabellen er sortert riktig.");
		} else {
			System.out.println("Tabellen er sortert feil.");
		}

		int[] tabell1 = { 1, 2, 3 };
		int[] tabell2 = { 4, 5, 6 };
		int[] resultat = Tabeller.settSammen(tabell1, tabell2);

		System.out.print("Sammensatt tabell: ");
		for (int t : resultat) {
			System.out.print(t + " ");
		}
		System.out.println();

		int[] tabell3 = { 8, 9, 10 };
		int[] tabell4 = { 11, 12, 13 };
		int[] resultat2 = Tabeller.settSammen(tabell3, tabell4);

		System.out.print("Sammensatt tabell 2: ");
		for (int t : resultat2) {
			System.out.print(t + " ");
		}
		System.out.println();
	}
}
