package arun.patterns.abstractpatterns;

public class Luxury extends Car
{
  public Luxury(Location location)
  {
    super(CarType.LUXURY, location);
    construct();
  }
 
  @Override
  protected void construct() {
    System.out.println("Building luxury car");

  }
}