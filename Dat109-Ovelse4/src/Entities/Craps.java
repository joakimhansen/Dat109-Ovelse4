package Entities;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/



// line 1 "Test.ump"
public class Craps
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Craps Attributes
  private Spiller spiller;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Craps(Spiller aSpiller)
  {
    spiller = aSpiller;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setSpiller(Spiller aSpiller)
  {
    boolean wasSet = false;
    spiller = aSpiller;
    wasSet = true;
    return wasSet;
  }

  public Spiller getSpiller()
  {
    return spiller;
  }

  public void delete()
  {}

  // line 4 "Test.ump"
  public void spill(){
    
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "spiller" + "=" + (getSpiller() != null ? !getSpiller().equals(this)  ? getSpiller().toString().replaceAll("  ","    ") : "this" : "null");
  }
}