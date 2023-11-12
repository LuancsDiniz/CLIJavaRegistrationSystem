package model.entities;

public class User {

	private String name;
	private String email;
	private Integer age;
	private double height;

	public User() {

	}

	public User(String name, String email, Integer age, double height) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return name + "\n" + email + "\n" + age + "\n" + height;
	}

}
