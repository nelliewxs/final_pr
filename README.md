# 🏠 Property Listing Manager

## 👤 Student

Zhumanalieva Nuriya

---

## 📌 Project Description

Property Listing Manager is a console-based Java application designed to manage real estate listings for sale or rent.
The system allows users to create, view, update, and delete property records such as houses and apartments.

The project demonstrates core Object-Oriented Programming (OOP) concepts and provides a simple but functional data management system.

---

## 🎯 Objectives

* Apply Object-Oriented Programming principles in a real project
* Implement CRUD (Create, Read, Update, Delete) operations
* Build a user-friendly Command Line Interface (CLI)
* Store and retrieve data using file handling
* Ensure input validation and error handling
* Design a modular and maintainable system

---

## ✅ Project Requirements

The following requirements are implemented in the project:

1. Add new property
2. View all properties
3. Update property details
4. Delete property
5. Command Line Interface (CLI)
6. Input validation
7. Error handling
8. Data persistence using file storage
9. Import and export data from file
10. Use of OOP principles (Encapsulation, Inheritance, Polymorphism)

---

## 🧠 OOP Concepts Implementation

### 🔒 Encapsulation

* Private fields in `Property` class (`id`, `title`, `price`)
* Access controlled via getters and setters

### 🧬 Inheritance

* `House` and `Apartment` classes extend the base class `Property`

### 🔄 Polymorphism

* Method `display()` is overridden in child classes
* Allows different output for different property types

---

## 🏗️ Project Structure

```bash
src/
 └── com/propertymanager/
      ├── Main.java
      ├── Property.java
      ├── House.java
      ├── Apartment.java
      ├── PropertyManager.java
      ├── FileHandler.java
```

---

## ⚙️ Technologies Used

* Java
* ArrayList (for data storage in memory)
* File I/O (BufferedReader, BufferedWriter)

---

## 💾 Data Storage

* Data is stored in a file: `data.txt`
* Each line represents one property
* Format example:

```
House,1,Villa,100000,5
Apartment,2,Flat,50000,3
```

* Data is automatically:

  * Loaded when the program starts
  * Saved when the program exits

---

## 🧪 Test Cases

### ➤ Add Property

**Input:**

```
1
1
Villa
100000
1
5
```

**Output:**

```
Property added successfully!
```

---

### ➤ View Properties

**Output:**

```
[House] ID: 1 | Villa | $100000.0 | Rooms: 5
```

---

### ➤ Update Property

**Input:**

```
3
1
120000
```

**Output:**

```
Property updated.
```

---

### ➤ Delete Property

**Input:**

```
4
1
```

**Output:**

```
Property deleted.
```

---

## ⚠️ Error Handling & Validation

The system includes:

* Try-catch blocks to prevent crashes
* Validation for incorrect input types
* Protection against empty inputs
* Basic user input error messages

---

## 📊 Algorithms & Data Structures

### Data Structure:

* `ArrayList<Property>` is used to store properties dynamically

### Algorithms:

* Linear search is used for:

  * Finding property by ID
  * Updating records
  * Deleting records

---

## ⚠️ Challenges Faced

* Handling file reading and parsing correctly
* Managing different property types during file load
* Ensuring clean OOP design
* Implementing user input validation

---

## 🚀 Future Improvements

* Add search and filtering functionality
* Implement sorting (by price, title)
* Develop GUI using JavaFX or Swing
* Replace file storage with database (MySQL / SQLite)
* Add authentication system (Admin/User roles)

---

## 📸 Screenshots

*(Add screenshots here showing: Add, View, Update, Delete operations with date & time visible)*

---

## 🔗 Project Repository

https://github.com/nelliewxs/final_pr.git

---

