package no.hvl.dat100.matriser;

public class Main {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] c = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		Matriser.skrivUt(a);
		Matriser.skrivUt(c);

		System.out.println(Matriser.tilStreng(a));
		System.out.println(Matriser.tilStreng(c));
	}
}
