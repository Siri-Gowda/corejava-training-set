package com.java.Main;

import java.util.*;
import java.util.Map.Entry;


public class MapDemo {
	
	//creating main method
	public static void main(String args[]) {
		MapDemo.getMovieNames();
		MapDemo.getAlphaNames();
		MapDemo.getJavaConcept();
		
		
		}
	public static void getMovieNames() {
		//creating Map interface 
		/**
		 * Syntax:
		 * interface_name <key_data-type , value_data-type> Variable_name = new implementation class_name<>();
		 */
		//Creating HashMap Interface
		Map<Integer,String> movie = new HashMap<>();
		movie.put(1, "Warrior");
		movie.put(2, "RRR");
		movie.put(3, "3");
		movie.put(4, "Acharya");
		movie.put(5, "F3");
		movie.put(6, "Karthikeya");
		movie.put(7, "Radhe Shyam");
		movie.put(8, "Seetha Ramam");
		movie.put(9, "VR");
		movie.put(10, "Shikaru");
		movie.put(11, "Dj Tillu");
		movie.put(12, "Jathi Ratnalu");
		movie.put(13, "Thiru");
		movie.put(14, "Liger");
		movie.put(15, "Husharu");
		movie.put(16, "Thank You");
		movie.put(null, "KRK");
		movie.put(null, "Kanchana");
		
		//using for each loop
		for(Map.Entry<Integer, String>  mV :movie.entrySet()) {//Map.Entry providing methods to get Keys and Values
			System.out.println(mV);
		
		}
	}
	
	public static void getAlphaNames() {
		 //interface_name <key_data-type , value_data-type> Variable_name = new implementation class_name<>();
		//Creating WeakHashMap Interface 
         Map<Character,String> alpha = new WeakHashMap<>();
         
         //Adding variables with using put method
         alpha.put('A', "Apple");
         alpha.put('B', "Ball");
         alpha.put('C', "Car");
         alpha.put('D',"Dog");
         alpha.put('E', "Elephant");
         alpha.put('F', "Fan");
         alpha.containsKey('K');
         //using if else condition
         if(alpha.containsKey('K')) {
         System.out.println("I have Gun");//using contains method to check object value
         
	}else {
		System.out.println("I don't have Gun");
		System.out.println(alpha.entrySet());
		
	}
		
	}
	public static void getJavaConcept() {
		//Creating TreeMap Interface
		Map<String,String> java = new TreeMap<>();
		java.put("Object", "Object Oriented");
		java.put("Class",  "Platform Independent");
		java.put("Inheritacne", "Secure");
		java.put("Encapsulation", "Secure");
		java.put("Polymorphism", "Poratable");
		java.put("Abstraction", "Multithreaded");
		
		//using if else condition
		if (java.containsValue("String")) {
			System.out.println("There is no String");
		}else {
			System.out.println(java.size());//using entrySet method to get keys and values 
		
			//using for each loop
			for(Entry<String,String> oops : java.entrySet()){
				System.out.println(oops.getKey());
				
			}
					 
				
			}
		}
	}	
	
			
			
			
		

		
		


