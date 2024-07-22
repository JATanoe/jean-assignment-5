package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {

	private Object[] items = new Object[10];
	private int index = 0; // Count the number of item to add

	@Override
	public boolean add(T item) {
		// If the current index is greater or equal the array length,
		// then we resize the array
		if (this.index >= this.getSize()) this.resizeArray();
		// the item's value at position index is null, then assign the item 
		if (this.items[index] == null) this.items[index] = item;
		// Increment the index value for the next item
		this.index++;
		// Then return true
		return true;
	}
	
	@Override
	public int getSize() {
		return this.items.length;
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
		// Initialize and assign a new array of Objects with double 
		// the size of the current array
		Object[] newArray = new Object[this.getSize() * 2];		
		// Copy the current array into the new one
		System.arraycopy(this.items, 0, newArray, 0, this.getSize());
		// Assign the new array the current one
		this.items = newArray;
	}

}
