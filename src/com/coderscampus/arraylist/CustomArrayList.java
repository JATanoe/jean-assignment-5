package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	private Object[] items = new Object[10];
	private int size = 0; // Count the number of item to add

	@Override
	public boolean add(T item) {
		if (size >= getSize()) resizeArray();
		if (items[size] == null) items[size] = item;
		size++;
		return true;
	}
	
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		if (index >= getSize() || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + getSize());
		}

		return (T) items[index];
	}

	private void resizeArray() {		
		items = Arrays.copyOf(items, items.length * 2);
	}

}
