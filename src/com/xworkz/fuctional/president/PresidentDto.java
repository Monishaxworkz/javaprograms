package com.xworkz.fuctional.president;

public class PresidentDto {

	private String name;
	private String country;
	private String age;
	private String language;
	
	public PresidentDto(String name, String country, String age, String language) {
		this.name = name;
		this.country = country;
		this.age = age;
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "PresidentDto [name=" + name + ", country=" + country + ", age=" + age + ", language=" + language + "]"; 
	}
}
