package com.CRUD;

public class Bean3 {

	private int id;
	private String name;
	private String city;

	Bean3(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	Integer getId() {
		return id;
	}

	String getName() {
		return name;
	}

	String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Bean3 [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	
}
