package com.travel.webservice.service;

import java.util.List;

import javax.jws.*;

import com.travel.webservice.data.*;

/**
 * This class represents a implementation of JAX-WS (JAVA API for XML-Based Web Service) via a interface. 
 * 
 * @author MIAN Farooq and BAH Alpha Oumar
 */

@WebService(name = "Travel",targetNamespace = "http://service.webservice.travel.com/")
public interface Travel {

	/* Listing of Web Method that will allow the generation of the operation in the wsdl file */
	@WebMethod(operationName = "getCountry", action = "urn:GetCountry")
	@WebResult(name = "result")
	List<Country> getCountry();
	
	@WebMethod(operationName = "getDestinations", action = "urn:GetDestinations")
	@WebResult(name = "result")
	List<Destination_type> getDestinations();
	
	@WebMethod(operationName = "getDestinationsByCity", action = "urn:GetDestinationsByCity")
	@WebResult(name = "result")
	List<Destination> getDestinationsByCity(@WebParam(name="idCity") int id);
	
	@WebMethod(operationName = "getCities", action = "urn:GetCities")
	@WebResult(name = "result")
	List<City> getCities();
	
	@WebMethod(operationName = "getDestination_each_type_dest", action = "urn:GetDestination_each_type_dest")
	@WebResult(name = "result")
	List<Destination_each_type_dest> getDestination_each_type_dest(@WebParam(name="idDestType") int idDestType);
	
	@WebMethod(operationName = "getDestination_assemble", action = "urn:GetDestination_assemble")
	@WebResult(name = "result")
	List<Destination_assemble> getDestination_assemble();
	
	@WebMethod(operationName="addDestination",action = "urn:AddDestination")
	@WebResult(name = "result")
	int addDestination(@WebParam(name="id_destination") int id_destination, @WebParam(name="name_dest") String name_dest, @WebParam(name="type_dest") int type_dest, 
			 @WebParam(name="id_city") int id_city, @WebParam(name="dest_picture") String dest_picture);
	
	@WebMethod(operationName = "getAllDestinations", action = "urn:GetAllDestinations")
	@WebResult(name = "result")
	List<Destination_each_type_dest> getAllDestinations();
	
	@WebMethod(operationName = "getDestinationById", action = "GetDestinationById")
	@WebResult(name = "result")
	Destination_each_type_dest getDestinationById(@WebParam(name="id") int id);
	
	@WebMethod(operationName="updateDestination",action = "urn:UpdateDestination")
	@WebResult(name = "result")
	int updateDestination(@WebParam(name="name_dest") String name_dest, @WebParam(name="type_dest") int type_dest, 
			 @WebParam(name="id_city") int id_city, @WebParam(name="dest_picture") String dest_picture, @WebParam(name="id_destination") int id_destination);
	
	@WebMethod(operationName = "deleteDestination", action = "urn:DeleteDestination")
	@WebResult(name = "result")
	boolean deleteDestination(@WebParam(name="id") int id);
}
