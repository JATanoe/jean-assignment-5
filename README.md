# Custom ArrayList Implementation

## Overview
This project implements a custom dynamic array list in Java, similar to the standard `ArrayList` class but with simplified functionality. It demonstrates fundamental concepts of data structures, generics, and object-oriented programming in Java.

## Features
- Generic implementation that can store any type of object
- Dynamic resizing (automatically doubles capacity when needed)
- Basic list operations:
  - Add elements to the list
  - Get elements by index
  - Get the current size of the list
- Proper bounds checking for index access

## Project Structure
The project consists of three main components:

1. **CustomList Interface** (`com.coderscampus.arraylist.CustomList`)
   - Defines the contract for list implementations
   - Specifies methods for adding elements, retrieving elements, and getting the list size

2. **CustomArrayList Implementation** (`com.coderscampus.arraylist.CustomArrayList`)
   - Implements the CustomList interface
   - Uses an Object array as the backing data structure
   - Handles dynamic resizing when the array reaches capacity

3. **Application Class** (`com.coderscampus.CustomListApplication`)
   - Demonstrates the usage of the custom list implementation
   - Shows how to add elements and iterate through the list

## Usage Example
```java
// Create a new list of strings
CustomList<String> myList = new CustomArrayList<>();

// Add elements to the list
myList.add("Hello");
myList.add("World");

// Get the size of the list
int size = myList.getSize();  // Returns 2

// Access elements by index
String element = myList.get(0);  // Returns "Hello"

// Iterate through all elements
for (int i = 0; i < myList.getSize(); i++) {
    System.out.println(myList.get(i));
}
```

## Implementation Details
- The initial capacity of the array is 10 elements
- When the array is full, its capacity is doubled
- The implementation is type-safe through the use of Java generics
- Attempting to access an index outside the valid range will throw an `IndexOutOfBoundsException`

## Limitations
This is a simplified implementation with the following limitations:
- No method to remove elements
- No method to insert elements at a specific position
- No implementation of standard Java interfaces like Iterable or Collection

## Educational Purpose
This project serves as an educational example of how dynamic arrays work under the hood and demonstrates key Java concepts including:
- Generics
- Interfaces
- Array manipulation
- Exception handling
- Type casting