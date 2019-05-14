package arun.patterns.builder.client;

import arun.patterns.builder.model.User;

public class TestBuilder {
	public static void main(String[] args) {
		User user1 = new User.UserBuilder("Arun", "kumar")
				.age(22).address("51,main street").build();
		System.out.println(user1);
		
		User user2 = new User.UserBuilder("Selva", "Kumar")
				.age(22).phone("1235678").build();
		System.out.println(user2);
			
		
	}

}
