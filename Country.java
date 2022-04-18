package com.travel.webservice.data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class represents a country. 
 * 
 * @author MIAN Farooq and BAH Alpha Oumar
 */

@XmlRootElement(name="country")
public class Country
{
	private int id_country;
	private String name_country;
	
	public Country()
	{
		super();
	}

	public Country(int id_country, String name_country)
	{
		super();
		this.id_country = id_country;
		this.name_country = name_country;
	}

	public int getId_country() {
		return id_country;
	}

	public void setId_country(int id_country) {
		this.id_country = id_country;
	}

	public String getName_country() {
		return name_country;
	}

	public void setName_country(String name_country) {
		this.name_country = name_country;
	}
}