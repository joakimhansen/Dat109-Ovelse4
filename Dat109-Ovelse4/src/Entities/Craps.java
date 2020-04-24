package Entities;
/*PLEASE DO NOT EDIT THIS CODE*/

import java.util.Scanner;

/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

// line 1 "Test.ump"
public class Craps {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// Craps Attributes
	private Spiller spiller;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public Craps(Spiller aSpiller) {
		spiller = aSpiller;
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	// line 4 "Test.ump"
	public void spill() {
		Scanner in = new Scanner(System.in);
		boolean spill = true;

		while (spill) {
			int terninger = spiller.trill();
			System.out.println("Sum: " + terninger);
			if ((terninger) == 7) {
				System.out.println(spiller.getNavn() + " har vunnet!");
			} else {
				System.out.println(spiller.getNavn() + " tapte!");
			}
			System.out.println("Spill på nytt? (j/n)");
			spill = (in.nextLine().toLowerCase().equals("j"));
			System.out.println("\n");
		}
		System.out.println("Avsluttet");
		in.close();

	}

}