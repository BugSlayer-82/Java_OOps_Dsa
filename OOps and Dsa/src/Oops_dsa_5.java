// import java.util.Set;
// import java.util.Map;
// import java.util.HashMap;
// import java.util.ArrayList;

// /* Question 4 =====> Bank Account Locker */

// /* Question 3 =====> Online Course Enrollment */
// class Course {
//     private String courseName;
//     private String courseCode;
//     Course(String courseName, String courseCode) {
//         this.courseName = courseName;
//         this.courseCode = courseCode;
//     }
//     public String getCourseName() {
//         return courseName;
//     }
//     public String getCourseCode() {
//         return courseCode;
//     }
// }
// class Catalog {
//     private String catalogName;
//     private HashMap<String, Course> catalog = new HashMap<>();
//     Catalog(String catalogName) {
//         this.catalogName = catalogName;
//     }
//     public String getCatalogName() {
//         return catalogName;
//     }
//     public void addCourse(Course c) {
//         catalog.put(c.getCourseCode(), c);
//     }
//     public boolean isCourseExist(String courseCode) {
//         return catalog.containsKey(courseCode);
//     }
//     public String getCourseDetail(String courseCode) {
//         Course course = catalog.get(courseCode);
//         if(course !=null){
//             return "CourseName: "+course.getCourseName() + ", CourseCode: "+course.getCourseCode();
//         }
//         return "Course not found";
//     }
// }

// /* Question 2 =====> Employee Salary Register */
// class Employee {
// private String employeeName;
// private String employeeId;
// private double salary;
// Employee(String employeeName, String employeeId, double salary) {
// this.employeeName = employeeName;
// this.employeeId = employeeId;
// this.salary = salary;
// }
// public String getEmployeeName() {
// return employeeName;
// }
// public String getEmployeeId() {
// return employeeId;
// }
// public void setSalary(double salary) {
// this.salary = salary;
// }
// public double getSalary() {
// return salary;
// }
// }
// class Company {
// private String companyName;
// private HashMap<String, Employee> register = new HashMap<>();
// private static Company company;
// private Company() {
// } // Singleton Pattern
// public static Company getCompany() { // Method to create only one object
// if (company == null) {
// company = new Company();
// }
// return company;
// }
// public void setCompanyName(String companyName) {
// this.companyName = companyName;
// }
// public String getCompanyName() {
// return companyName;
// }
// public void addEmployee(Employee e) {
// String id = e.getEmployeeId();
// register.put(id, e);
// }
// public double retrieveSalary(String employeeId) {
// Employee emp = register.get(employeeId);
// if (emp == null) {
// System.out.println("Employee doesn't exist ..!");
// return -1;
// }
// return emp.getSalary();
// }
// public String getEmployee(String id) {
// Employee emp = register.get(id);
// return "Employee Name : " + emp.getEmployeeName() + ", Employee Id : " +
// emp.getEmployeeId();
// }
// }

// /* Question 1 =====> Encapsulation, Constructor, fast lookup (Map hint) */
// class Book {
// private String bookTitle;
// private String bookId;
// private boolean isAvailable;
// Book(String bookTitle, String bookId, boolean isAvailable) {
// this.bookTitle = bookTitle;
// this.bookId = bookId;
// this.isAvailable = isAvailable;
// }
// public String getBookTittle() {
// return bookTitle;
// }
// public String getBookId() {
// return bookId;
// }
// public boolean getStatus() {
// return isAvailable;
// }
// public String getBookDetail() {
// return "Book ID: " + bookId + " | Title: " + bookTitle + " | Available: " +
// isAvailable;
// }
// }
// class Library {
// private String libraryName;
// private HashMap<String, Book> books = new HashMap<>();
// Library(String libraryName) {
// this.libraryName = libraryName;
// }
// public void addBook(Book b) {
// books.put(b.getBookId(), b);
// }
// public String getLibraryName() {
// return libraryName;
// }
// public Book getBookWithId(String id) {
// return books.get(id);
// }
// }

public class Oops_dsa_5 {
    public static void main(String[] args) {

        // /* Question 1 ===> Encapsulation, Constructor, fast lookup (Map hint) */
        // Book b1 = new Book("Hulk the fighter", "H-234", true);
        // Book b2 = new Book("Stark the avenger", "S-348", true);
        // Book b3 = new Book("Strange the magician", "ST-234", true);
        // Library l = new Library("Tony's Library");
        // l.addBook(b1);
        // l.addBook(b2);
        // l.addBook(b3);
        // System.out.println("Library Name --> " + l.getLibraryName());
        // Book book = l.getBookWithId("H-234");
        // if (book != null) {
        // System.out.println(book.getBookDetail());
        // } else {
        // System.out.println("Book not available !");
        // }

        // /* Question 2 =====> Employee Salary Register */
        // Employee e1 = new Employee("Tony", "T-323", 50000.50d);
        // Employee e2 = new Employee("Strange", "S-857", 8000.50d);
        // Company comp = Company.getCompany();
        // comp.setCompanyName("Stark Industries");
        // System.out.println("Company Name --> " + comp.getCompanyName());
        // comp.addEmployee(e1);
        // comp.addEmployee(e2);
        // System.out.println(comp.getEmployee("S-857"));
        // System.out.println("Salary --> " + comp.retrieveSalary("S-857"));

        // /* Question 3 =====> Online Course Enrollment */
        // Course c1 = new Course("Computer Science (CSE)", "CSE-803");
        // Course c2 = new Course("Civil-Engineering", "CVL-348");
        // Course c3 = new Course("MBBS", "MBB-344");
        // Catalog cat = new Catalog("Engineering-Catalog");
        // System.out.println("Catalog Name ==> " + cat.getCatalogName());
        // cat.addCourse(c1);
        // cat.addCourse(c2);
        // cat.addCourse(c3);
        // System.out.println("Course is available ==> " +
        // cat.isCourseExist("MBB-344"));
        // System.out.println("Course Detail ==> " + cat.getCourseDetail("CVL-348"));

        // /* Question 4 =====> Bank Account Locker */
    }
}