# ArrayList in Java - Complete Guide

## Overview
In Java, the Collection Framework is a unified architecture for storing, retrieving, and manipulating groups of objects. It provides interfaces, implementations (classes), and algorithms that help manage collections like lists, sets, queues, and maps efficiently.

Learning ArrayList in Java is essential as it's one of the most used classes in the Java Collection Framework.

## 📘 What is an ArrayList?
An ArrayList is a resizable array, which means it can grow and shrink dynamically. It is part of the `java.util` package and implements the List interface.

Unlike arrays, you don't have to define the size of an ArrayList when creating it.

## ✅ Key Features
- Maintains insertion order
- Allows duplicate elements
- Provides random access (like arrays)
- Grows automatically as you add elements

## ✅ When to use ArrayList over arrays?
Use ArrayList when:
- You need dynamic resizing
- You frequently add/remove elements
- You want built-in methods like `.add()`, `.remove()`, `.contains()`, etc.

## 🔰 Basic Syntax

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Akarsh");
        list.add("Jha");
        list.add("Java");

        System.out.println(list); // Output: [Akarsh, Jha, Java]
    }
}
```

## 🧩 Common Methods

| Method | Description |
|--------|-------------|
| `add(element)` | Adds element to the end |
| `add(index, elem)` | Inserts at specific index |
| `get(index)` | Gets element at index |
| `set(index, elem)` | Replaces element at index |
| `remove(index)` | Removes element at index |
| `size()` | Returns size of list |
| `clear()` | Removes all elements |
| `contains(elem)` | Checks if element exists |
| `isEmpty()` | Checks if list is empty |

## 🔁 Iterating through an ArrayList

```java
ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("Kotlin");
list.add("Python");

// For loop
for(int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}

// Enhanced for loop
for(String item : list) {
    System.out.println(item);
}
```

## ⚡ Internal Working
- Internally uses a dynamic array
- If the size exceeds the current capacity, it creates a new array and copies elements

## Can ArrayList Store Mixed Types?

### ✅ Mixed Types (Not Recommended)
By default, ArrayList can store mixed types, but only if you don't use generics:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // raw type — not type-safe
        list.add(42);
        list.add("Akarsh");
        list.add(3.14);
        list.add(true);

        System.out.println(list); // [42, Akarsh, 3.14, true]
    }
}
```

### ❌ Problems with Raw Types
- Loses type safety
- You'll need type casting while retrieving elements
- Can cause runtime errors

### ✅ Best Practice: Use Generics (Type-Safe)

```java
ArrayList<String> names = new ArrayList<>();
names.add("Akarsh");
// names.add(123); ❌ Compile-time error

ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
```

### Alternative Approaches for Mixed Types

#### Option 1: ArrayList<Object>
```java
ArrayList<Object> mixed = new ArrayList<>();
mixed.add("Jha");
mixed.add(42);
mixed.add(3.14);
mixed.add(true);
```
*Note: You'll need to cast types while accessing if you care about their specific types.*

#### Option 2: Use a Wrapper Class
```java
class Person {
    String name;
    int age;
    boolean isStudent;

    public Person(String name, int age, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
    }
}

// Then:
ArrayList<Person> people = new ArrayList<>();
people.add(new Person("Akarsh", 21, true));
```

## 🔥 Summary Table

| Declaration | Can store mixed types? | Type-safe? |
|-------------|------------------------|------------|
| `ArrayList` (raw) | ✅ Yes | ❌ No |
| `ArrayList<Object>` | ✅ Yes | ⚠️ Risky |
| `ArrayList<T>` | ❌ No (Single Type) | ✅ Yes |

## 🧠 Practice Task
Try writing a program that:
1. Takes 5 names as input
2. Stores them in an ArrayList
3. Sorts them using `Collections.sort()`
4. Prints them in sorted order

## Next Steps
Consider learning:
- LinkedList
- ArrayList with custom objects
- Sorting techniques
- Conversion to arrays
