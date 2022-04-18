package com.travel.webservice.data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class represents a city. 
 * 
 * @author MIAN Farooq and BAH Alpha Oumar
 */

@XmlRootElement(name="City")
public class City {
	int id_city;
	String name_city;
	int id_country;
	float latitude;
	float longitude;
	String city_picture;
	float price;
	String name_country;
	
	public City() {
		super();
	}

	public City(int id_city,String name_city, int id_country, float latitude, float longitude, String city_picture,
			float price, String name_country) {
		super();
		this.id_city = id_city;
		this.name_city = name_city;
		this.id_country = id_country;
		this.latitude = latitude;
		this.longitude = longitude;
		this.city_picture = city_picture;
		this.price = price;
		this.name_country = name_country;
	}

	public int getId_city() {
		return id_city;
	}

	public void setId_city(int id_city) {
		this.id_city = id_city;
	}

	public String getName_city() {
		return name_city;
	}

	public void setName_city(String name_city) {
		this.name_city = name_city;
	}

	public int getId_country() {
		return id_country;
	}

	public void setId_country(int id_country) {
		this.id_country = id_country;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public String getCity_picture() {
		return city_picture;
	}

	public void setCity_picture(String city_picture) {
		this.city_picture = city_picture;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName_country() {
		return name_country;
	}

	public void setName_country(String name_country) {
		this.name_country = name_country;
	}
}