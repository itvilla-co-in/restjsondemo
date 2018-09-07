package com.itvilla.jacksondemo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class main {

	public static void main(String[] args) {

		try {
			
			// creating the  object mapper this is part of JACKSON API
			ObjectMapper mapper = new ObjectMapper();
			
			// Read JSON from file then do the  mapping  to Java POJO
			Employee emp = mapper.readValue(new File("data/sample.json"), Employee.class);
			
			// also print individual items
			System.out.println("First name = " + emp.getFirstName());
			System.out.println("Last name = " + emp.getLastName());		

			// get nested object: array
			Address temp = emp.getAddress();
			System.out.println("Street = " + temp.getStreet());		
			System.out.println("City = " + temp.getCity());		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
