package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {

	private Object[] items;
	private int index;

	public CustomArrayList() {
		this.items = new Object[10];
		this.index = 0;
	}

	@Override
	public boolean add(T item) {
		if (this.index >= this.getSize()) this.resizeArray();
	
		if (this.items[index] == null) {
			this.items[index] = item;
		}
		
		this.index++;

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
		int newSize = this.getSize() * 2;
		Object[] newArray = new Object[newSize];		
		System.arraycopy(this.items, 0, newArray, 0, this.getSize());
		this.items = newArray;
	}

}
