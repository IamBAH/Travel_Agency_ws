package com.travel.webservice.data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class represents a destination type. 
 * 
 * @author MIAN Farooq and BAH Alpha Oumar
 */

@XmlRootElement(name="destType")
public class Destination_type {
	int id_type_dest;
	String name_type_dest;
	
	public Destination_type() 
	{
		super();
	}

	public Destination_type(int id_type_dest, String name_type_dest) {
		super();
		this.id_type_dest = id_type_dest;
		this.name_type_dest = name_type_dest;
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
	 
}