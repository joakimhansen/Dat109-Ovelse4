package Entities;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/



// line 18 "Test.ump"
public class Terning
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Terning Attributes
  private int verdi;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Terning(int aVerdi)
  {
    verdi = aVerdi;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setVerdi(int aVerdi)
  {
    boolean wasSet = false;
    verdi = aVerdi;
    wasSet = true;
    return wasSet;
  }

  public int getVerdi()
  {
    return verdi;
  }

  public void delete()
  {}

  // line 20 "Test.ump"
  public void setVerdi(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "verdi" + ":" + getVerdi()+ "]";
  }
}