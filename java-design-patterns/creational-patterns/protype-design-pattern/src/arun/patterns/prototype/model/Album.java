package arun.patterns.prototype.model;

import arun.patterns.prototype.contract.PrototypeCapable;

public class Album implements PrototypeCapable{
	private String album = null;

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	
	@Override
	public Album clone() throws CloneNotSupportedException {
		System.out.println("Cloning Album");
		return (Album) super.clone();
	}

	@Override
	public String toString() {
		return "Album";
	}
	
	
	

}
