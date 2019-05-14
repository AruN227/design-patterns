package arun.patterns.prototype.model;

import arun.patterns.prototype.contract.PrototypeCapable;

public class Show implements PrototypeCapable{
	private String show = null;

	public String getShow() {
		return show;
	}

	public void setShow(String show) {
		this.show = show;
	}

	
	@Override
	public Show clone() throws CloneNotSupportedException {
		System.out.println("Cloning Show");
		return (Show) super.clone();
	}

	@Override
	public String toString() {
		return "Show";
	}
	

}
