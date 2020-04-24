package Entities;
/*PLEASE DO NOT EDIT THIS CODE*/

/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

// line 18 "Test.ump"
public class Terning {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// Terning Attributes
	private int verdi;

	private final int MAX = 6;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public Terning() {
		verdi = 1;
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	public int trillTerning() {
		verdi = (int) (Math.random() * MAX) + 1;
		return verdi;
	}

	public int getVerdi() {
		return verdi;
	}

}