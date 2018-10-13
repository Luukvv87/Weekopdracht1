package Blackjack;

import java.util.Scanner;

public class BlackjackBackup {
static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welkom bij Blackjack!");
		System.out.println("Maak een keuze:");
		System.out.println();
		int keuze = 0;
		while (keuze != 2) {
			System.out.println("1. Spelen");
			System.out.println("2. Afsluiten");
			keuze = scanner.nextInt();
			
			switch(keuze) {
			case 1:
				spelen();
				break;
			case 2:
				afsluiten();
				break;
			default:
				System.out.println("Kies opnieuw");
			}
		}		
	}
	
	static void spelen() {
		System.out.println("De kaarten zijn geschud!");
		System.out.println();
		Kaartmaker kaart = new Kaartmaker();
		kaart.kaartMaken();
		System.out.println();
		System.out.println("Wil je nog een kaart, passen of stoppen?");
		int keuze = scanner.nextInt();
//		String van maken, k p q		
	}
	
	static void afsluiten() {
		System.out.println("Tot de volgende keer!");
	}

}
