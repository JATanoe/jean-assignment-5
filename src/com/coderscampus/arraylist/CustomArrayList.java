package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {

	private Object[] items;

	public CustomArrayList() {
		this.items = new Object[10];
	}

	@Override
	public boolean add(T item) {
		for (int i = 0; i < this.getSize(); i++) {
			if (i >= this.getSize()) this.resizeArray();

			if (this.items[i] == null) {
				this.items[i] = item;
				break;
			}
		}

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
		
		for (int i = 0; i < newSize; i++) {
			newArray[i] = this.items[i];			
		}
		
//		System.arraycopy(this.items, 0, newArray, 0, newSize);
		
		this.items = newArray;
	}

}
