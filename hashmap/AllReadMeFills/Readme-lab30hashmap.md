

# Hashtable Implementation in Java

This is a simple implementation of a hashtable data structure in Java. It provides methods to set and retrieve key-value pairs, check for the existence of keys, list all unique keys, handle collisions, and hash keys to appropriate indices within the collection.

## Table of Contents

- [Usage](#usage)
- [Implementation](#implementation)
- [Testing](#testing)


## Usage

To use the Hashtable class, follow these steps:

1. Import the `Hashtable` class into your Java project.

2. Create an instance of the `Hashtable` class with a specific data type for keys and values:

   ```java
   Hashtable<String, Integer> hashtable = new Hashtable<>();
   ```

3. Use the provided methods to interact with the hashtable:

    - `set(key, value)`: Add or update a key-value pair.
    - `get(key)`: Retrieve a value by key.
    - `has(key)`: Check if a key exists in the hashtable.
    - `keys()`: Get a collection of unique keys.
    - `hash(key)`: Calculate the index for a key.

4. Run your Java program to test the hashtable functionality.

## Implementation

The `Hashtable` class is implemented using an array of linked lists to handle collisions. The hash function calculates the index based on the key's hash code and a modulo operation. It uses a load factor to trigger resizing when necessary for efficient performance.

## Testing

The project includes JUnit tests to verify the functionality of the `Hashtable` class. You can run these tests to ensure that the set, get, has, keys, and hash operations work as expected.

To run the tests, make sure you have the JUnit library added to your project, and then execute the test methods in the `HashtableTest` class.

---

The time complexity of your Hashtable operations varies depending on the number of collisions. In the best case (few collisions), operations are close to O(1), providing efficient performance. However, in the worst case (many collisions), the time complexity can degrade to O(n), where n is the number of entries in a bucket.

The space complexity of your Hashtable is O(n), as it uses additional memory to store key-value pairs. It's important to consider the potential worst-case scenarios when analyzing the performance of your Hashtable in practice.