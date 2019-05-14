package arun.patterns.prototype.model;

import arun.patterns.prototype.contract.PrototypeCapable;

public class Movie implements PrototypeCapable {
	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public Movie clone() throws CloneNotSupportedException {
		System.out.println("Cloning Movie");
		return (Movie) super.clone();
	}

	@Override
	public String toString() {
		return "Movie";
	}
	
}
