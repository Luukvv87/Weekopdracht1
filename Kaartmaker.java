package Blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Kaartmaker {
	String[] kleur = {"Harten", "Schoppen", "Klaver", "Ruiten"};
	String[] waarde = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "B", "V", "H", "A"};
	static ArrayList<Kaart> deck = new ArrayList<Kaart>();

	void kaartMaken() {
		for(int k = 0; k<4;k++) {
			for(int w = 0; w<13; w++) {
				Kaart kaart = new Kaart();
				kaart.kleur = kleur[k];
				kaart.waarde = waarde[w];
				deck.add(kaart);

			}
		}
		Collections.shuffle(deck);
		System.out.println(deck);
	}
	

}
