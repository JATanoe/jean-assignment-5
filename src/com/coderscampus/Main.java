package com.coderscampus;

import com.coderscampus.arraylist.CustomArrayList;
import com.coderscampus.arraylist.CustomList;

public class Main {

	public static void main(String[] args) {

		CustomList<String> myCustomList = new CustomArrayList<>();

		System.out.println("Initial size: " + myCustomList.getSize());
		
		int index = 0;
		while (index < 30) {
			myCustomList.add("element " + index);	
			index++;
		}
		
		System.out.println("Current size: " + myCustomList.getSize());

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}

	}
}
