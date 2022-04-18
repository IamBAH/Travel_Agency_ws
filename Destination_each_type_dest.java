package com.travel.webservice.data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class represents a destination according to name grouped by destination type. 
 * 
 * @author MIAN Farooq and BAH Alpha Oumar
 */

@XmlRootElement(name="Destination_each_type_dest")
public class Destination_each_type_dest {

	int id_destination;
	String name_dest;
	int type_dest;
	int id_city;
	String dest_picture;
	int id_type_dest;
	String name_type_dest;
	String name_city;
	int id_country;
	float latitude;
	float longitude;
	String city_picture;
	float price;
   
	public Destination_each_type_dest() {
		super();
	}

	public Destination_each_type_dest(int id_destination, String name_dest, int type_dest, int id_city, String dest_picture,
			int id_type_dest, String name_type_dest, String name_city, int id_country, float latitude, float longitude,
			String city_picture, float price) {
		super();
		this.id_destination = id_destination;
		this.name_dest = name_dest;
		this.type_dest = type_dest;
		this.id_city = id_city;
		this.dest_picture = dest_picture;
		this.id_type_dest = id_type_dest;
		this.name_type_dest = name_type_dest;
		this.name_city = name_city;
		this.id_country = id_country;
		this.latitude = latitude;
		this.longitude = longitude;
		this.city_picture = city_picture;
		this.price = price;
	}

	public int getId_destination() {
		return id_destination;
	}

	public void setId_destination(int id_destination) {
		this.id_destination = id_destination;
	}

	public String getName_dest() {
		return name_dest;
	}

	public void setName_dest(String name_dest) {
		this.name_dest = name_dest;
	}

	public int getType_dest() {
		return type_dest;
	}

	public void setType_dest(int type_dest) {
		this.type_dest = type_dest;
	}

	public int getId_city() {
		return id_city;
	}

	public void setId_city(int id_city) {
		this.id_city = id_city;
	}

	public String getDest_picture() {
		return dest_picture;
	}

	public void setDest_picture(String dest_picture) {
		this.dest_picture = dest_picture;
	}

	public int getId_type_dest() {
		return id_type_dest;
	}

	public void setId_type_dest(int id_type_dest) {
		this.id_type_dest = id_type_dest;
	}

	public String getName_type_dest() {
		return name_type_dest;
	}

	public void setName_type_dest(String name_type_dest) {
		this.name_type_dest = name_type_dest;
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

}