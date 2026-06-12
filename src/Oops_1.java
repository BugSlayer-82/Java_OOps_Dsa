
// /* Question 20 Putting It All Together */
// abstract class Staff {
//     protected String staffName;
//     protected int staffId;
//     static int totalStaff = 0;
//     public Staff(String staffName, int staffId) {
//         this.staffId = staffId;
//         this.staffName = staffName;
//         totalStaff++;
//     }
//     public String getStaffName() {
//         return staffName;
//     }
//     public int getStaffId() {
//         return staffId;
//     }
//     public static int getTotalStaff() {
//         return totalStaff;
//     }
//     abstract String getRole();
// }
// interface Payable {
//     double calculateSalary();
// }
// class Manager extends Staff implements Payable {
//     double baseSalary;
//     public double calculateSalary() {
//         return baseSalary * 1.3;
//     }
//     public String getRole() {
//         return "Manager";
//     }
//     Manager(double baseSalary, String staffName, int staffId) {
//         super(staffName, staffId);
//         this.baseSalary = baseSalary;
//     }
// }
// class Intern extends Staff implements Payable {
//     double stipend;
//     public double calculateSalary() {
//         return stipend;
//     }
//     public String getRole() {
//         return "Intern";
//     }
//     Intern(double stipend, String staffName, int staffId) {
//         super(staffName, staffId);
//         this.stipend = stipend;
//     }
// }
// class Department {
//     String departmentName;
//     Staff staff;
//     Department(String departmentName, Staff staff) {
//         this.departmentName = departmentName;
//         this.staff = staff;
//     }
// }

// /* Question 19 Composition (Has-A) */
// class Doctor {
// String doctorName;
// String specialization;
// public String getDoctorInfo() {
// return doctorName + " ".concat(specialization);
// }
// Doctor(String doctorName, String specialization) {
// this.doctorName = doctorName;
// this.specialization = specialization;
// }
// }
// class Appointment {
// String patientName;
// String date;
// Doctor d;
// Appointment(String patientName, String date, Doctor dr) {
// this.patientName = patientName;
// this.date = date;
// this.d = dr;
// }
// public String getAppointmentDetails() {
// return d.getDoctorInfo() + " ".concat(patientName) + " ".concat(date);
// }
// }

// /* Question 18 Method Overloading + return types */
// class ShapeCalculator {
// public double calculateArea(double radius) {
// return Math.PI * (radius * radius);
// }
// public int calculateArea(int length, int width) {
// return length * width;
// }
// public double calculateArea(float base, float height) {
// return (base * height) / 2;
// }
// }

// /* Question 17 Static Members + correct counter logic */
// class Ticket {
//     String movieName;
//     String seatNumber;
//     static int totalTicketsBooked;
//     Ticket(String movieName, String seatNumber) {
//         this.movieName = movieName;
//         this.seatNumber = seatNumber;
//         totalTicketsBooked++;
//     }
//     public static int getTotalTicketsBooked() {
//         return totalTicketsBooked;
//     }
//     public String getTicketInfo() {
//         return movieName + " " + seatNumber;
//     }
// }

// /* Question 16 Constructor Overloading + validation */
// class Order {
// String itemName;
// int quantity;
// double price;
// Order(String itemName) {
// this.itemName = itemName;
// quantity = 1;
// price = 0.0;
// System.out.println("In this constructor quantity,price is set with 1,0.0");
// }
// Order(String itemName, int quantity) {
// this.itemName = itemName;
// this.quantity = quantity;
// System.out.println("In this constructor itemName,quantity is set with actual
// value");
// }
// Order(String itemName, int quantity, double price) {
// this.itemName = itemName;
// this.quantity = quantity;
// this.price = price;
// System.out.println("In this constructor itemName,quantity,price is set with
// actual value");
// }
// public double getOrderTotal() {
// return quantity * price;
// }
// }

// /* Question 15 Interfaces + using parameters */
// interface Playable {
// String play(String songName);
// String pause();
// }
// interface Downloadable {
// String download(String songName, String quality);
// }
// class MusicPlayer implements Playable, Downloadable {
// public String play(String songName) {
// return songName;
// }
// public String pause() {
// return "paused";
// }
// public String download(String songName, String quality) {
// return songName + " " + quality;
// }
// }

// /* Question 14 Abstraction + Spelling discipline */
// abstract class Document {
// String fileName;
// int pageCount;
// Document(String fileName, int pageCount) {
// this.fileName = fileName;
// this.pageCount = pageCount;
// }
// abstract String export();
// public String getSummary() {
// String page = Integer.toString(pageCount);
// return fileName + " " + page;
// }
// }
// class PdfDocument extends Document {
// PdfDocument(String fileName, int pageCount) {
// super(fileName, pageCount);
// }
// public String export() {
// return "Document is exported in pdf form.";
// }
// }
// class WordDocument extends Document {
// WordDocument(String fileName, int pageCount) {
// super(fileName, pageCount);
// }
// public String export() {
// return "Document is exported in word form.";
// }
// }

// /* Question 13 Polymorphism + Runtime behavior */
// class PaymentMethod {
// public void pay(double amount) {
// System.out.println("Processing generic payment of Rs. ==> " + amount);
// }
// }
// class CreditCard extends PaymentMethod {
// @Override
// public void pay(double amount) {
// super.pay(amount);
// amount = amount + (0.02 * amount);
// System.out.println("Payment processing with Convenience fee ==> " + amount);
// }
// }
// class Upi extends PaymentMethod {
// @Override
// public void pay(double amount) {
// super.pay(amount);
// System.out.println("Payment processing with upi ==> " + amount);
// }
// }
// class NetBanking extends PaymentMethod {
// @Override
// public void pay(double amount) {
// super.pay(amount);
// System.out.println("Payment processing with netbanking ==> " + amount);
// }
// }

// /* Question 12 Inheritance + super() */
// class Player {
// String playerName;
// int jerseyNumber;
// Player(String playerName, int jerseyNumber) {
// this.playerName = playerName;
// this.jerseyNumber = jerseyNumber;
// }
// public void displayInfo() {
// System.out.println("Player name ==>" + this.playerName);
// System.out.println("Jersey Number ==> " + this.jerseyNumber);
// }
// }
// class Footballer extends Player {
// String position;
// Footballer(String playerName, int jerseyNumber, String position) {
// super(playerName, jerseyNumber);
// this.position = position;
// }
// @Override
// public void displayInfo() {
// super.displayInfo();
// System.out.println("Position ==> " + this.position);
// }
// }
// class Cricketer extends Player {
// boolean isWicketKeeper;
// Cricketer(String playerName, int jerseyNumber, boolean isWicketKeeper) {
// super(playerName, jerseyNumber);
// this.isWicketKeeper = isWicketKeeper;
// }
// @Override
// public void displayInfo() {
// super.displayInfo();
// System.out.println("Is wicket keeper ==> " + this.isWicketKeeper);
// }
// }

// /* Question 11 Encapsulation + Getters/Setters */
// class UserProfile {
// private String username;
// private String email;
// private int age;
// UserProfile(String username, String email, int age) {
// this.username = username;
// this.email = email;
// this.age = age;
// }
// public String getUserName() {
// return this.username;
// }
// public String getEmail() {
// return this.email;
// }
// public int getAge() {
// return this.age;
// }
// public void setEmail(String email) {
// if (email.contains("@")) {
// this.email = email;
// } else {
// System.out.println("Invalid email.");
// return;
// }
// }
// }

// /* Question 10 Putting It All Together */
// abstract class Animal {
// String name;
// int age;
// Animal(String name, int age) {
// this.name = name;
// this.age = age;
// }
// abstract void makeSound();
// public void displayInfo() {
// System.out.println("Name ==> " + this.name);
// System.out.println("Age ==> " + this.age);
// }
// }
// class Lion extends Animal {
// Lion(String name, int age) {
// super(name, age);
// }
// @Override
// public void makeSound() {
// System.out.println("Lion is shout.");
// }
// }
// interface Trainable {
// void performTrick();
// }
// class Parrot extends Animal implements Trainable {
// Parrot(String name, int age) {
// super(name, age);
// }
// public void performTrick() {
// System.out.println("Trainer is try to train the animal .");
// }
// @Override
// public void makeSound() {
// System.out.println("Parrot is shout.");
// }
// }

// /* Question 9 Composition (Has-A Relationship) */
// class Author {
// String name;
// String nationality;
// Author(String name, String nationality) {
// this.name = name;
// this.nationality = nationality;
// }
// }
// class Book {
// Author author;
// String title;
// int year;
// Book(Author auth, String title, int year) {
// this.author = auth;
// this.title = title;
// this.year = year;
// }
// public void displayBookInfo() {
// System.out.println("Book title ==> " + this.title);
// System.out.println("Name ==> " + author.name);
// System.out.println("Year ==> " + this.year);
// System.out.println("Nationality ==> " + author.nationality);
// }
// }

// /* Question 8 Method overloading */
// class Calculator {
// public int add(int a, int b) {
// return a + b;
// }
// public int add(int a, int b, int c) {
// return a + b + c;
// }
// public double add(double a, double b) {
// return a + b;
// }
// }

// /* Question 7 Static Members */
// class Employee {
// String name;
// int id;
// static int totalEmployees = 0;
// Employee(String name, int id) {
// this.name = name;
// this.id = id;
// totalEmployees++;
// }
// static int getTotalEmployees() {
// return totalEmployees;
// }
// }
// /* Question 6 Cosntructor Overloading */
// class Student {
// String name;
// int age;
// String course;
// Student(String name) {
// this.name = name;
// System.out.println("Student registered with name only");
// }
// Student(String name, int age) {
// this.name = name;
// this.age = age;
// System.out.println("Student registered with name and age");
// }
// Student(String name, int age, String course) {
// this.name = name;
// this.age = age;
// this.course = course;
// System.out.println("Student fully registered");
// }
// }

// /* Question 5 Interfaces */
// interface SmartDevice {
// String turnOn();
// String turnOff();
// }
// interface VoiceControlled {
// void respondToVoice(String command);
// }
// class SmartSpeaker implements SmartDevice, VoiceControlled {
// public String turnOn() {
// return "Speaker on";
// }
// public String turnOff() {
// return "Speaker off";
// }
// public void respondToVoice(String command) {
// System.out.println("Speaker on");
// }
// }

// /* Question 4 Abstraction */
// abstract class Payment {
// double amount;
// Payment(double amount) {
// this.amount = amount;
// }
// abstract double processPayment(double amount);
// public String printReceipt() {
// return "Receipt generated .";
// }
// }
// class CreditCardPayment extends Payment {
// CreditCardPayment(double amount) {
// super(amount);
// }
// public double processPayment(double amount) {
// System.out.println("Processing Credit card amount ==> " + amount);
// return amount;
// }
// }
// class UPIpayment extends Payment {
// UPIpayment(double amount) {
// super(amount);
// }
// public double processPayment(double amount) {
// System.out.println("Processing Upi amount ==> " + amount);
// return amount;
// }
// }

// /* Question 3 Polymorphism */
// class Notification {
// public void send() {
// System.out.println("Sending a generic notification");
// }
// }
// class EmailNotification extends Notification {
// @Override
// public void send() {
// super.send();
// System.out.println("Sending Email Notification");
// }
// }
// class SMSNotification extends Notification {
// @Override
// public void send() {
// super.send();
// System.out.println("Sending Sms Notification");
// }
// }
// class PushNotification extends Notification {
// @Override
// public void send() {
// super.send();
// System.out.println("Sending Push Notification");
// }
// }

// /* Question 2 Inheritance*/
// class Vehicle {
// String brand;
// int speed;
// Vehicle(String brand, int speed) {
// this.brand = brand;
// this.speed = speed;
// }
// public void displayInfo() {
// System.out.println("Brand ==> " + brand);
// System.out.println("Speed ==> " + speed);
// }
// }
// class Car extends Vehicle {
// int numberOfDoors;
// Car(String brand, int speed, int numberOfDoors) {
// super(brand, speed);
// this.numberOfDoors = numberOfDoors;
// }
// @Override
// public void displayInfo() {
// super.displayInfo();
// System.out.println("Number of doors ==> " + numberOfDoors);
// }
// }
// class Bike extends Vehicle {
// boolean hasSideCar;
// Bike(String brand, int speed, boolean hasSideCar) {
// super(brand, speed);
// this.hasSideCar = hasSideCar;
// }
// @Override
// public void displayInfo() {
// super.displayInfo();
// System.out.println("Side car is available ==> " + hasSideCar);
// }
// }

// /* Question 1 Encapsulation */
// class BankAccount {
// private String ownerName;
// private double balance;
// public BankAccount(String ownerName) {
// this.ownerName = ownerName;
// }
// public void deposit(double amount) {
// balance += amount;
// }
// public void withdraw(double amount) {
// if (amount > balance) {
// System.out.println("Exceed the limit ...!");
// return;
// }
// balance -= amount;
// }
// public void getName() {
// System.out.println("OwnerName ==> " + ownerName);
// }
// public double getBalance() {
// return balance;
// }
// }

public class Oops_1 {
    public static void main(String[] args) {

        // /* Question 1 ====> Encapsulation*/
        // BankAccount acc = new BankAccount("Popoye");
        // acc.getName();
        // acc.deposit(50000);
        // acc.withdraw(10000);
        // System.out.println("Balance ==> " + acc.getBalance());
        // acc.withdraw(10000);
        // System.out.println("Balance ==> " + acc.getBalance());

        // /* Question 2 ====> Inheritance*/
        // Car c1 = new Car("Mercedez", 400, 4);
        // Bike b1 = new Bike("Splendor", 40, false);
        // c1.displayInfo();
        // b1.displayInfo();

        // /* Question 3 ====> Polymorphism */
        // Notification n[] = new Notification[3];
        // n[0] = new EmailNotification();
        // n[1] = new SMSNotification();
        // n[2] = new PushNotification();
        // for (int i = 0; i < 3; i++) {
        // n[i].send();
        // System.out.println();
        // }

        // /* Question 4 ====> Abstraction */
        // CreditCardPayment ccp = new CreditCardPayment(10000.0);
        // UPIpayment upi = new UPIpayment(6000.2);
        // System.out.println("Credit card balance ==> " + ccp.processPayment(2000));
        // System.out.println("Upi balance ==> " + upi.processPayment(3000));
        // System.out.println(ccp.printReceipt());
        // System.out.println(upi.printReceipt());

        // /* Question 5 ====> Interfaces */
        // SmartSpeaker smp = new SmartSpeaker();
        // smp.respondToVoice("Turn on");
        // System.out.println(smp.turnOff());
        // System.out.println(smp.turnOn());

        // /* Question 6 ====> Constructof overloading */
        // Student s1 = new Student("Popoye");
        // Student s2 = new Student("Popoye", 23);
        // Student s3 = new Student("Popoye", 24, "CSE");

        // /* Question 7 ====> Static members */
        // Employee emp1 = new Employee("Natasha", 22);
        // Employee emp2 = new Employee("Tony", 45);
        // Employee emp3 = new Employee("Popoye", 23);
        // System.out.println("Count ==> " + Employee.getTotalEmployees());

        // /* Question 8 ====> Method Overloading */
        // Calculator calc = new Calculator();
        // System.out.println(calc.add(4, 5));
        // System.out.println(calc.add(4, 5, 7));
        // System.out.println(calc.add(4.8d, 5.6d));

        // /* Question 9 ====> Composition (Has-A Relationship) */
        // Author auth = new Author("Tony", "NewYork");
        // Book b1 = new Book(auth, "Let us C", 2026);
        // b1.displayBookInfo();

        // /* Question 10 ====> Putting It All Together */
        // Animal list[] = new Animal[2];
        // list[0] = new Lion("Lion", 40);
        // list[1] = new Parrot("Parrot", 10);
        // for (int i = 0; i < 2; i++) {
        // list[i].displayInfo();
        // list[i].makeSound();
        // }
        // Parrot p1 = new Parrot("Popoye", 15);
        // p1.performTrick();

        // /* Question 11 ====> Encapsulation + Getters/Setters */
        // UserProfile usrpr = new UserProfile("Tony", "tonystark34@gamil.com", 24);
        // System.out.println(usrpr.getAge());
        // System.out.println(usrpr.getEmail());
        // System.out.println(usrpr.getUserName());
        // usrpr.setEmail("steve34gmail.com");
        // System.out.println(usrpr.getEmail());

        // /* Question 12 ====> Inheritance + super() */
        // Footballer fb = new Footballer("TonyStark", 15, "first");
        // Cricketer crk = new Cricketer("Steve", 19, true);
        // fb.displayInfo();
        // crk.displayInfo();

        // /* Question 13 ====> Polymorphism + Runtime behavior */
        // PaymentMethod[] pmt = new PaymentMethod[3];
        // pmt[0] = new CreditCard();
        // pmt[1] = new Upi();
        // pmt[2] = new NetBanking();
        // for (int i = 0; i < 3; i++) {
        // pmt[i].pay(5000.0d);
        // }

        // /* Question 14 ====> Abstraction + Spelling discipline */
        // PdfDocument pdf = new PdfDocument("Tony biography", 1000);
        // WordDocument word = new WordDocument("Thor biography", 500);
        // System.out.println("FileName & PageCount ==> " + pdf.getSummary());
        // System.out.println("FileName & PageCount ==> " + word.getSummary());
        // System.out.println(pdf.export());
        // System.out.println(word.export());

        // /* Question 15 ====> Interfaces + using parameters*/
        // MusicPlayer mp = new MusicPlayer();
        // System.out.println("Current music ==> " + mp.play("Aaj ki raat"));
        // System.out.println("Music is ==> " + mp.pause());
        // System.out.println("Downloaded music ==> " + mp.download("Headlight",
        // "320kbps"));

        // /* Question 16 ====> Constructor Overloading + validation */
        // Order o1 = new Order("Pizza");
        // Order o2 = new Order("Burger", 4);
        // Order o3 = new Order("Pizza", 12, 2.2d);
        // System.out.println("Total price ==> " + o1.getOrderTotal());
        // System.out.println("Total price ==> " + o2.getOrderTotal());
        // System.out.println("Total price ==> " + o3.getOrderTotal());

        // /* Question 17 ====> Static Members + correct counter logic */
        // Ticket tck1 = new Ticket("Avenger", "201");
        // Ticket tck2 = new Ticket("Thor", "202");
        // Ticket tck3 = new Ticket("Iron man", "203");
        // Ticket tck4 = new Ticket("Endgame", "204");
        // Ticket tck5 = new Ticket("Endgame", "204");
        // System.out.println("TicketInfo ==> " + tck1.getTicketInfo());
        // System.out.println("TicketInfo ==> " + tck2.getTicketInfo());
        // System.out.println("TicketInfo ==> " + tck3.getTicketInfo());
        // System.out.println("TicketInfo ==> " + tck4.getTicketInfo());
        // System.out.println("TicketInfo ==> " + tck5.getTicketInfo());
        // System.out.println("Total count ==> " + Ticket.getTotalTicketsBooked());

        // /* Question 18 ====> Method Overloading + return types */
        // ShapeCalculator shape = new ShapeCalculator();
        // System.out.println("Area of circle ==> " + shape.calculateArea(4.0d));
        // System.out.println("Area of rectangle ==> " + shape.calculateArea(3, 3));
        // System.out.println("Area of triangle ==> " + shape.calculateArea(2.0f,
        // 2.0f));

        // /* Question 19 ====> Composition (Has-A) */
        // Doctor d = new Doctor("Banner", "Neurologist");
        // Appointment apm = new Appointment("Thor", "23/03/2024", d);
        // System.out.println("Appointment Info ==> " + apm.getAppointmentDetails());

        // /* Question 20 ====> Putting It All Together */
        // Manager mng = new Manager(250.24d, "Tony", 216);
        // Intern inr = new Intern(250.0d, "Batak", 265);
        // Department dep1 = new Department("IT", mng);
        // Department dep2 = new Department("Core", inr);
        // System.out.println("Detail 1");
        // System.out.println("Name ==> " + dep1.staff.getStaffName());
        // System.out.println("StaffId ==> " + dep1.staff.getStaffId());
        // System.out.println("Role ==> " + dep1.staff.getRole());
        // System.out.println("Salary ==> " + ((Payable) dep1.staff).calculateSalary());
        // System.out.println("Detail 2");
        // System.out.println("Name ==> " + dep2.staff.getStaffName());
        // System.out.println("StaffId ==> " + dep2.staff.getStaffId());
        // System.out.println("Role ==> " + dep2.staff.getRole());
        // System.out.println("Salary ==> " + ((Payable) dep2.staff).calculateSalary());
    }
}
