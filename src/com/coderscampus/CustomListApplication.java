package com.coderscampus;

import com.coderscampus.arraylist.CustomArrayList;
import com.coderscampus.arraylist.CustomList;

public class CustomListApplication  {

	public static void main(String[] args) {

		CustomList<String> myCustomList = new CustomArrayList<>();
		
		int index = 0;
		while (index < 23) {
			myCustomList.add("element " + index);	
			index++;
		}

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}

		System.out.println("Array size: " + myCustomList.getSize());


	}
}
