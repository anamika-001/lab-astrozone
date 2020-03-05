package model;

public class User{
	private String name;
	private String month;
	private String date;
	private String gender;
	public User(String name, String month, String date, String gender) {
		super();
		this.name = name;
		this.month = month;
		this.date = date;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}