/**
 * Driver program that creates standard 52-card deck (as Card array)
 * and prints out each card in deck.
 *
 * @author Nathan Tshishimbi
 * @version 07/10/2025
 */

public class Main {

	/* ALGORITHM
	*
	1. Generate 52 card deck into Card array
	- Instantiate card array of size 52
	- For each suit (4 kinds):
		- for each value (1-13, inclusive)
			- Create new card using current value and suit, add to array
			- Add to array
	2. Print deck (simple)
	- For each card in deck (52 cards)
		- If 13th card, print new line
		- Print current card
	*
	*/
	public static void main(String[] args) {
	/*** RUNNING TESTER ***/
	//uncomment line below to run CardTester:
	// CardTester.main(null);


	/*** TESTING FOR getPrintCard() METHOD ***/
	// Card test = new Card(1, Card.DIAMOND),
	// 	test2 = new Card(5, Card.HEART),
	// 	test3 = new Card(13, Card.DIAMOND),
	// 	test4 = new Card(10, Card.SPADE);
	
	// test.printCard();
	// System.out.println(test2.getprintCard());
	// System.out.println(test3.getprintCard());
	// System.out.println(test4.getprintCard());


		/*** DRIVER PROGRAM ***/
		//1. Generate 52 card deck into Card array
		Card[] deck = new Card[52];
		char[] suits = {Card.DIAMOND, Card.HEART, Card.SPADE, Card.CLUB}; // code started having issues here?

		// Nested for loop way to create each card instead of hard coding 1 by 1
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
			deck[i * 13 + j] = new Card(j + 1, suits[i]);
		}
	}


		//2. Print deck
		// Simple deck printing
		for (int i = 0; i < deck.length; i++) {
			if (i % 13 == 0 && i != 0) {
				System.out.println();
			}
			System.out.print(deck[i] + "\t");

			System.out.println();
		}

		// Hackerchallenge
		for (int i = 0; i < deck.length; i+= 13) {
			//get set of cards (row of size 13) and break each into parts based on newline char (each card has 5 parts)
			String[][] cardRow = new String[13][5]; // 2-D arrayy

			for (int card = 0; card < cardRow.length; card++) {
				cardRow[card] = deck[i+ card].getprintCard().split("\n");
			}

			//loop through each of the parts for the row of cards
			for (int j = 0; j < 5; j++) {
				for (String[] card : cardRow) {
					System.out.print(card[j] + " ");
				}
				System.out.println();
			}
		}
	}
}