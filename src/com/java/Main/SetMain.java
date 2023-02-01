package com.java.Main;

import java.util.*;

public class SetMain {
	public static void main(String args[]) {
		//new SetMain().setCompanyDetails();
		SetMain s1 = new SetMain();
		
		s1.setCompanyDetails();
		SetMain s2 = new SetMain();
		s2.setCompanyDetails();
		
	}
		//creating instance method to set the values into set interface
	public void setCompanyDetails() {
	Set<String>	companyDetails = new HashSet<>();
	companyDetails.add("IBM");
	companyDetails.add("Cognizant");
	companyDetails.add("Capgemini");
	companyDetails.add("Wipro");
	companyDetails.add("Google");
	companyDetails.add(null);
	companyDetails.add(null);
	companyDetails.add("IBM");
	for(String companyName:companyDetails) {
	System.out.println("Company Name ::"+companyName);
	}
	}
	{
	List<String> companyDetails = new ArrayList<>();
	companyDetails.add("IBM");
	companyDetails.add("Cognizant");
	companyDetails.add("Capgemini");
	companyDetails.add("Wipro");
	companyDetails.add("Google");
	companyDetails.add(null);
	companyDetails.add(null);
	companyDetails.add("IBM");
	for(String companyName :companyDetails) {
		System.out.println("-Company Name:"+companyName);
	}

	
}
}
