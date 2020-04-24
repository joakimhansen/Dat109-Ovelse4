package Entities;
/*PLEASE DO NOT EDIT THIS CODE*/

/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

// line 9 "Test.ump"
public class Spiller {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// Spiller Attributes
	private String navn;
	private Terning terning1;
	private Terning terning2;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public Spiller(String aNavn) {
		navn = aNavn;
		terning1 = new Terning();
		terning2 = new Terning();
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	// line 14 "Test.ump"
	public int trill() {
		terning1.trillTerning();
		terning2.trillTerning();
		System.out.println("1.Terning: " + terning1.getVerdi() + "\n2.Terning: " + terning2.getVerdi());
		return (terning1.getVerdi() + terning2.getVerdi());
	}

	public String getNavn() {
		return navn;
	}

}