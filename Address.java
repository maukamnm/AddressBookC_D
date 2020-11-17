package munoz.com;

public class Address {
private int ID;
private String lname;
private String street;
private String city;
private String state;
private int zip;

public Address(int ID, String lname, String street, String city, String state, int zip) {
	super();
	this.ID = ID;
	this.lname = lname;
	this.street = street;
	this.city = city;
	this.state = state;
	this.zip = zip;
}

public int getZip() {
	return zip;
}

public void setZip(int zip) {
	this.zip = zip;
}

public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
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
@Override
public String toString() {
	return "|| ID: " + ID + "| Last Name: " + lname + "| street: " + street + "| City: " + city + "| State="
+ state + "| Zip: "+ zip + " ||";
}

}
