package com.travel.webservice.data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class represents a destination according to the number of destinations for each of them. 
 * 
 * @author MIAN Farooq and BAH Alpha Oumar
 */

@XmlRootElement(name="DestinationAssemble")
public class Destination_assemble {

	int destination_count;
	int id_destination;
	String name_city;
	float latitude;
	float longitude;
	
	public Destination_assemble() {
		super();
	}

	public Destination_assemble(int destination_count, int id_destination, String name_city, float latitude, float longitude) {
		super();
		this.destination_count = destination_count;
		this.id_destination = id_destination;
		this.name_city = name_city;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public int getDestination_count() {
		return destination_count;
	}

	public void setDestination_count(int destination_count) {
		this.destination_count = destination_count;
	}

	public int getId_destination() {
		return id_destination;
	}

	public void setId_destination(int id_destination) {
		this.id_destination = id_destination;
	}

	public String getName_city() {
		return name_city;
	}

	public void setName_city(String name_city) {
		this.name_city = name_city;
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

}