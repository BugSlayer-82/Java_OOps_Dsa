# Java OOP + Data Structures Practice Set (5 Questions)

## Instructions

-   Variable names are provided.
-   You must decide:
    -   Variable types
    -   Access modifiers
    -   Return types
    -   Suitable Data Structure
    -   Appropriate OOP concepts

------------------------------------------------------------------------

# Question 1 --- Movie Ticket Booking System

You are building a **Movie Ticket Booking System**.

Create a class called `MovieShow`.

The class should store:

-   Movie Id
-   Movie Name
-   Show Time
-   Total Seats
-   All Seat Bookings

### Constructor

Initialize:

-   Movie Id
-   Movie Name
-   Show Time
-   Total Seats

Initially no booking should exist.

### Methods

-   `bookSeat(...)`

    -   Store Customer Name, Ticket Id and Seat Number.
    -   Do not allow duplicate seat booking.

-   `cancelBooking(...)`

    -   Cancel booking using Seat Number.

-   `searchBooking(...)`

    -   Search booking using Ticket Id.

-   `getAvailableSeats()`

-   `getBookedSeats()`

-   `generateReport()`

    -   Return complete booking report.

### Main Method

-   Create one movie show.
-   Book 6 seats.
-   Cancel one booking.
-   Search one booking.
-   Print final report.

------------------------------------------------------------------------

# Question 2 --- Online Food Ordering System

Create a class called `Restaurant`.

The class should store:

-   Restaurant Id
-   Restaurant Name
-   All Food Items

Create another class called `FoodItem`.

Store:

-   Food Id
-   Food Name
-   Price
-   Category

### Constructor

Initialize all details.

Initially no food item exists.

### Methods

-   addFoodItem(...)
-   removeFoodItem(...)
-   updateFoodPrice(...)
-   searchFood(...)
-   showMenu()
-   generateRestaurantReport()

### Main Method

-   Create one restaurant.
-   Add 8 food items.
-   Update one price.
-   Remove one item.
-   Search one item.
-   Print complete menu.

------------------------------------------------------------------------

# Question 3 --- Library Management System

Create a class called `Library`.

Store:

-   Library Id
-   Library Name
-   All Books
-   Issued Books

Create another class called `Book`.

Store:

-   Book Id
-   Book Name
-   Author Name
-   Publication

### Constructor

Initialize all details.

Initially no book is issued.

### Methods

-   addBook(...)
-   issueBook(...)
-   returnBook(...)
-   searchBook(...)
-   getIssuedBooks()
-   generateLibraryReport()

### Main Method

-   Add 10 books.
-   Issue 3 books.
-   Return one.
-   Search two books.
-   Print report.

------------------------------------------------------------------------

# Question 4 --- Hospital Management System

Create a class called `Hospital`.

Store:

-   Hospital Id
-   Hospital Name
-   Doctors
-   Patients
-   Appointments

Create classes:

Doctor

Store:

-   Doctor Id
-   Doctor Name
-   Specialization

Patient

Store:

-   Patient Id
-   Patient Name
-   Disease

### Methods

-   addDoctor(...)
-   addPatient(...)
-   bookAppointment(...)
-   cancelAppointment(...)
-   searchAppointment(...)
-   generateHospitalReport()

### Main Method

-   Add doctors.
-   Add patients.
-   Book appointments.
-   Cancel one.
-   Print report.

------------------------------------------------------------------------

# Question 5 --- Banking System

Create a class called `Bank`.

Store:

-   Bank Name
-   Branch Name
-   All Accounts

Create another class called `Account`.

Store:

-   Account Number
-   Holder Name
-   Balance

### Constructor

Initialize all details.

### Methods

-   createAccount(...)
-   deposit(...)
-   withdraw(...)
-   transferMoney(...)
-   searchAccount(...)
-   generateBankReport()

### Main Method

-   Create multiple accounts.
-   Deposit money.
-   Withdraw money.
-   Transfer money.
-   Search one account.
-   Print final report.

------------------------------------------------------------------------

## Important

For every question you must decide yourself:

-   Appropriate Data Structure
-   Appropriate Variable Types
-   Appropriate Access Modifiers
-   Appropriate Return Types
-   Appropriate OOP Concepts
