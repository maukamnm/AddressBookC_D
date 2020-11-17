package com.munoz;

public class Address {

	private int ID;
	private String fname;
	private String lname;
	private String streetAddress;
	private String city;
	private String state;
	private int zip;

	public Address(int iD, String fname, String lname, String streetAddress, String city, String state, int zip) {
		super();
		ID = iD;
		this.fname = fname;
		this.lname = lname;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "||Address ID:" + ID + "|| Name:" + fname + " " + lname + "|| Street: " + streetAddress + " City: "
				+ city + "|| State=" + state + "|| Zipcode=" + zip + "||";
	}

}
