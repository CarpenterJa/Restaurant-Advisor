package application;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

	private String name;
	private String address;
	private String phoneNumber;
	private String hoursOfOperation;
	private String email;
	private List<String> cuisineType;
	private String diningType;
	private String priceRange;
	private List<Food> menu;

	public Restaurant(String n, String a, String pN, String h, String e, ArrayList<String> c, String d, String pR,
			ArrayList<Food> m) {
		name = n;
		address = a;
		phoneNumber = pN;
		hoursOfOperation = h;
		email = e;
		cuisineType = c;
		diningType = d;
		priceRange = pR;
		menu = m;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHoursOfOperation() {
		return hoursOfOperation;
	}

	public void setHoursOfOperation(String hoursOfOperation) {
		this.hoursOfOperation = hoursOfOperation;
	}

	public List<String> getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(List<String> cuisineType) {
		this.cuisineType = cuisineType;
	}

	public String getDiningType() {
		return diningType;
	}

	public void setDiningType(String diningType) {
		this.diningType = diningType;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	public List<Food> getMenu() {
		return menu;
	}

	public void setMenu(List<Food> menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", hoursOfOperation=" + hoursOfOperation + ", email=" + email + ", cuisineType=" + cuisineType
				+ ", diningType=" + diningType + ", priceRange=" + priceRange + ", menu=" + menu + "]\n";
	}

}
