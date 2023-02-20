package com.entity;

public class Student {
	private int rollno;
	private String name;
	private String contact;
	private int Std;
	public Student(int rollno, String name, String contact, int std) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.contact = contact;
		this.Std = std;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getStd() {
		return Std;
	}
	public void setStd(int std) {
		Std = std;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", contact=" + contact + ", Std=" + Std + "]";
	}
	

}
