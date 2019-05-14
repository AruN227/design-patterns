package arun.patterns.prototype.client;

import arun.patterns.prototype.factory.PrototypeFactory;
import arun.patterns.prototype.factory.PrototypeFactory.ModelType;

public class TestPrototype {

	public static void main(String[] args) {
		
		try {
			String moviePrototype = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
			System.out.println(moviePrototype);
			
			String albumPrototype = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
			System.out.println(albumPrototype);
			
			String showPrototype = PrototypeFactory.getInstance(ModelType.SHOW).toString();
			System.out.println(showPrototype);
			
		}
		
		
		catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
	}
}
