package arun.patterns.abstractpatterns;


public abstract class Car {
	 
    public Car(CarType model, Location location) {
        this.model = model;
        this.location = location;
        arrangeParts();
    }

 // Do one time processing here
    private void arrangeParts() {

    }
 
    // Do subclass level processing in this method
    protected abstract void construct();
 
    private CarType model = null;
    private Location location = null;
 
    public CarType getModel() {
        return model;
    }
 
    public void setModel(CarType model) {
        this.model = model;
    }

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "model=" + model + " buildIn=" + location;
	}
    
}

