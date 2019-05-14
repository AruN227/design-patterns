package arun.patterns.abstractpatterns;

public class USACarFactory
{
  public static Car buildCar(CarType model)
  {
    Car car = null;
    switch (model)
    {
      case SMALL:
      car = new SmallCar(Location.USA);
      break;
 
      case SEDAN:
      car = new SedanCar(Location.USA);
      break;
 
      case LUXURY:
      car = new Luxury(Location.USA);
      break;
 
      default:
      break;
    }
  return car;
  }
}