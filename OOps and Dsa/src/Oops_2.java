
// /* Question 10 Putting It All Together */
// abstract class Product {
//     protected String productId;
//     protected String productName;
//     protected double basePrice;
//     static int totalProduct;
//     Product(String productId, String productName, double basePrice) {
//         this.productId = productId;
//         this.productName = productName;
//         this.basePrice = basePrice;
//         totalProduct++;
//     }
//     public String getProductId() {
//         return productId;
//     }
//     public String getProductName() {
//         return productName;
//     }
//     public double getBasePrice() {
//         return basePrice;
//     }
//     public static int getTotalProducts() {
//         return totalProduct;
//     }
//     abstract double getFinalPrice();
// }
// interface Discountable {
//     double applyDiscount(double percentage);
// }
// interface Taxable {
//     double applyTax(double taxRate);
// }
// class ElectronicProduct extends Product implements Discountable, Taxable {
//     private String brand;
//     ElectronicProduct(String brand, String productId, String productName, double basePrice) {
//         super(productId, productName, basePrice);
//         this.brand = brand;
//     }
//     public String getBrandName() {
//         return brand;
//     }
//     public double getFinalPrice() {
//         return basePrice + applyTax(0.18d);
//     }
//     public double applyDiscount(double percentage) {
//         return basePrice - (basePrice * percentage / 100);
//     }
//     public double applyTax(double taxRate) {
//         return basePrice * taxRate;
//     }
// }
// class ClothingProduct extends Product implements Discountable {
//     private String size;
//     ClothingProduct(String size, String productId, String productName, double basePrice) {
//         super(productId, productName, basePrice);
//         this.size = size;
//     }
//     public String getSizeOfCloth() {
//         return size;
//     }
//     public double getFinalPrice() {
//         return basePrice - applyDiscount(10);
//     }
//     public double applyDiscount(double percentage) {
//         return basePrice * percentage / 100;
//     }
// }
// class Order {
//     private String orderId;
//     static int totalOrders;
//     Product p;
//     Order(String orderId, Product p) {
//         this.orderId = orderId;
//         this.p = p;
//         totalOrders++;
//     }
//     public String getOrderSummary() {
//         return orderId + " " + p.productName + " " + p.getFinalPrice();
//     }
// }

// /* Question 9 Composition + Multiple Objects */
// class Teacher {
// private String teacherName;
// private String subject;
// Teacher(String teacherName, String subject) {
// this.teacherName = teacherName;
// this.subject = subject;
// }
// public String getTeacherInfo() {
// return teacherName + " " + subject;
// }
// }
// class Classroom {
// private String roomNumber;
// private int capacity;
// Teacher teacher;
// Classroom(String roomNumber, int capacity, Teacher teacher) {
// this.roomNumber = roomNumber;
// this.capacity = capacity;
// this.teacher = teacher;
// }
// public String getClassroomInfo() {
// return roomNumber + capacity + teacher.getTeacherInfo();
// }
// }
// class School {
// private String schoolName;
// Classroom classroom[] = new Classroom[3];
// int count;
// School(String schoolName) {
// this.schoolName = schoolName;
// count = 0;
// }
// public void addClassrooms(Classroom room) {
// classroom[count] = room;
// count++;
// }
// public String getSchoolReport() {
// String str = "";
// for (int i = 0; i < count; i++) {
// str += classroom[i].getClassroomInfo();
// }
// return schoolName + " " + str;
// }
// }

// /* Question 8 Method Overloading + return types */
// class StringUtils {
// public String format(String text) {
// return text.toUpperCase();
// }
// public String format(String text, int repeatCount) {
// String newStr = "";
// for (int i = 1; i <= repeatCount; i++) {
// newStr += text + " ";
// }
// return newStr;
// }
// public String format(String text, boolean addBrackets) {
// if (addBrackets) {
// return "[ " + text + " ]";
// }
// return text;
// }
// public String format(String prefix, String text, String suffix) {
// return prefix + " " + text + " " + suffix;
// }
// }

// /* Question 7 Static Members + Singleton Pattern */
// class AppConfig {
// protected static AppConfig instance = null;
// private String appName;
// private String version;
// static int instanceCount;
// private AppConfig(String appName, String version) {
// this.appName = appName;
// this.version = version;
// instanceCount++;
// }
// public static AppConfig getInstance(String appName, String version) {
// if (instance == null) {
// instance = new AppConfig(appName, version);
// }
// return instance;
// }
// public static int getInstanceCount() {
// return instanceCount;
// }
// public String getAppName() {
// return appName;
// }
// public String getVersion() {
// return version;
// }
// }

// /* Question 6 Constructor Overloading + this() */
// class Product {
// private String productName;
// private String category;
// private double price;
// private int stock;
// Product(String productName) {
// this.productName = productName;
// category = "Uncategorized";
// price = 0.0;
// stock = 0;
// }
// Product(String productName, String category) {
// this(productName);
// this.category = category;
// }
// Product(String productName, String category, double price) {
// this(productName, category);
// this.price = price;
// }
// Product(String productName, String category, double price, int stock) {
// this(productName, category, price);
// this.stock = stock;
// }
// public String getProductInfo() {
// String items = productName + " " + category + " " + price + " " + stock;
// return items;
// }
// }

// /* Question 5 Interfaces + Multiple Implementation */
// interface Recordable {
// String startRecording();
// String stopRecording();
// }
// interface MotionDetectable {
// String detectMotion(String zone);
// }
// interface Alertable {
// String triggerAlert(String reason);
// }
// class SecurityCamera implements Recordable, MotionDetectable, Alertable {
// private String cameraId;
// SecurityCamera(String cameraId) {
// this.cameraId = cameraId;
// }
// public String startRecording() {
// return "Recording Start : " + cameraId;
// }
// public String stopRecording() {
// return "Recording Stop : " + cameraId;
// }
// public String detectMotion(String zone) {
// return zone + " : " + cameraId;
// }
// public String triggerAlert(String reason) {
// return reason + " : " + cameraId;
// }
// }

// /* Question 4 Abstract Class + Return Types */
// abstract class TaxCalculator {
// protected String entityName;
// protected double income;
// TaxCalculator(String entityName, double income) {
// this.entityName = entityName;
// this.income = income;
// }
// public String getEntityName() {
// return entityName;
// }
// public double getIncome() {
// return income;
// }
// abstract double calculateTax();
// public String getTaxReport() {
// String str = entityName + " " + income + " " + calculateTax();
// return str;
// }
// }
// class IndividualTax extends TaxCalculator {
// public double calculateTax() {
// return income * 0.1;
// }
// IndividualTax(String entityName, double income) {
// super(entityName, income);
// }
// }
// class CorporateTax extends TaxCalculator {
// public double calculateTax() {
// return income * 0.25;
// }
// CorporateTax(String entityName, double income) {
// super(entityName, income);
// }
// }

// /* Question 3 Polymorphism + Meaningful Logic */
// class Alert {
// String recipientName;
// Alert(String recipientName) {
// this.recipientName = recipientName;
// }
// public String sendAlert(String message) {
// return "Sending generic alert to " + recipientName + " : " + message;
// }
// }
// class DoctorAlert extends Alert {
// DoctorAlert(String recipientName) {
// super(recipientName);
// }
// @Override
// public String sendAlert(String message) {
// return "[URGENT] " + super.sendAlert(message);
// }
// }
// class PatientAlert extends Alert {
// PatientAlert(String recipientName) {
// super(recipientName);
// }
// @Override
// public String sendAlert(String message) {
// return super.sendAlert(message) + " - Please stay calm.";
// }
// }
// class NurseAlert extends Alert {
// NurseAlert(String recipientName) {
// super(recipientName);
// }
// @Override
// public String sendAlert(String message) {
// return "[ACTION REQUIRED] " + super.sendAlert(message);
// }
// }

// /* Question 2 Inheritance + Method Overriding */
// class Course {
// protected String courseName;
// protected int durationInHours;
// public Course(String courseName, int durationInHours) {
// this.courseName = courseName;
// this.durationInHours = durationInHours;
// }
// public String getCourseName() {
// return courseName;
// }
// public int getDuration() {
// return durationInHours;
// }
// public String getCourseDetails() {
// String str = courseName + " " + durationInHours;
// return str;
// }
// }
// class VideoCourse extends Course {
// private String instructor;
// VideoCourse(String instructor, String courseName, int durationInHours) {
// super(courseName, durationInHours);
// this.instructor = instructor;
// }
// @Override
// public String getCourseDetails() {
// return instructor + " " + super.getCourseDetails();
// }
// }
// class QuizCourse extends Course {
// private int numberOfQuizzes;
// QuizCourse(int numberOfQuizzes, String courseName, int durationInHours) {
// super(courseName, durationInHours);
// this.numberOfQuizzes = numberOfQuizzes;
// }
// @Override
// public String getCourseDetails() {
// return Integer.toString(numberOfQuizzes) + " " + super.getCourseDetails();
// }
// }

// /* Question 1 Encapsulation + Validation Logic */
// class GymMember {
// private String memberName;
// private int age;
// private String memberShipType;
// GymMember(String memberName, int age, String memberShipType) {
// this.memberName = memberName;
// this.age = age;
// this.memberShipType = memberShipType;
// }
// public String setMembershipType(String memberShipType) {
// if (memberShipType.contains("basic") || memberShipType.contains("premium") ||
// memberShipType.contains("vip")) {
// this.memberShipType = memberShipType;
// return "Member Ship updated Successfully.";
// }
// return "Invalid membership type";
// }
// public String getMemberName() {
// return memberName;
// }
// public int getAge() {
// return age;
// }
// public String getMemberShipType() {
// return memberShipType;
// }
// public String getInfo() {
// String newStr = memberName + " " + age + " " + memberShipType;
// return newStr;
// }
// }

public class Oops_2 {
    public static void main(String[] args) {

        // /* Question 1 ===> Encapsulation + Validation Logic */
        // GymMember gm = new GymMember("Popoye", 24, "vip");
        // System.out.println("Member Info ==> " + gm.getInfo());
        // System.out.println(gm.setMembershipType("gold"));

        // /* Question 2 ===> Inheritance + Method Overriding */
        // VideoCourse vc = new VideoCourse("Teacher", "DSA", 25);
        // QuizCourse qc = new QuizCourse(30, "AI-ML", 40);
        // System.out.println("Details 1 ==> " + vc.getCourseDetails());
        // System.out.println("Course Name ==> " + vc.getCourseName());
        // System.out.println("Course Duration ==> " + vc.getDuration());
        // System.out.println("Details 2 ==> " + qc.getCourseDetails());
        // System.out.println("Course Name ==> " + qc.getCourseName());
        // System.out.println("Course Duration ==> " + qc.getDuration());

        // /* Question 3 ===> Polymorphism + Meaningful Logic */
        // Alert[] alr = new Alert[3];
        // alr[0] = new DoctorAlert("Dr.Strange");
        // alr[1] = new NurseAlert("Popoye");
        // alr[2] = new PatientAlert("Tony");
        // for (int i = 0; i < 3; i++) {
        // System.out.println(alr[i].sendAlert("Fast"));
        // }

        // /* Question 4 ===> Abstract Class + Return Types */
        // IndividualTax it = new IndividualTax("Tap", 5000.05d);
        // CorporateTax ct = new CorporateTax("Tank", 6000.45d);
        // System.out.println(it.getTaxReport());
        // System.out.println(ct.getTaxReport());

        // /* Question 5 ===> Interfaces + Multiple Implementation */
        // SecurityCamera scm = new SecurityCamera("Room - 1");
        // System.out.println(scm.startRecording());
        // System.out.println(scm.detectMotion("Zone ==> " + " 2"));
        // System.out.println(scm.triggerAlert("Human is inside home ==> "));
        // System.out.println(scm.stopRecording());

        // /* Question 6 ===> Constructor Overloading + this() */
        // Product p1 = new Product("Chocolate", "Sweet", 20.50d, 250);
        // System.out.println("Product detail ==> " + p1.getProductInfo());
        // Product p2 = new Product("Strawberry", "Fruit", 100.50d);
        // System.out.println("Product detail ==> " + p2.getProductInfo());
        // Product p3 = new Product("Potato", "Vegitable");
        // System.out.println("Product detail ==> " + p3.getProductInfo());
        // Product p4 = new Product("Pencil Box");
        // System.out.println("Product detail ==> " + p4.getProductInfo());

        // /* Question 7 ===> Static Members + Singleton Pattern */
        // AppConfig ac1 = AppConfig.getInstance("Youtube", "4.25.10");
        // AppConfig ac2 = AppConfig.getInstance("Tiktok", "2.50.1");
        // AppConfig ac3 = AppConfig.getInstance("Moj", "1.28.8");
        // System.out.println("App Name ==> " + ac1.getAppName());
        // System.out.println("Version ==> " + ac1.getVersion());
        // System.out.println("App Name ==> " + ac2.getAppName());
        // System.out.println("Version ==> " + ac2.getVersion());
        // System.out.println("App Name ==> " + ac3.getAppName());
        // System.out.println("Version ==> " + ac3.getVersion());
        // System.out.println("Count ==> " + AppConfig.getInstanceCount());

        // /* Question 8 ===> Method Overloading + return types */
        // StringUtils su = new StringUtils();
        // System.out.println(su.format("Popoye"));
        // System.out.println(su.format("Tony", 5));
        // System.out.println(su.format("Strange", true));
        // System.out.println(su.format("Mrs", "CaptainMarvel", "Universe"));

        // /* Question 9 ===> Composition + Multiple Objects */
        // Teacher t1 = new Teacher("Harvard", "Computer Science");
        // Teacher t2 = new Teacher("Dr. Strange", "NeuroSurgeon");
        // Classroom c1 = new Classroom("1001", 20, t1);
        // Classroom c2 = new Classroom("1005", 30, t2);
        // School s = new School("Abcd Institute");
        // s.addClassrooms(c1);
        // s.addClassrooms(c2);
        // System.out.println(s.getSchoolReport());

        // /* Question 10 ===> Putting It All Together */
        // ElectronicProduct ep = new ElectronicProduct("Apple", "A1278", "Macbook Pro",
        // 69599.45d);
        // ClothingProduct cp = new ClothingProduct("Large", "Bs-757", "Bikni",
        // 500.58d);
        // Order ord1 = new Order("FKT", ep);
        // Order ord2 = new Order("AFKT", cp);
        // System.out.println("Order Summary : 1 ==> " + ord1.getOrderSummary());
        // System.out.println("Order Summary : 2 ==> " + ord2.getOrderSummary());
        // System.out.println("Brand name ==> " + ep.getBrandName());
        // System.out.println("Size of Cloth ==> " + cp.getSizeOfCloth());
        // System.out.println("Order Count ==> " + Order.totalOrders);
        // System.out.println("Product Count ==> " + Product.getTotalProducts());
    }

}
