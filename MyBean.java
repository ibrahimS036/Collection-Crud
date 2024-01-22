package com.CRUD;

public class MyBean {

	private String studentname;
	private int studentrollno;
	private String studentcity;
	private String hobby;

	MyBean(String studentname, int studentrollno, String studentcity, String hobby) {
		this.studentname = studentname;
		this.studentrollno = studentrollno;
		this.studentcity = studentcity;
		this.hobby = hobby;

	}

	public String getStudentname() {
		return studentname;
	}

	public int getStudentrollno() {
		return studentrollno;
	}

	public String getStudentcity() {
		return studentcity;
	}

	public String getHobby() {
		return hobby;
	}

	@Override
	public String toString() {
		return "Student Name:" + studentname + " " + "Student Roll No:" + studentrollno + "Student City:" + " "
				+ studentcity + " " + "Student Hobby:" + hobby;

	}

}
