package com.java.set;

import java.util.*;

public class TreeSetDemo {
	public static void main(String args[]) {
		TreeSetDemo.getFruitNames();
		TreeSetDemo.getChocolateNames();
		//getFruitNames();
		
	}
	//static method creation
	public static void getFruitNames() {
		//creating the set interface using HashSet implementation class
//Syntax: interface_name <Data_type> Variable_name = new Implementation class_name
		Set<String> fruitName = new TreeSet<>();
		fruitName.add("Apple");
		fruitName.add("Cherry");
		fruitName.add("StrawBerry");
		fruitName.add("Dragon");
		fruitName.add("Kiwi");
		
	   //using for each loop
		for(String frootNames:fruitName) {
			System.out.println("Printing Fruit Names :"+frootNames );
		}
		
		
		if(fruitName.contains("watermelon")){
			System.out.println("I have Watermelon");
		}else {
			System.out.println("I don't have Watermelon");
				}	
		{
			//using for each loop
			for(String fruitsName: fruitName) {
				//using connect method
				System.out.println( fruitsName.concat("-Fruit"));
		}
			
			}
	
		Set<Integer> intNum = new TreeSet<>();
		System.out.println();
		intNum.add(65);
		intNum.add(55);
		intNum.add(85);
		intNum.add(95);
		intNum.add(75);
		intNum.add(55);
		//for each loop
		for(Integer integerNum:intNum) {
			System.out.println(integerNum);
			}
		//if else condition
		if(intNum.contains(55))//using contains method to check Number
		{
			System.out.println("SHIREESHA");
			System.out.println(intNum.size());//checking size 
			}else {
				System.out.println("i don't have Num 105");
			    System.out.println(intNum.size());//using size method to check
				
			}
		Set<Character> charVowels = new TreeSet<>();
		charVowels.add('A');
		charVowels.add('E');
		charVowels.add('I');
		charVowels.add('O');
		charVowels.add('U');
		System.out.println(charVowels);
		//if else condition
		if(charVowels.contains('J')) {
			System.out.println("True");//contains method
		}else {
			System.out.println("False");
		}
		
		}
	public static void getChocolateNames() {
		//creating set interface to implement LinkedHashSet interface
		Set<String> chocoNames = new LinkedHashSet<>();
		chocoNames.add(" DairyMilk ");
		chocoNames.add(" Munch ");
		chocoNames.add(" 5 $taR ");
		chocoNames.add(" Kit Kat ");
		chocoNames.add(" Dark ");
		chocoNames.add(" Eclairs ");
		//for each loop
		for(String chockyNames : chocoNames) {
			System.out.println(chockyNames);
			System.out.println(chockyNames.trim());//Using trim method to clear white spaces front and back sides
			
		}
		
		
	}
	

	
}


		
	

