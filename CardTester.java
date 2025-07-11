/**
 * DO NOT CHANGE CODE IN FILE!! only changes allowed would be to
 * comment/uncomment code to help with debugging (see NOTEs below)
 **/

/**
 * Full tester program for Card class. Tests all required methods, plus
 * extra useful methods, in UML.
 *
 * NOTE: order of tests is purposeful, organized by suggested
 * implementation order of methods (ex: toString first, then setValue, etc.)
 * and later tests assume previous tests work (ex: equals needs getters to work).
 * See Algorithm below for details.
 *
 * @author Nery Chapeton-Lamas <nery@miracosta.edu>
 * @version 1.0
 */

public class CardTester {
	/*
	 TESTER ALGORITHM FOR CARD CLASS:
	 - test toString()
	 - test setValue()
	 	- valid data (data changes + return true)
	 	- invalid data (no data change + return false)
	 - test setSuit()
	 	- valid data (data changes + return true)
	 	- invalid data (no data change + return false)
	 - test setAll()
	 	- valid data (data changes + return true)
	 	- invalid data (no data change + return false)
	 - test Default Constructor
	 - test Full Constructor
	 	- valid data
	 	- invalid data (should shutdown program)
	 - test Copy Constructor
	 	- valid data
	 	- invalid data (null passed, should shutdown program)
	 - test getSuit()
	 - test getValue()
	 - test getPrintValue()
	 - test equals()
	 	- mismatching object on both instance vars (returns false)
	 	- mismatching object on value only (returns false)
		- mismatching object on suit only (returns false)
	 	- matching object, both instance vars the same (returns true)
	 - test getPrintCard() and printCard() //user driver in Main
	 */
	
	public static void main(String[] args) {
		//NOTE: Comment all method calls out and uncomment one at a time as you pass tests!

		// CardTester.testToString();

		// CardTester.testSetValue();

		// CardTester.testSetSuit();
		
		// CardTester.testSetAll();
		
		// - test Default Constructor (implement default constructor,
		//		then see toString() test to see if it passes)

		// CardTester.testFullConstructor();

		// CardTester.testCopyConstructor();

		// 	CardTester.testGetSuit();

		// 	CardTester.testGetValue();

		// CardTester.testGetPrintValue();

		CardTester.testEquals();

	// 	// - test getPrintCard() and printCard() //use driver in Main
	}


	// /*** TESTER HELPER METHODS ***/
	// //NOTE: Comment all out method definitions and uncomment one at a time as you pass tests!

	public static void testToString() {
		Card test = new Card();
		System.out.println("\n==============================================");
		System.out.println("TESTING toString() METHOD:\n");

		System.out.println("If no default constructor built, should get [0 ] and toString gives: ["
			+ test.toString() + "]. Know why?");
		System.out.println("Otherwise, the above should show the default value of: A " + Card.DEFAULT_SUIT);
	}


	// public static void testSetValue() {
	// 	boolean setterTest;
	// 	Card test = new Card();
	// 	System.out.println("\n==============================================");
	// 	System.out.println("TESTING setValue() METHOD:\n");

	// 	// - valid data (data changes + return true)
	// 	setterTest = test.setValue(2);
	// 	System.out.println("setValue should have changed value only to 2: " + test + ". Setter returned " + setterTest);

	// 	setterTest = test.setValue(10);
	// 	System.out.println("setValue should have changed value only to 10: " + test + ". Setter returned " + setterTest);

	// 	setterTest = test.setValue(11);
	// 	System.out.println("setValue should have changed value only to J: " + test + ". Setter returned " + setterTest);

	// 	setterTest = test.setValue(12);
	// 	System.out.println("setValue should have changed value only to Q: " + test + ". Setter returned " + setterTest);

	// 	setterTest = test.setValue(13);
	// 	System.out.println("setValue should have changed value only to K: " + test + ". Setter returned " + setterTest);

	// 	// // - invalid data (no data change + return false)
	// 	// setterTest = test.setValue(0);
	// 	// System.out.println("setValue should NOT have changed value from K: " + test + ". Setter returned " + setterTest);

	// 	// setterTest = test.setValue(14);
	// 	// System.out.println("setValue should NOT have changed value from K: " + test + ". Setter returned " + setterTest);
	// }


	// public static void testSetSuit() {
	// 	boolean setterTest;
	// 	Card test = new Card();
	// 	System.out.println("\n==============================================");
	// 	System.out.println("TESTING setSuit() METHOD:\n");

	// 	// - valid data (data changes + return true)
	// 	setterTest = test.setSuit(Card.DIAMOND);
	// 	System.out.println("setSuit should have changed suit only to " + Card.DIAMOND + ": " + test
	// 		+ ". Setter returned " + setterTest);

	// 	setterTest = test.setSuit(Card.CLUB);
	// 	System.out.println("setSuit should have changed suit only to " + Card.CLUB + ": " + test
	// 		+ ". Setter returned " + setterTest);

	// 	setterTest = test.setSuit(Card.SPADE);
	// 	System.out.println("setSuit should have changed suit only to " + Card.SPADE + ": " + test
	// 		+ ". Setter returned " + setterTest);

	// 	setterTest = test.setSuit(Card.HEART);
	// 	System.out.println("setSuit should have changed suit only to " + Card.HEART + ": " + test
	// 		+ ". Setter returned " + setterTest);

	// 	// // - invalid data (no data change + return false)
	// 	// setterTest = test.setSuit('H');
	// 	// System.out.println("setSuit should NOT have changed suit from " + Card.HEART + ": " + test
	// 	// 	+ ". Setter returned " + setterTest);

	// 	// setterTest = test.setSuit((char) 7);
	// 	// System.out.println("setSuit should NOT have changed suit from " + Card.HEART + ": " + test
	// 	// 	+ ". Setter returned " + setterTest);
	// }


	// public static void testSetAll() {
	// 	boolean setterTest;
	// 	Card test = new Card();
	// 	System.out.println("\n==============================================");
	// 	System.out.println("TESTING setAll() METHOD:\n");

	// 	// - valid data (data changes + return true)
	// 	setterTest = test.setAll(1, Card.DIAMOND);
	// 	System.out.println("setAll should have changed both to A " + Card.DIAMOND + ": " + test
	// 		+ ". Setter returned " + setterTest);

	// 	setterTest = test.setAll(3, Card.SPADE);
	// 	System.out.println("setAll should have changed both to 3 " + Card.SPADE + ": " + test
	// 		+ ". Setter returned " + setterTest);

	// 	setterTest = test.setAll(4, Card.HEART);
	// 	System.out.println("setAll should have changed both to 4 " + Card.HEART + ": " + test
	// 		+ ". Setter returned " + setterTest);

	// 	setterTest = test.setAll(5, Card.CLUB);
	// 	System.out.println("setAll should have changed both to 5 " + Card.CLUB + ": " + test
	// 		+ ". Setter returned " + setterTest);

	// 	// // - invalid data (no data change + return false)
	// 	// setterTest = test.setAll(15, '8');
	// 	// System.out.println("setAll should NOT have changed suit/value from last valid test: " + test
	// 	// 	+ ". Setter returned " + setterTest);

	// 	// setterTest = test.setAll(0, 'A');
	// 	// System.out.println("setAll should NOT have changed suit/value from last valid test: " + test
	// 	// 	+ ". Setter returned " + setterTest);

	// 	// setterTest = test.setAll(-1, '*');
	// 	// System.out.prin"setAll should NOT have changed suit/value from last valid test: " + test
	// 	// 	+ ". Setter returntln(ed " + setterTest);
	// }


	// public static void testFullConstructor() {
	// 	Card test = new Card();
	// 	System.out.println("\n==============================================");
	// 	System.out.println("TESTING Full Constructor METHOD:\n");

	// 	// - valid data
	// 	test = new Card(6, Card.DIAMOND);
	// 	System.out.println("Full constructor should have built card 6 " + Card.DIAMOND + ": " + test);

	// 	test = new Card(7, Card.HEART);
	// 	System.out.println("Full constructor should have built card 7 " + Card.HEART + ": " + test);

		// // - invalid data (should shutdown program)
		// test = new Card(17, Card.CLUB); //should shutdown program, test by uncommenting
		// test = new Card(11, '3'); //should shutdown program, test by uncommenting
		// test = new Card(17, '3'); //should shutdown program, test by uncommenting
	// }


	// public static void testCopyConstructor() {
	// 	Card original, copy;
	// 	System.out.println("\n==============================================");
	// 	System.out.println("TESTING Copy Constructor METHOD:\n");

	// 	// - valid data
	// 	original = new Card(5, Card.SPADE);
	// 	copy = new Card(original);
	// 	System.out.println("Copy constructor should have built card 5 " + Card.SPADE + ": " + copy);
	// 	System.out.println("Look the same? That's a good start! Need to make sure it's a deep copy!");

	// 	original.setAll(7, Card.DIAMOND);
	// 	System.out.println("Changed original object to 7 " + Card.DIAMOND + ". Did copy change too? " + copy);
	// 	System.out.println("Copy should have stayed as 5 " + Card.SPADE + " to be a deep copy!");
	// 	System.out.println("Why was this deep copy test of the instance variables unnecessary for this class?");

	// 	// - invalid data (null passed, should shutdown program)
	// 	//original = null;
	// 	//copy = new Card(original); //should shutdown program, test by uncommenting
	// }


	// public static void testGetSuit() {
	// 	Card test = new Card();
	// 	System.out.println("\n==============================================");
	// 	System.out.println("TESTING getSuit() METHOD:\n");

	// 	System.out.println("getSuit should be default suit " + Card.DEFAULT_SUIT + ": " + test.getSuit());

	// 	test.setAll(9, Card.SPADE);
	// 	System.out.println("Changed suit of card, getSuit should be " + Card.SPADE + ": " + test.getSuit());
	// }


	// public static void testGetValue() {
	// 	Card test = new Card();
	// 	System.out.println("\n==============================================");
	// 	System.out.println("TESTING getValue() METHOD:\n");

	// 	System.out.println("getValue should be default value " + Card.DEFAULT_VALUE + ": " + test.getValue());

	// 	test.setAll(8, Card.CLUB);
	// 	System.out.println("Changed value of card, getValue should be 8: " + test.getValue());
	// }

	
	// public static void testGetPrintValue() {
	// 	Card test = new Card();
	// 	System.out.println("\n==============================================");
	// 	System.out.println("TESTING getPrintValue() METHOD:\n");

	// 	//since there are only 13 values, simpler to just print all possibilities!
	// 	for(int i = 1; i <= 13; i++) {
	// 		test.setValue(i);

	// 		System.out.print( test.getPrintValue() + " ");
	// 	}
	// 	System.out.println("\n");
	// 	System.out.println("Above should have printed exactly like this:");
	// 	System.out.println("A 2 3 4 5 6 7 8 9 10 J Q K");
	// }


	public static void testEquals() {
		Card original = new Card(8, Card.HEART), test = new Card(5, Card.CLUB);
		System.out.println("\n==============================================");
		System.out.println("TESTING equals() METHOD:\n");

		//- mismatching object on both instance vars (returns false)
		System.out.println("Testing both instance variables don't match:");
		System.out.println("Are card " + original + " and card " + test + " the same? " + original.equals(test));

		//- mismatching object on value only (returns false)
		test.setAll(5, Card.HEART);
		System.out.println("Testing only values don't match:");
		System.out.println("Are card " + original + " and card " + test + " the same? " + original.equals(test));
		
		//- mismatching object on suit only (returns false)
		test.setAll(8, Card.DIAMOND);
		System.out.println("Testing only suits don't match:");
		System.out.println("Are card " + original + " and card " + test + " the same? " + original.equals(test));
		
		//- matching object, both instance vars the same (returns true
		test.setAll(8, Card.HEART);
		System.out.println("Testing both instance variables match:");
		System.out.println("Are card " + original + " and card " + test + " the same? " + original.equals(test));
	}

}