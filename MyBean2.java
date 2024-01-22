package com.CRUD;

public class MyBean2 {

	private int id;
	private String name;
	private String course;
	private String city;
	private long mobileNo;

	public MyBean2(int id, String name, String course, String city, long mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.city = city;
		this.mobileNo = mobileNo;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public String getCity() {
		return city;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	@Override
	public String toString() {
		return "MyBean2 [id=" + id + ", name=" + name + ", course=" + course + ", city=" + city + ", mobileNo="
				+ mobileNo + "]";
	}

}
