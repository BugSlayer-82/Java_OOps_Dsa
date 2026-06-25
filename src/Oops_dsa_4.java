// import java.util.Queue;
// import java.util.Stack;
// import java.util.Vector;
// import java.util.HashSet;
// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.LinkedList;

// /* Question 8 Static + Composition + Queue + StringBuilder (Hard) */

// /* Question 7 Abstract + Interface + HashSet + LinkedList (Hard) */
// interface Trackable {
//     String getId();
//     String getSummary();
// }
// abstract class UniversityMember {
//     private String memberId;
//     private String memberName;
//     UniversityMember(String memberId, String memberName) {
//         this.memberId = memberId;
//         this.memberName = memberName;
//     }
//     public String getMemberId() {
//         return memberId;
//     }
//     public String getMemberName() {
//         return memberName;
//     }
//     public abstract String getRole();
// }
// class Professor extends UniversityMember implements Trackable {
//     private String subject;
//     private HashSet<String> set = new HashSet<>();
//     Professor(String memberId, String memberName, String subject) {
//         super(memberId, memberName);
//         this.subject = subject;
//     }
//     public String getSubject() {
//         return subject;
//     }
//     public String getRole() {
//         return "Professor";
//     }
//     public String getId() {
//         return getMemberId(); // here
//     }
//     public void addResearchTopic(String topic) {
//         set.add(topic);
//     }
//     public String getSummary() {
//         return getMemberName() + " " + subject + " " + set;
//     }
// }
// class GradStudent extends UniversityMember implements Trackable {
//     private String thesisTopic;
//     private String supervisorId;
//     GradStudent(String memberId, String memberName, String thesisTopic, String supervisorId) {
//         super(memberId, memberName);
//         this.thesisTopic = thesisTopic;
//         this.supervisorId = supervisorId;
//     }
//     public String getRole() {
//         return "Graduate Student";
//     }
//     public String getId() {
//         return getMemberId();
//     }
//     public String getSummary() {
//         return getMemberName() + " " + thesisTopic + " " + supervisorId;
//     }
// }
// class Department {
//     private String departmentName;
//     private LinkedList<Professor> pList = new LinkedList<>();
//     private LinkedList<GradStudent> gList = new LinkedList<>();
//     Department(String departmentName) {
//         this.departmentName = departmentName;
//     }
//     public String getDepartmentName() {
//         return departmentName;
//     }
//     public void addProfessor(Professor p) {
//         pList.add(p);
//     }
//     public void addGradStudent(GradStudent g) {
//         gList.add(g);
//     }
//     public String getDepartmentReport() {
//         StringBuilder sb = new StringBuilder();
//         for (Professor pr : pList) {
//             sb.append(pr.getSummary()).append("\n");
//         }
//         for (GradStudent gr : gList) {
//             sb.append(gr.getSummary()).append("\n");
//         }
//         return sb.toString();
//     }
// }

// /* Question 6 Polymorphism + Vector + StringBuilder (Medium) */
// class Employee {
// private String employeeId;
// private String employeeName;
// private double baseSalary;
// Employee(String employeeId, String employeeName, double baseSalary) {
// this.employeeId = employeeId;
// this.employeeName = employeeName;
// this.baseSalary = baseSalary;
// }
// public String getEmployeeId() {
// return employeeId;
// }
// public String getEmployeeName() {
// return employeeName;
// }
// public double getBaseSalary() {
// return baseSalary;
// }
// public String getPayDetails() {
// return "Base salary for " + employeeName + ": " + baseSalary;
// }
// }
// class FullTimeEmployee extends Employee {
// private double bonus;
// FullTimeEmployee(String employeeId, String employeeName, double baseSalary,
// double bonus) {
// super(employeeId, employeeName, baseSalary);
// this.bonus = bonus;
// }
// public double getBonus() {
// return bonus;
// }
// @Override
// public String getPayDetails() {
// return super.getPayDetails() + ", Bonus --> " + bonus;
// }
// }
// class PartTimeEmployee extends Employee {
// private int hoursWorked;
// private double hourlyRate;
// PartTimeEmployee(String employeeId, String employeeName, double baseSalary,
// int hoursWorked, double hourlyRate) {
// super(employeeId, employeeName, baseSalary);
// this.hoursWorked = hoursWorked;
// this.hourlyRate = hourlyRate;
// }
// public int getHoursWorked() {
// return hoursWorked;
// }
// public double getHourlyRate() {
// return hourlyRate;
// }
// @Override
// public String getPayDetails() {
// return super.getPayDetails() + ", HourlyRate --> " + hourlyRate + ",
// HoursWorked --> " + hoursWorked;
// }
// }
// class Contractor extends Employee {
// private double contractAmount;
// Contractor(String employeeId, String employeeName, double baseSalary, double
// contractAmount) {
// super(employeeId, employeeName, baseSalary);
// this.contractAmount = contractAmount;
// }
// public double getContractAmount() {
// return contractAmount;
// }
// @Override
// public String getPayDetails() {
// return super.getPayDetails() + ", Contract Amount --> " + contractAmount;
// }
// }
// class PayrollSystem {
// private String companyName;
// private Vector<Employee> emp = new Vector<>();
// PayrollSystem(String companyName) {
// this.companyName = companyName;
// }
// public String getCompanyName() {
// return companyName;
// }
// public void addEmployee(Employee e) {
// emp.add(e);
// }
// public String generatePayrollReport() {
// StringBuilder sb = new StringBuilder();
// for (Employee em : emp) {
// sb.append(em.getEmployeeId()).append(" ");
// sb.append(em.getEmployeeName()).append(" ");
// sb.append(em.getPayDetails()).append(" ");
// sb.append("\n");
// }
// return sb.toString();
// }
// }

// /* Question 5 Interface + HashSet + ArrayList (Medium) */
// interface Enrollable {
// String getStudentId();
// String enroll(String courseCode);
// Collection<String> getEnrolledCourses();
// }
// class Student implements Enrollable {
// private String studentId;
// private String studentName;
// private HashSet<String> set = new HashSet<>();
// Student(String studentId, String studentName) {
// this.studentId = studentId;
// this.studentName = studentName;
// }
// public String getStudentId() {
// return studentId;
// }
// public String getStudentName() {
// return studentName;
// }
// public String enroll(String courseCode) {
// if (set.add(courseCode)) {
// return "Enrolled in: " + courseCode;
// }
// return "Already enrolled in: " + courseCode;
// }
// public Collection<String> getEnrolledCourses() {
// return set;
// }
// }
// class CourseRegistry {
// private String registryName;
// private ArrayList<Student> students = new ArrayList<>();
// CourseRegistry(String registryName) {
// this.registryName = registryName;
// }
// public String getRegistryName() {
// return registryName;
// }
// public void registerStudent(Student s) {
// students.add(s);
// }
// public Student getStudentById(String studentId) {
// for (Student std : students)
// if (studentId.equals(std.getStudentId())) {
// return std;
// }
// return null;
// }
// public ArrayList<Student> getAllStudents() {
// return students;
// }
// }

// /* Question 4 Abstraction + Queue + LinkedList (Medium) */
// abstract class DeliveryOrder {
// private String orderId;
// private String customerAddress;
// private double totalAmount;
// public DeliveryOrder(String orderId, String customerAddress, double
// totalAmount) {
// this.orderId = orderId;
// this.customerAddress = customerAddress;
// this.totalAmount = totalAmount;
// }
// public String getOrderId() {
// return orderId;
// }
// public String getCustomerAddress() {
// return customerAddress;
// }
// public double getTotalAmount() {
// return totalAmount;
// }
// public abstract String getDeliveryType(); // Make this method to public after
// complete another classes
// public String getOrderSummary() {
// return orderId + " " + customerAddress + " " + totalAmount + " " +
// getDeliveryType();
// }
// }
// class ExpressDelivery extends DeliveryOrder {
// public String getDeliveryType() {
// return "EXPRESS";
// }
// public ExpressDelivery(String orderId, String customerAddress, double
// totalAmount) {
// super(orderId, customerAddress, totalAmount);
// }
// }
// class StandardDelivery extends DeliveryOrder {
// public String getDeliveryType() {
// return "STANDARD";
// }
// public StandardDelivery(String orderId, String customerAddress, double
// totalAmount) {
// super(orderId, customerAddress, totalAmount);
// }
// }
// class DeliveryQueue {
// private LinkedList<DeliveryOrder> queue = new LinkedList<>();
// public void placeOrder(DeliveryOrder order) {
// queue.add(order);
// }
// public DeliveryOrder dispatchNext() {
// if (queue.isEmpty()) {
// return null;
// }
// return queue.remove();
// }
// public int getPendingCount() {
// return queue.size();
// }
// }

// /* Question 3 Inheritance + ArrayList + StringBuilder (Medium) */
// class Vehicle {
// private String vehicleId;
// private String brand;
// private int year;
// Vehicle(String vehicleId, String brand, int year) {
// this.vehicleId = vehicleId;
// this.brand = brand;
// this.year = year;
// }
// public String getVehicleId() {
// return vehicleId;
// }
// public String getBrand() {
// return brand;
// }
// public int getYear() {
// return year;
// }
// public String getVehicleInfo() {
// return vehicleId + " " + brand + " " + year;
// }
// }
// class Car extends Vehicle {
// private int numberOfDoors;
// Car(String vehicleId, String brand, int year, int numberOfDoors) {
// super(vehicleId, brand, year);
// this.numberOfDoors = numberOfDoors;
// }
// @Override
// public String getVehicleInfo() {
// return super.getVehicleInfo() + " " + numberOfDoors;
// }
// }
// class Bike extends Vehicle {
// private String bikeType;
// Bike(String vehicleId, String brand, int year, String bikeType) {
// super(vehicleId, brand, year);
// this.bikeType = bikeType;
// }
// @Override
// public String getVehicleInfo() {
// return super.getVehicleInfo() + " " + bikeType;
// }
// }
// class RentalAgency {
// private String agencyName;
// private ArrayList<Vehicle> vehList = new ArrayList<Vehicle>();
// RentalAgency(String agencyName) {
// this.agencyName = agencyName;
// }
// public String getAgencyName() {
// return agencyName;
// }
// public void addVehicle(Vehicle v) {
// vehList.add(v);
// }
// public String getRentalCatalog() {
// StringBuilder sb = new StringBuilder();
// for (Vehicle vh : vehList) {
// sb.append(vh.getVehicleInfo());
// sb.append("\n");
// }
// return sb.toString();
// }
// }

// /* Question 2 Encapsulation + Stack + StringBuilder (Easy) */
// class CodeEditor {
// private String fileName;
// private StringBuilder sb = new StringBuilder();
// private Stack<String> snapShot = new Stack<>();
// CodeEditor(String fileName) {
// this.fileName = fileName;
// }
// public String getFileName() {
// return fileName;
// }
// public void typeCode(String code) {
// String currContent = sb.toString();
// snapShot.push(currContent);
// sb.append(code);
// }
// public String undo() {
// if (snapShot.isEmpty()) {
// return "Nothing to undo";
// }
// String prevState = snapShot.pop();
// sb.setLength(0);
// sb.append(prevState);
// return "";
// }
// public String getCurrentCode() {
// return sb.toString();
// }
// }

// /* Question 1 Encapsulation + StringBuilder + ArrayList (Easy) */
// class Note {
// private String noteId;
// private String title;
// private StringBuilder sb = new StringBuilder();
// Note(String noteId, String title) {
// this.noteId = noteId;
// this.title = title;
// }
// public void appendContent(String text) {
// sb.append(text);
// }
// public void clearContent() {
// sb.setLength(0);
// }
// public String getContent() {
// return sb.toString();
// }
// public String getNoteId() {
// return noteId;
// }
// public String getTitle() {
// return title;
// }
// }
// class NoteBook {
// private String ownerName;
// private ArrayList<Note> list = new ArrayList<Note>();
// NoteBook(String ownerName) {
// this.ownerName = ownerName;
// }
// public String getOwnerName() {
// return ownerName;
// }
// public void addNote(Note note) {
// list.add(note);
// }
// public Note getNoteById(String noteId) {
// for (Note n : list) {
// if ((n.getNoteId()).equals(noteId)) {
// return n;
// }
// }
// return null;
// }
// public ArrayList<Note> getAllNotes() {
// return list;
// }
// }

public class Oops_dsa_4 {
    public static void main(String[] args) {
        // /* Question 1 ===> Encapsulation + StringBuilder + ArrayList (Easy) */
        // NoteBook nb = new NoteBook("Tony Stark");
        // Note n1 = new Note("N-024", "Graphs");
        // Note n2 = new Note("N-570", "Tree");
        // Note n3 = new Note("N-608", "Set");
        // nb.addNote(n1);
        // nb.addNote(n2);
        // nb.addNote(n3);
        // n1.appendContent("Jarvis ");
        // n1.appendContent("Friday");
        // n2.appendContent("3d-Plain ");
        // n2.appendContent("2d-Plain");
        // n3.appendContent("Green Tree ");
        // n3.appendContent("Yellow Tree");
        // Note nadd = nb.getNoteById("N-570");
        // nadd.clearContent();
        // nadd.appendContent("4d-Plain");
        // for (Note e : nb.getAllNotes()) {
        // System.out.print(
        // "NoteId ==> " + e.getNoteId()
        // + "\n" +
        // "Title ==> " + e.getTitle()
        // + "\n" +
        // "Content ==> " + e.getContent()
        // + "\n");
        // }

        // /* Question 2 ===> Encapsulation + Stack + StringBuilder (Easy) */
        // CodeEditor ce = new CodeEditor("Linux.txt");
        // ce.typeCode("cd");
        // ce.typeCode("ls");
        // ce.typeCode("clear");
        // ce.undo();
        // System.out.println("Current code ==> " + ce.getCurrentCode());
        // ce.undo();
        // System.out.println("Current code ==> " + ce.getCurrentCode());

        // /* Question 3 ===> Inheritance + ArrayList + StringBuilder (Medium) */
        // Car c1 = new Car("C-503", "Porche", 2003, 4);
        // Car c2 = new Car("C-501", "BMW", 2002, 4);
        // Bike b1 = new Bike("B-609", "R15", 2008, "Petrol");
        // Bike b2 = new Bike("B-659", "BMW", 2005, "Electric");
        // RentalAgency ra = new RentalAgency("Tony's Vehicle Dealer");
        // ra.addVehicle(c1);
        // ra.addVehicle(c2);
        // ra.addVehicle(b1);
        // ra.addVehicle(b2);
        // System.out.print(ra.getRentalCatalog());

        // /* Question 4 ===> Abstraction + Queue + LinkedList (Medium) */
        // ExpressDelivery ed1 = new ExpressDelivery("ED-568", "Block-c 457/24",
        // 5000.100d);
        // ExpressDelivery ed2 = new ExpressDelivery("ED-468", "Block-c 457/54",
        // 5750.70d);
        // StandardDelivery sd1 = new StandardDelivery("SD-768", "Block-c 424/68",
        // 970.00d);
        // StandardDelivery sd2 = new StandardDelivery("SD-868", "Block-c 478/29",
        // 500.100d);
        // DeliveryQueue dq = new DeliveryQueue();
        // dq.placeOrder(ed1);
        // dq.placeOrder(ed2);
        // dq.placeOrder(sd1);
        // dq.placeOrder(sd2);
        // System.out.println((dq.dispatchNext()).getOrderSummary() + "\n" + "Pending
        // count ==> " + dq.getPendingCount());
        // System.out.println((dq.dispatchNext()).getOrderSummary() + "\n" + "Pending
        // count ==> " + dq.getPendingCount());
        // System.out.println((dq.dispatchNext()).getOrderSummary() + "\n" + "Pending
        // count ==> " + dq.getPendingCount());
        // System.out.println((dq.dispatchNext()).getOrderSummary() + "\n" + "Pending
        // count ==> " + dq.getPendingCount());
        //

        // /* Question 5 ===> Interface + HashSet + ArrayList (Medium) */
        // Student s1 = new Student("S-24", "Popoye");
        // Student s2 = new Student("S-25", "Tony");
        // Student s3 = new Student("S-26", "Strange");
        // System.out.println(s1.enroll("CS302"));
        // System.out.println(s1.enroll("CS302"));
        // System.out.println(s2.enroll("IT201"));
        // System.out.println(s3.enroll("MB452"));
        // CourseRegistry cr = new CourseRegistry("Anonymous");
        // cr.registerStudent(s1);
        // cr.registerStudent(s2);
        // cr.registerStudent(s3);
        // for (Student st : cr.getAllStudents()) {
        // System.out.println(st.getStudentName() + " -> " + st.getEnrolledCourses());
        // }

        // /* Question 6 ===> Polymorphism + Vector + StringBuilder (Medium) */
        // Employee e2 = new FullTimeEmployee("E-123", "TonyStark", 200164.15d, 5000d);
        // Employee e1 = new PartTimeEmployee("E-345", "Strange", 29000.54d, 10, 2500d);
        // Employee e3 = new Contractor("C-234", "Natasha", 450024d, 6581d);
        // PayrollSystem prs = new PayrollSystem("Tech Pvt. Ltd");
        // System.out.println(prs.getCompanyName());
        // prs.addEmployee(e1);
        // prs.addEmployee(e2);
        // prs.addEmployee(e3);
        // System.out.print(prs.generatePayrollReport());

        // /* Question 7 ===> Abstract + Interface + HashSet + LinkedList (Hard) */
        // Professor p1 = new Professor("P-253", "Popoye", "CSE-CORE");
        // Professor p2 = new Professor("P-254", "Tony", "CS-DS");
        // GradStudent gs1 = new GradStudent("G-432", "Strange", "BubbleSort",
        // "Dr.Banner");
        // GradStudent gs2 = new GradStudent("G-452", "Natasha", "Binary Search",
        // "Dr.Banner");
        // Department d = new Department("Computer Science Engineering");
        // p1.addResearchTopic("Binary Tree");
        // p1.addResearchTopic("LinkedList");
        // p1.addResearchTopic("LinkedList");
        // p1.addResearchTopic("LinkedList");
        // p2.addResearchTopic("Probability");
        // p2.addResearchTopic("Matrix");
        // System.out.println("Department name ==> " + d.getDepartmentName());
        // d.addProfessor(p1);
        // d.addProfessor(p2);
        // d.addGradStudent(gs1);
        // d.addGradStudent(gs2);
        // System.out.print(d.getDepartmentReport());

        // /* Question 8 ===> Static + Composition + Queue + StringBuilder (Hard) */

    }

}
