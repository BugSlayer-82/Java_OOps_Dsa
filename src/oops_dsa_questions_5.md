# Java OOP + Data Structures Practice Questions — Set 5

---

## Question 1 — Encapsulation + StringBuilder + ArrayList (Easy)

You are building a **note-taking app**.

- Create a class called `Note` with a private `String` noteId, a private `String` title, and a private `StringBuilder` for the note content
- Add a constructor that takes `noteId` and `title` only — content should start empty
- Add a method `appendContent(String text)` that adds text to the existing content — do not replace, only append to it
- Add a method `clearContent()` that resets the content to empty
- Add a method `getContent()` that returns the current content as a `String`
- Add getter methods for `noteId` and `title`
- Create a class called `NoteBook` with a private `String` ownerName and a private `ArrayList` that holds multiple `Note` objects
- Add a constructor that takes `ownerName`
- Add a method `addNote(Note note)` that adds a note to the list
- Add a method `getNoteById(String noteId)` that loops through the list and returns the matching `Note` — return `null` if not found
- Add a method `getAllNotes()` that returns all notes
- In `main`, create a `NoteBook`, add 3 `Note` objects, append content to each note at least twice, find one note by id using `getNoteById()`, clear its content, append something new to it, then print all notes' title and content

---

## Question 2 — Encapsulation + Stack + StringBuilder (Easy)

You are building a **code editor with an undo feature**.

- Create a class called `CodeEditor` with a private `String` fileName, a private `StringBuilder` for current code content, and a private `Stack` that stores `String` snapshots of previous states
- Add a constructor that takes only `fileName` — content starts empty
- Add a method `typeCode(String code)` that first saves the current content as a snapshot into the stack, then appends the new code to content
- Add a method `undo()` that restores the last saved snapshot from the stack and sets it as the current content — if stack is empty return `"Nothing to undo"`
- Add a method `getCurrentCode()` that returns current content as a `String`
- Add a getter for `fileName`
- In `main`, create a `CodeEditor`, type code 3 times, call `undo()` twice, and print the current code after each undo — observe how content rolls back

---

## Question 3 — Inheritance + ArrayList + StringBuilder (Medium)

You are building a **vehicle rental system**.

- Create a parent class called `Vehicle` with private `String` vehicleId, private `String` brand, and private `int` year — use primitive `int`
- Add a constructor that takes all three values, getter methods for all, and a method `getVehicleInfo()` that returns a `String` containing vehicleId, brand, and year
- Create two child classes — `Car` with an additional private `int` numberOfDoors and `Bike` with an additional private `String` bikeType
- Each child class must call `super()` in its constructor
- Each child class must override `getVehicleInfo()` — call `super.getVehicleInfo()` and append its own specific info
- Create a class called `RentalAgency` with a private `String` agencyName and a private `ArrayList` that holds multiple `Vehicle` objects
- Add a constructor, an `addVehicle(Vehicle v)` method, and a method `getRentalCatalog()` that uses a `StringBuilder` to build and return a combined `String` of all vehicles' info — use `StringBuilder` here, not `+` concatenation
- In `main`, create 2 `Car` objects and 2 `Bike` objects, add all to `RentalAgency`, and print the full rental catalog

---

## Question 4 — Abstraction + Queue + LinkedList (Medium)

You are building a **food delivery order system**.

- Create an abstract class called `DeliveryOrder` with private `String` orderId, private `String` customerAddress, and private `double` totalAmount — use primitive `double`
- Add a constructor that takes all three values, getter methods for all, and an abstract method `getDeliveryType()` that returns a `String`
- Add a non-abstract method `getOrderSummary()` that returns a `String` containing orderId, customerAddress, totalAmount, and delivery type — it must call `getDeliveryType()` internally
- Create two concrete classes — `ExpressDelivery` where `getDeliveryType()` returns `"EXPRESS"` and `StandardDelivery` where `getDeliveryType()` returns `"STANDARD"`
- Each concrete class must call `super()` in its constructor
- Create a class called `DeliveryQueue` with a private `LinkedList` used as a `Queue` that holds `DeliveryOrder` objects
- Add a method `placeOrder(DeliveryOrder order)` that adds an order to the queue
- Add a method `dispatchNext()` that removes and returns the next order — return `null` if queue is empty
- Add a method `getPendingCount()` that returns the number of orders waiting as an `int`
- In `main`, add 2 `ExpressDelivery` and 2 `StandardDelivery` orders, dispatch them one by one, and print each order's summary and remaining pending count after each dispatch

---

## Question 5 — Interface + HashSet + ArrayList (Medium)

You are building a **student course enrollment system**.

- Create an interface called `Enrollable` with methods `getStudentId()` that returns a `String`, `enroll(String courseCode)` that returns a `String` message, and `getEnrolledCourses()` that returns a collection of `String` course codes
- Create a class called `Student` that implements `Enrollable` with private `String` studentId, private `String` studentName, and a private `HashSet` that holds enrolled course codes — use `HashSet` so duplicate course enrollments are automatically prevented
- Add a constructor `Student(String studentId, String studentName)`
- Implement all interface methods — `enroll()` should add the course to the set and return `"Enrolled in: " + courseCode` if added, or `"Already enrolled in: " + courseCode` if it was already present — think about what `HashSet.add()` returns
- Add a getter for `studentName`
- Create a class called `CourseRegistry` with a private `String` registryName and a private `ArrayList` that holds `Student` objects
- Add a method `registerStudent(Student s)` that adds a student
- Add a method `getStudentById(String studentId)` that returns matching `Student` — return `null` if not found
- Add a method `getAllStudents()` that returns all students
- In `main`, create 3 students, try enrolling the same course twice for one student, add all to `CourseRegistry`, and print each student's name and enrolled courses

---

## Question 6 — Polymorphism + Vector + StringBuilder (Medium)

You are building an **employee payroll system**.

- Create a parent class called `Employee` with private `String` employeeId, private `String` employeeName, and private `double` baseSalary — use primitive `double`
- Add a constructor, getter methods, and a method `getPayDetails()` that returns `"Base salary for " + employeeName + ": " + baseSalary`
- Create three child classes — `FullTimeEmployee` with an additional private `double` bonus, `PartTimeEmployee` with an additional private `int` hoursWorked and private `double` hourlyRate, and `Contractor` with an additional private `double` contractAmount
- Each child class must call `super()` in its constructor
- Each child class must override `getPayDetails()` — call `super.getPayDetails()` and append its own pay breakdown info
- Create a class called `PayrollSystem` with a private `String` companyName and a private `Vector` that holds multiple `Employee` objects — use `Vector` specifically
- Add a constructor, an `addEmployee(Employee e)` method, and a method `generatePayrollReport()` that uses a `StringBuilder` to build and return a report of all employees' pay details
- In `main`, create one of each employee type, add to `PayrollSystem`, and print the full payroll report

---

## Question 7 — Abstract + Interface + HashSet + LinkedList (Hard)

You are building a **university department management system**.

- Create an interface called `Trackable` with methods `getId()` that returns a `String` and `getSummary()` that returns a `String`
- Create an abstract class called `UniversityMember` with private `String` memberId and private `String` memberName, a constructor that takes both, getter methods, and an abstract method `getRole()` that returns a `String`
- Create a class called `Professor` that extends `UniversityMember` and implements `Trackable` with an additional private `String` subject and a private `HashSet` that holds `String` research topics
- `getRole()` returns `"Professor"`, `getId()` returns memberId, `getSummary()` returns a combined `String` of name, subject, and all research topics
- Add a method `addResearchTopic(String topic)` — since it is a `HashSet`, duplicate topics are ignored automatically
- Create a class called `GradStudent` that extends `UniversityMember` and implements `Trackable` with an additional private `String` thesisTopic and a private `String` supervisorId
- `getRole()` returns `"Graduate Student"`, `getId()` returns memberId, `getSummary()` returns name, thesis topic, and supervisor id
- Create a class called `Department` with a private `String` departmentName, a private `LinkedList` of `Professor` objects, and a private `LinkedList` of `GradStudent` objects
- Add methods `addProfessor(Professor p)`, `addGradStudent(GradStudent g)`, and a method `getDepartmentReport()` that uses a `StringBuilder` to build and return a full report of all professors and grad students using their `getSummary()` method
- In `main`, create 2 professors with multiple research topics (include duplicates to show HashSet filtering), create 2 grad students, add all to a `Department`, and print the full department report

---

## Question 8 — Static + Composition + Queue + StringBuilder (Hard)

You are building an **airport check-in system**.

- Create a class called `Passenger` with private `String` passengerId, private `String` passengerName, private `String` destination, and a static `int` totalPassengers that increments in the constructor
- Add a constructor, getter methods, and a static method `getTotalPassengers()` that returns the count
- Create a class called `Flight` with private `String` flightId, private `String` origin, private `String` destination, and a static `int` totalFlights that increments in the constructor
- Add a constructor, getter methods, a static method `getTotalFlights()`, and a method `getFlightInfo()` that returns a `String` with flightId, origin, and destination
- Create a class called `CheckInCounter` with a private `String` counterCode, a `Flight` object — use composition, and a private `Queue` implemented using `LinkedList` that holds `Passenger` objects
- Add a constructor `CheckInCounter(String counterCode, Flight flight)`
- Add a method `joinQueue(Passenger p)` that adds passenger to the queue
- Add a method `checkInNext()` that removes and returns the next passenger — if queue is empty return `null`
- Add a method `getQueueLength()` that returns remaining passengers as `int`
- Create a class called `Airport` with a private `String` airportName and a private `ArrayList` of `CheckInCounter` objects
- Add a method `addCounter(CheckInCounter c)` and a method `getAirportStatus()` that uses `StringBuilder` to return airport name and each counter's code, flight info, and queue length
- In `main`, create 2 flights, 2 check-in counters, add 3 passengers to each counter, check in 2 passengers from one counter, then print the full airport status and static counts

---

## Question 9 — Abstract + Interface + BinaryTree-style LinkedList + HashSet (Hard)

You are building a **company org chart system**.

- Create an interface called `Reportable` with methods `getEmployeeId()` that returns a `String` and `getReport()` that returns a `String`
- Create an abstract class called `OrgMember` with private `String` memberId, private `String` memberName, and private `String` department, a constructor that takes all three, getter methods, and an abstract method `getDesignation()` that returns a `String`
- Create a class called `Manager` that extends `OrgMember` and implements `Reportable` with an additional private `String` teamName and a private `LinkedList` that holds `String` directReportIds of employees reporting to them
- `getDesignation()` returns `"Manager"`, `getEmployeeId()` returns memberId, `getReport()` returns name, team name, department, and all direct report ids
- Add a method `addDirectReport(String employeeId)` that adds to the list
- Create a class called `IndividualContributor` that extends `OrgMember` and implements `Reportable` with an additional private `String` skillSet and a private `HashSet` that holds `String` certifications — duplicate certifications are ignored automatically
- `getDesignation()` returns `"IC"`, `getEmployeeId()` returns memberId, `getReport()` returns name, skillset, department, and all certifications
- Add a method `addCertification(String cert)` that adds to the set
- Create a class called `OrgChart` with a private `String` companyName, a private `ArrayList` of `Manager` objects, and a private `ArrayList` of `IndividualContributor` objects
- Add methods `addManager(Manager m)`, `addIC(IndividualContributor ic)`, and `getOrgReport()` that uses `StringBuilder` to build and return a complete org chart report
- In `main`, create 2 managers with direct reports, create 3 ICs with certifications (include duplicate certifications to show HashSet filtering), add all to `OrgChart`, and print the full org report

---

## Question 10 — Putting It All Together (Hard)

You are building a **mini e-commerce platform**.

- Create an abstract class called `User` with private `String` userId, private `String` email, and private `int` age using primitive `int`, a constructor that takes all three, getter methods, and an abstract method `getUserType()` that returns a `String`
- Create an interface called `Transactable` with methods `addTransaction(String txnId)` that returns a `String` and `getTransactions()` that returns a `List<String>`
- Create a class called `Buyer` that extends `User` and implements `Transactable` with an additional private `String` shippingAddress and a private `ArrayList` for transactions
- `getUserType()` returns `"Buyer"`, `addTransaction()` adds to list and returns `"Transaction recorded: " + txnId`, `getTransactions()` returns the list
- Add a getter for `shippingAddress`
- Create a class called `Seller` that extends `User` with an additional private `String` storeName and a private `HashSet` that holds `String` product categories — duplicate categories are ignored
- `getUserType()` returns `"Seller"`
- Add a method `addCategory(String category)` and a method `getCategories()` that returns the set
- Create a class called `Product` with private `String` productId, private `String` productName, private `double` price, and a `Seller` object — use composition
- Add a constructor, getter methods, and a method `getProductDetails()` that returns productId, productName, price, and seller's store name
- Create a class called `Order` with private `String` orderId, a `Buyer` object, a private `LinkedList` of `Product` objects, and a private `String` status — use composition for Buyer
- Add a constructor `Order(String orderId, Buyer buyer)` that sets status to `"PENDING"` by default
- Add a method `addProduct(Product p)` that adds to the list
- Add a method `getOrderTotal()` that loops and returns total price as `double`
- Add a method `updateStatus(String status)` that updates status
- Add a method `getOrderDetails()` that uses `StringBuilder` to return orderId, buyer name, status, all product names, and total amount
- Create a class called `Platform` with private `String` platformName, a private `Vector` of `Buyer` objects, a private `Vector` of `Seller` objects, and a private `ArrayList` of `Order` objects — use `Vector` for buyers and sellers
- Add methods `addBuyer(Buyer b)`, `addSeller(Seller s)`, `addOrder(Order o)`
- Add a method `getPlatformReport()` that uses `StringBuilder` to return platform name, all buyers with their transactions, all sellers with their categories, and all orders with their details
- In `main`, create 2 sellers with product categories (include duplicates), create 3 products assigned to sellers, create 2 buyers, create 2 orders with multiple products, add transactions to buyers, update one order status, add everything to `Platform`, and print the full platform report

---
