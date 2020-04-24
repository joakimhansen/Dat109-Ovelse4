package Entities;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/



// line 9 "Test.ump"
public class Spiller
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Spiller Attributes
  private String navn;
  private Terning terning;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Spiller(String aNavn, Terning aTerning)
  {
    navn = aNavn;
    terning = aTerning;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNavn(String aNavn)
  {
    boolean wasSet = false;
    navn = aNavn;
    wasSet = true;
    return wasSet;
  }

  public boolean setTerning(Terning aTerning)
  {
    boolean wasSet = false;
    terning = aTerning;
    wasSet = true;
    return wasSet;
  }

  public String getNavn()
  {
    return navn;
  }

  public Terning getTerning()
  {
    return terning;
  }

  public void delete()
  {}

  // line 14 "Test.ump"
  public int trill(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "navn" + ":" + getNavn()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "terning" + "=" + (getTerning() != null ? !getTerning().equals(this)  ? getTerning().toString().replaceAll("  ","    ") : "this" : "null");
  }
}