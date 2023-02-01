package com.java.Main;


import java.util.*;

public class SetExample1 extends SetMain {
	 int a = 10;//instance variable
	static int b = 20;//static variable
	int c = a+b;
	//creating main method
		public static void main(String args[]) {
			int i = 100, j = 20;
			int k = i-j;
			SetExample1 s1 = new SetExample1();
			System.out.println(s1.c);
			System.out.println(k);
			
			SetExample1 s = new SetExample1();
			s.setFamilyDetails();
			SetExample1 s2 = new SetExample1();
			s2.setFamilyDetails();
	
			
			}
		public void setFamilyDetails() {
			//creating instance method to set the values in to set interface
			Set<String> familyNames = new TreeSet<>();
			familyNames.add("Veera");
			familyNames.add("Lakshmi");
			familyNames.add("Aparna");
			familyNames.add("Anusha");
			familyNames.add("Shireesha");
			
			for(String familyName : familyNames) {
				
				//using concat method 
				System.out.println("adding Gounori to Name:"+familyName.concat(" Gounori"));
				//using charAt method
				System.out.println("Characer Index :"+familyName.charAt(4));
				//using contains method
				System.out.println("Gagan ,is there in Family Names?:"+familyName.contains("Gagan"));
				}
			}
		{
		//creating instance method to set the values into list interface
		List<String> familyNames = new ArrayList<>();
		familyNames.add("Veera");
		familyNames.add("Lakshmi");
		familyNames.add("Aparna");
		familyNames.add("Anusha");
		familyNames.add("Shireesha");
		familyNames.add(null);
		familyNames.add(null);
		for(String familyName:familyNames) {
			System.out.println("Siri's Famyly:"+familyName);
		}
		}
		{
		LinkedList<Integer> intAge = new LinkedList<>();
		intAge.add(10);
		intAge.add(20);
		intAge.add(30);
		intAge.add(40);
		intAge.add(50);
		for(int integerNum: intAge) {
			System.out.println("printing Age :"+integerNum);
			System.out.println("contains:"+intAge.contains(60));
			for(int i = 0;i<intAge.size();i++) {
				System.out.println("Ages index:"+(i));
			}
			}
		Collection<Character> charWord = new ArrayList<>();
		charWord.add('S');
		charWord.add('I');
		charWord.add('R');
		charWord.add('I');
		for(char charName:charWord) {
			System.out.println(charName);
		}
		
		
		}
}



