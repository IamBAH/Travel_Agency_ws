package com.travel.webservice.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

import com.travel.webservice.data.*;

// this annotation Webservice will service will be the service that will appear in wdsl file
@WebService(targetNamespace = "http://service.webservice.travel.com/",
endpointInterface = "com.travel.webservice.service.Travel",
portName = "TravelPort",serviceName = "TravelService")
public class Travel_implementation implements Travel{

	/* Database connection */
	DataBase_connection database = DataBase_connection.getInstance();
	
	/**
	 * Review a list of all countries. 
	 * 
	 * @return countries(list)
	 * @author MIAN Farooq and BAH Alpha Oumar
	 */
	
	public List<Country> getCountry() { 
		List<Country> countries = new ArrayList<Country>();
		try {
        String sql_request ="SELECT *FROM countries";
        database.PrepareStatement_for_request(sql_request);
        ResultSet resultset = database.ExecuteQuery_request();
        while(resultset.next()) {
        	Country country = new Country(); 
            country.setId_country(resultset.getInt("id_country"));
            country.setName_country(resultset.getString("name_country"));
            countries.add(country);
        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.print(e.getMessage());
	    }
		return countries;
	}
	
	
	/**
	 * Review all destination per city. 
	 * 
	 * @param id
	 * @return destinationCity(list)
	 * @author MIAN Farooq and BAH Alpha Oumar
	 */
	
    public List<Destination> getDestinationsByCity(int id) {
        List<Destination> destinationCity  = new ArrayList<Destination>(); 
        try {
            String sql_request ="SELECT * FROM destinations JOIN destination_type ON destinations.type_dest = destination_type.id_type_dest WHERE id_city = ? ";
            database.PrepareStatement_for_request(sql_request);
            Object[] parameter = {id};
            database.addParameters_request(parameter);
            ResultSet resultset = database.ExecuteQuery_request();
            while(resultset.next()) {
                Destination destination = new Destination(); 
                destination.setId_destination(resultset.getInt("id_destination"));
                destination.setName_dest(resultset.getString("name_dest"));
                destination.setType_dest(resultset.getInt("type_dest"));
                destination.setId_city(resultset.getInt("id_city"));
                destination.setDest_picture(resultset.getString("dest_picture"));
                destination.setId_type_dest(resultset.getInt("id_type_dest"));
                destination.setName_type_dest(resultset.getString("name_type_dest"));
                destinationCity.add(destination); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return destinationCity;
    }
    
    /**
	 * Review all cities. 
	 * 
	 * @return TypeCity(list)
	 * @author MIAN Farooq and BAH Alpha Oumar
	 */

    public List<City> getCities() {
        List<City> TypeCity  = new ArrayList<City>(); 
        try {
        	String sql_request ="SELECT *FROM cities JOIN countries ON cities.id_country = countries.id_country";
            database.PrepareStatement_for_request(sql_request);
            ResultSet resultset = database.ExecuteQuery_request();
            while(resultset.next()) {
                City city = new City();
                city.setId_city(resultset.getInt("id_city"));
                city.setName_city(resultset.getString("name_city"));
                city.setId_country(resultset.getInt("id_country"));
                city.setLatitude(resultset.getFloat("latitude"));
                city.setLongitude(resultset.getFloat("longitude"));
                city.setCity_picture(resultset.getString("city_picture"));
                city.setPrice(resultset.getFloat("price"));
                city.setId_country(resultset.getInt("id_country"));
                city.setName_country(resultset.getString("name_country"));
                TypeCity.add(city); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return TypeCity;  
    } 

    /**
	 * Review a list destinations type. 
	 * 
	 * @return ListTypeDest(list)
	 * @author MIAN Farooq and BAH Alpha Oumar
	 */
    
	public List<Destination_type> getDestinations() {
		List<Destination_type> ListTypeDest = new ArrayList<Destination_type>(); 
		try {
        String sql_request ="SELECT *FROM destination_type";
        database.PrepareStatement_for_request(sql_request);
        ResultSet resultset = database.ExecuteQuery_request();
        while(resultset.next()) {
        	Destination_type destination_type = new Destination_type(); 
        	destination_type.setId_type_dest(resultset.getInt("id_type_dest"));
        	destination_type.setName_type_dest(resultset.getString("name_type_dest"));
        	ListTypeDest.add(destination_type); 
        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.print(e.getMessage());
	    }
		return ListTypeDest;
	}

	/**
	 * Review a list of destination according to name grouped by destination type. 
	 * 
	 * @param idDestType
	 * @return destination_each_type_dest(list)
	 * @author MIAN Farooq and BAH Alpha Oumar
	 */
	
	public List<Destination_each_type_dest> getDestination_each_type_dest(int idDestType) {
		// TODO Auto-generated method stub
		 List<Destination_each_type_dest> destination_each_type_dest  = new ArrayList<Destination_each_type_dest>(); 
		 try {
	            String sql_request ="SELECT *FROM destinations JOIN destination_type ON destinations.type_dest = ? JOIN cities ON destinations.id_city = cities.id_city GROUP BY name_dest";
	            database.PrepareStatement_for_request(sql_request);
	            Object[] parameter = {idDestType};
	            database.addParameters_request(parameter);
	            ResultSet resultset = database.ExecuteQuery_request();
	            while(resultset.next()) {
	            	Destination_each_type_dest destination_each_type_dest_name = new Destination_each_type_dest(); 
	            	destination_each_type_dest_name.setId_destination(resultset.getInt("id_destination"));
	            	destination_each_type_dest_name.setName_dest(resultset.getString("name_dest"));
	            	destination_each_type_dest_name.setType_dest(resultset.getInt("type_dest"));
	            	destination_each_type_dest_name.setId_city(resultset.getInt("id_city"));
	            	destination_each_type_dest_name.setDest_picture(resultset.getString("dest_picture"));
	            	destination_each_type_dest_name.setId_type_dest(resultset.getInt("id_type_dest"));
	            	destination_each_type_dest_name.setName_type_dest(resultset.getString("name_type_dest"));
	            	destination_each_type_dest_name.setName_city(resultset.getString("name_city"));
	            	destination_each_type_dest_name.setId_country(resultset.getInt("id_country"));
	            	destination_each_type_dest_name.setLatitude(resultset.getInt("latitude"));
	            	destination_each_type_dest_name.setLongitude(resultset.getInt("longitude"));
	            	destination_each_type_dest_name.setCity_picture(resultset.getString("city_picture"));
	            	destination_each_type_dest_name.setPrice(resultset.getInt("price"));
	                destination_each_type_dest.add(destination_each_type_dest_name); 
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return destination_each_type_dest;
	}

   	/**
	 * Review a list of destination type according to the number of destinations for each of them. 
	 * 
	 * @return destination_assemble_type(list)
	 * @author MIAN Farooq and BAH Alpha Oumar
	 */
	
	public List<Destination_assemble> getDestination_assemble() {
		List<Destination_assemble> destination_assemble_type = new ArrayList<Destination_assemble>(); 
		try {
        String sql_request ="SELECT count(id_destination) as destination_count, id_destination, cities.name_city, cities.latitude, cities.longitude FROM destinations "
        		+ "JOIN destination_type ON destinations.type_dest = destination_type.id_type_dest JOIN cities ON destinations.id_city = cities.id_city GROUP BY cities.name_city";
        database.PrepareStatement_for_request(sql_request);
        ResultSet resultset = database.ExecuteQuery_request();
        while(resultset.next()) {
        	Destination_assemble destination_assemble = new Destination_assemble(); 
        	destination_assemble.setDestination_count(resultset.getInt("destination_count"));
        	destination_assemble.setId_destination(resultset.getInt("id_destination"));
        	destination_assemble.setName_city(resultset.getString("name_city"));        	
        	destination_assemble.setLatitude(resultset.getFloat("latitude"));
        	destination_assemble.setLongitude(resultset.getFloat("longitude"));
        	destination_assemble_type.add(destination_assemble);
        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.print(e.getMessage());
	    }
		return destination_assemble_type;
	}
    
	/**
	  * Add destination.
	  * 
	  * @param id_destination, name_dest, type_dest, id_city, dest_picture
	  * @return 0 if the addition of the destination has occurred otherwise return 1.
	  * @author MIAN Farooq and BAH Alpha Oumar
	  */
	
		public int addDestination(int id_destination, String name_dest, int type_dest, int id_city, String dest_picture) {
			try {
		        String sql_request ="INSERT INTO destinations(id_destination, name_dest, type_dest, id_city, dest_picture) VALUES (?, ?, ?, ?, ?)";
		        database.PrepareStatement_for_request(sql_request);
		        Object[] parameters = {id_destination,name_dest, type_dest, id_city, dest_picture};
		        database.addParameters_request(parameters);
		        database.ExecuteUpdate_request();
			    } catch (Exception e) {
			        e.printStackTrace();
			        System.out.print(e.getMessage());
			        return 1;
			    }
			return 0;
		
		}
	
		
		/**
		 * Review all destinations details. 
		 * 
		 * @return destination_each_type_dest(list)
		 * @author MIAN Farooq and BAH Alpha Oumar
		 */
		
		public List<Destination_each_type_dest> getAllDestinations() {
			List<Destination_each_type_dest> destination_each_type_dest  = new ArrayList<Destination_each_type_dest>();
			 try {
		            String sql_request ="SELECT *FROM destinations JOIN destination_type ON destinations.type_dest = destination_type.id_type_dest JOIN cities ON destinations.id_city = cities.id_city";
		            database.PrepareStatement_for_request(sql_request);
		            ResultSet resultset = database.ExecuteQuery_request();
		            while(resultset.next()) {
		            	Destination_each_type_dest destination_each_type_dest_name = new Destination_each_type_dest(); 
		            	destination_each_type_dest_name.setId_destination(resultset.getInt("id_destination"));
		            	destination_each_type_dest_name.setName_dest(resultset.getString("name_dest"));
		            	destination_each_type_dest_name.setType_dest(resultset.getInt("type_dest"));
		            	destination_each_type_dest_name.setId_city(resultset.getInt("id_city"));
		            	destination_each_type_dest_name.setDest_picture(resultset.getString("dest_picture"));
		            	destination_each_type_dest_name.setId_type_dest(resultset.getInt("id_type_dest"));
		            	destination_each_type_dest_name.setName_type_dest(resultset.getString("name_type_dest"));
		            	destination_each_type_dest_name.setName_city(resultset.getString("name_city"));
		            	destination_each_type_dest_name.setId_country(resultset.getInt("id_country"));
		            	destination_each_type_dest_name.setLatitude(resultset.getInt("latitude"));
		            	destination_each_type_dest_name.setLongitude(resultset.getInt("longitude"));
		            	destination_each_type_dest_name.setCity_picture(resultset.getString("city_picture"));
		            	destination_each_type_dest_name.setPrice(resultset.getInt("price"));
		                destination_each_type_dest.add(destination_each_type_dest_name); 
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        return destination_each_type_dest;
		}
		
		
		/**
		  * Review destination details by id.
		  * 
		  * @param id
		  * @return destination_each_type_dest(list)
		  * @author MIAN Farooq and BAH Alpha Oumar
		  */
		
		public Destination_each_type_dest getDestinationById(int id) {
			Destination_each_type_dest destination_each_type_dest = new Destination_each_type_dest();
			try {
		        String sql_request ="SELECT *FROM destinations JOIN destination_type ON destinations.type_dest = destination_type.id_type_dest JOIN cities on destinations.id_city = cities.id_city WHERE id_destination = ?";
		        database.PrepareStatement_for_request(sql_request);
	            Object[] parameter = {id};
	            database.addParameters_request(parameter);
	            ResultSet resultset = database.ExecuteQuery_request();
	            while(resultset.next()) {
	            	destination_each_type_dest.setId_destination(resultset.getInt("id_destination"));
	            	destination_each_type_dest.setName_dest(resultset.getString("name_dest"));
	            	destination_each_type_dest.setType_dest(resultset.getInt("type_dest"));
	            	destination_each_type_dest.setId_city(resultset.getInt("id_city"));
	            	destination_each_type_dest.setDest_picture(resultset.getString("dest_picture"));
	            	destination_each_type_dest.setId_type_dest(resultset.getInt("id_type_dest"));
	            	destination_each_type_dest.setName_type_dest(resultset.getString("name_type_dest"));
	            	destination_each_type_dest.setName_city(resultset.getString("name_city"));
	            	destination_each_type_dest.setId_country(resultset.getInt("id_country"));
	            	destination_each_type_dest.setLatitude(resultset.getInt("latitude"));
	            	destination_each_type_dest.setLongitude(resultset.getInt("longitude"));
	            	destination_each_type_dest.setCity_picture(resultset.getString("city_picture"));
	            	destination_each_type_dest.setPrice(resultset.getInt("price"));            	
	            }
			} catch (Exception e) {
	            e.printStackTrace();
	        }
			
			return destination_each_type_dest;
		
		}
		
		/**
		  * Update to destination details.
		  * 
		  * @param name_dest, type_dest, id_city, dest_picture, id_destination
		  * @return id_destination
		  * @author MIAN Farooq and BAH Alpha Oumar
		  */
		
		public int updateDestination(String name_dest, int type_dest, int id_city, String dest_picture, int id_destination) {
			try {
		        String sql_request ="UPDATE destinations SET name_dest= ?,type_dest=?,id_city = ?,dest_picture = ? WHERE id_destination = ?";
		        database.PrepareStatement_for_request(sql_request);
		        Object[] parameters = {name_dest, type_dest, id_city, dest_picture, id_destination};
		        database.addParameters_request(parameters);
		        database.ExecuteUpdate_request();
			    } catch (Exception e) {
			        e.printStackTrace();
			        System.out.print(e.getMessage());
			    }
			return id_destination;
		
		}
		
		/**
		  * Remove destination.
		  * 
		  * @param id
		  * @return true if the remove of the destination has occurred otherwise return false.
		  * @author MIAN Farooq and BAH Alpha Oumar
		  */
		
		public boolean deleteDestination(int id) {
			try {
		        String sql_request ="DELETE FROM destinations WHERE id_destination = ?";
		        database.PrepareStatement_for_request(sql_request);
		        Object[] parameters = {id};
		        database.addParameters_request(parameters);
		        database.ExecuteUpdate_request();
			    } catch (Exception e) {
			        e.printStackTrace();
			        System.out.print(e.getMessage());
			    }
			return true;
		
		}
}