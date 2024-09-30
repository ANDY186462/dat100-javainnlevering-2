package no.hvl.dat100.tabeller;

import no.hvl.dat100.tabeller.Tabeller.TallSjekker;

public class Main {

	
	public static void main(String[] args) {
        
        int[] tabell = {1, 2, 3, 4, 5};
        int tall = 3;

        if (TallSjekker.finnesTall(tabell, tall)) {
            System.out.println(tall + " finnes i tabellen.");
        } else {
            System.out.println(tall + " finnes ikke i tabellen.");
        
}
}}