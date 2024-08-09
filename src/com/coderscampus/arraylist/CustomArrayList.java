package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	private Object[] items = new Object[10];
	private int size = 0; // Count the number of item to add

	@Override
	public boolean add(T item) {
		if (this.size >= this.getSize()) this.resizeArray();
		if (this.items[size] == null) this.items[size] = item;
		this.size++;
		return true;
	}
	
	@Override
	public int getSize() {
		return this.size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index >= this.getSize() || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.getSize());
		}

		return (T) this.items[index];
	}

	private void resizeArray() {		
		this.items = Arrays.copyOf(this.items, this.items.length * 2);
	}

}
