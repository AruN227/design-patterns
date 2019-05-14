package arun.patterns.builder.model;

public class User {
	
	//all attributes
	private final String firstName;
	private final String lastName;
	private final int age; //optional
	private final String address; //optional
	private final String phone; //optional
	
	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.address = builder.address;
		this.phone = builder.phone;
	}

	//no setter methods
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ ", phone=" + phone + "]";
	}
	
	
	public static class UserBuilder {
		private String firstName;
		private String lastName;
		private int age;
		private String address; 
		private String phone;


	public UserBuilder(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public UserBuilder age(int age) {
		this.age = age;
		return this;
	}
	
	public UserBuilder address(String address) {
		this.address = address;
		return this;
	}
	public UserBuilder phone(String phone) {
		this.phone = phone;
		return this;
	}

	public User build() {
		User user = new User(this);
		return user;
	}
 }
}
