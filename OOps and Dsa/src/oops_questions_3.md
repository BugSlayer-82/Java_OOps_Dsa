# Java OOP Practice Questions — Set 3 (Advanced Level)

---

## Question 1 — Encapsulation + Validation Logic

You are building a registration system for a gym.

- Create a class called `GymMember` with private variables `String memberName`, `int age`, and `String membershipType` (values can only be `"basic"`, `"premium"`, or `"vip"`)
- Add a constructor `GymMember(String memberName, int age, String membershipType)` that sets all three values
- Add getter methods `getMemberName()`, `getAge()`, and `getMembershipType()` — each must **return** the value, not print it
- Add a setter `setMembershipType(String membershipType)` that updates the membership only if the value is `"basic"`, `"premium"`, or `"vip"` — otherwise return a `String` message `"Invalid membership type"`
- Add a method `getMemberInfo()` that **returns** a `String` containing all three values
- In the `main` method, create a `GymMember` object, print all info using `getMemberInfo()`, try setting a valid and an invalid membership type, and print the membership type after each attempt using `getMembershipType()`

---

## Question 2 — Inheritance + Method Overriding

You are building a system for an online learning platform.

- Create a parent class called `Course` with private variables `String courseName` and `int durationInHours`, and a constructor `Course(String courseName, int durationInHours)` that sets both values
- Add getter methods `getCourseName()` and `getDuration()` that **return** their respective values
- Add a method `getCourseDetails()` that **returns** a `String` containing course name and duration
- Create two child classes — `VideoCourse` with an additional private variable `String instructor` and `QuizCourse` with an additional private variable `int numberOfQuizzes`
- Each child class must use `super(courseName, durationInHours)` in its constructor
- Each child class must override `getCourseDetails()` — call `super.getCourseDetails()` and append its own info — the method must **return** a `String`, not print
- Use primitive `int` for `numberOfQuizzes`, not `Integer`
- In the `main` method, create one `VideoCourse` and one `QuizCourse` object, and print their details using `System.out.println()`

---

## Question 3 — Polymorphism + Meaningful Logic

You are building a notification dispatch system for a hospital.

- Create a parent class called `Alert` with a variable `String recipientName` and a constructor `Alert(String recipientName)`
- Add a method `sendAlert(String message)` that **returns** a `String` — `"Sending generic alert to " + recipientName + ": " + message`
- Create three child classes — `DoctorAlert`, `PatientAlert`, and `NurseAlert` — each overriding `sendAlert(String message)`
- `DoctorAlert` must prepend `"[URGENT] "` to the message
- `PatientAlert` must append `" - Please stay calm."` to the message
- `NurseAlert` must prepend `"[ACTION REQUIRED] "` to the message
- Each child class must call `super.sendAlert(message)` and build on top of it — do not duplicate the base logic
- In the `main` method, create an array of type `Alert` containing all three objects, loop through it calling `sendAlert()`, and print each result

---

## Question 4 — Abstract Class + Return Types

You are building a tax calculation system for a company.

- Create an abstract class called `TaxCalculator` with private variables `String entityName` and `double income`, and a constructor `TaxCalculator(String entityName, double income)` that sets both values
- Add getter methods `getEntityName()` and `getIncome()` that **return** their values
- Add an abstract method `calculateTax()` that returns a `double`
- Add a non-abstract method `getTaxReport()` that **returns** a `String` — it must call `calculateTax()` internally and include the entity name, income, and calculated tax in the returned string
- Create two concrete classes — `IndividualTax` that calculates tax as `income * 0.1` and `CorporateTax` that calculates tax as `income * 0.25`
- Each concrete class must have a constructor that calls `super(entityName, income)`
- In the `main` method, create one `IndividualTax` and one `CorporateTax` object, and print `getTaxReport()` for each — all printing in `main`

---

## Question 5 — Interfaces + Multiple Implementation

You are building a system for a smart security camera.

- Create an interface called `Recordable` with methods `startRecording()` that returns `String` and `stopRecording()` that returns `String`
- Create an interface called `MotionDetectable` with a method `detectMotion(String zone)` that returns `String` — the `zone` parameter must be used in the returned message
- Create an interface called `Alertable` with a method `triggerAlert(String reason)` that returns `String` — the `reason` parameter must be used in the returned message
- Create a class called `SecurityCamera` with a private variable `String cameraId` and a constructor `SecurityCamera(String cameraId)` that implements all three interfaces
- All interface methods must use the `cameraId` in their returned messages
- No `public` keyword inside interface method declarations
- In the `main` method, create a `SecurityCamera` object and call all methods, printing each result

---

## Question 6 — Constructor Overloading + this()

You are building a product catalog system for a store.

- Create a class called `Product` with private variables `String productName`, `String category`, `double price`, and `int stock`
- Add four constructors:
  - `Product(String productName)` — sets only name, category defaults to `"Uncategorized"`, price to `0.0`, stock to `0`
  - `Product(String productName, String category)` — sets name and category, price to `0.0`, stock to `0`
  - `Product(String productName, String category, double price)` — sets name, category and price, stock to `0`
  - `Product(String productName, String category, double price, int stock)` — sets all four
- Each constructor must use `this()` to call the next constructor — do not repeat assignment logic
- Add a method `getProductInfo()` that **returns** a `String` containing all four values
- In the `main` method, create four `Product` objects using each constructor and print their info using `getProductInfo()`

---

## Question 7 — Static Members + Singleton Pattern

You are building a configuration manager for an application.

- Create a class called `AppConfig` with private static variable `AppConfig instance` (initially `null`), private variables `String appName` and `String version`, and a private constructor `AppConfig(String appName, String version)` that sets both values and increments a static `int instanceCount`
- Add a static method `getInstance(String appName, String version)` that creates a new `AppConfig` object only if `instance` is `null`, otherwise returns the existing one — this is called the **Singleton pattern**
- Add a static method `getInstanceCount()` that **returns** `instanceCount`
- Add getter methods `getAppName()` and `getVersion()` that **return** their values
- In the `main` method, call `getInstance()` three times with different values, print `getAppName()` and `getVersion()` for each returned object, and print `getInstanceCount()` — observe that all three calls return the same object and count stays at `1`

---

## Question 8 — Method Overloading + return types

You are building a string utility class for a text processing app.

- Create a class called `StringUtils` with overloaded method `format()`
- Add the following versions:
  - `format(String text)` — returns the text in **uppercase**
  - `format(String text, int repeatCount)` — returns the text repeated `repeatCount` times separated by a space
  - `format(String text, boolean addBrackets)` — returns the text wrapped in square brackets if `addBrackets` is `true`, otherwise returns as-is
  - `format(String text, String prefix, String suffix)` — returns the text with the given prefix and suffix attached
- All methods must **return** a `String`, not print
- In the `main` method, call all four versions with sample values and print each result with a label

---

## Question 9 — Composition + Multiple Objects

You are building a school management system.

- Create a class called `Teacher` with private variables `String teacherName` and `String subject`, a constructor `Teacher(String teacherName, String subject)`, and a method `getTeacherInfo()` that **returns** a `String` with both values
- Create a class called `Classroom` with private variables `String roomNumber`, `int capacity`, and a `Teacher` object — use composition, **not inheritance**
- Add a constructor `Classroom(String roomNumber, int capacity, Teacher teacher)`
- Add a method `getClassroomInfo()` that **returns** a `String` containing room number, capacity, and teacher info by calling `getTeacherInfo()` internally
- Create a class called `School` with private variables `String schoolName` and an array of `Classroom` objects `Classroom[] classrooms` with max size `3`
- Add a constructor `School(String schoolName)` and a method `addClassroom(Classroom classroom)` that adds classrooms to the array
- Add a method `getSchoolReport()` that **returns** a `String` containing school name and info of all classrooms by calling `getClassroomInfo()` on each
- In the `main` method, create two `Teacher` objects, two `Classroom` objects, one `School` object, add both classrooms to the school, and print `getSchoolReport()`

---

## Question 10 — Putting It All Together

You are building a mini e-commerce order processing system.

- Create an abstract class called `Product` with private variables `String productId`, `String productName`, and `double basePrice`, a constructor `Product(String productId, String productName, double basePrice)` that sets all values and increments a static `int totalProducts`, getter methods `getProductId()`, `getProductName()`, `getBasePrice()` that **return** their values, a static method `getTotalProducts()` that returns the count, and an abstract method `getFinalPrice()` that returns a `double`

- Create an interface called `Discountable` with a method `applyDiscount(double percentage)` that returns a `double`
- Create an interface called `Taxable` with a method `applyTax(double taxRate)` that returns a `double`


- Create a class called `ElectronicProduct` that extends `Product` and implements both `Discountable` and `Taxable` with an additional private variable `String brand` — `getFinalPrice()` returns `basePrice + applyTax(0.18)`, `applyDiscount()` returns `basePrice - (basePrice * percentage / 100)`, `applyTax()` returns `basePrice * taxRate`

- Create a class called `ClothingProduct` that extends `Product` and implements only `Discountable` with an additional private variable `String size` — `getFinalPrice()` returns `basePrice - applyDiscount(10)`, `applyDiscount()` returns `basePrice * percentage / 100`


- Create a class called `Order` with private variables `String orderId`, a `Product` object inside it using composition, and a static `int totalOrders` that increments in the constructor

- Add a method `getOrderSummary()` that **returns** a `String` containing order id, product name, and final price by calling `getFinalPrice()` on the product

- In the `main` method, create one `ElectronicProduct` and one `ClothingProduct`, wrap each in an `Order`, print `getOrderSummary()` for each order, and print `Product.getTotalProducts()` and `Order.totalOrders`
