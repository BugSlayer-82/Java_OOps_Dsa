# Java OOP + DSA Practice Sheet (LeetCode Transition) — Set 1

---

## Question 1 — Student Record Management System (Medium)

You are building a **Student Record Management System** for a coaching institute.

The system should allow users to manage student records efficiently.

### Create a class called `Student`

#### Data Members

- studentId
- studentName
- age
- course
- marks

#### Methods

- Constructor
- Getter methods
- `toString()`

### Create a class called `StudentRecordManager`

#### Data Members

- studentRecords

#### Methods

- `addStudent(Student student)`
- `searchStudent(studentId)`
- `removeStudent(studentId)`
- `updateMarks(studentId, marks)`
- `getTopper()`
- `getAverageMarks()`
- `getStudentsAboveMarks(marks)`
- `printAllStudents()`

### Requirements

- Student ID should always be unique.
- Searching should return the matching student.
- Removing a student should update the records correctly.
- Topper should be determined based on marks.
- Average marks should be calculated using all students.

### In `main()`

- Create 8 students.
- Add all students.
- Search student **S103**.
- Update marks of **S104**.
- Remove **S106**.
- Print topper.
- Print average marks.
- Print students scoring more than **80**.
- Print all remaining students.

---

## Question 2 — Library Book Management System (Medium)

### Class `Book`
**Data Members**
- bookId
- bookName
- authorName
- category
- quantity

**Methods**
- Constructor
- Getter methods
- `toString()`

### Class `Library`

**Data Members**
- books

**Methods**
- addBook(Book book)
- issueBook(bookId)
- returnBook(bookId)
- searchBook(bookId)
- searchBookByCategory(category)
- removeBook(bookId)
- printAvailableBooks()

**In main()**
- Add 10 books.
- Issue the same book twice.
- Return one book.
- Search B105.
- Print Programming books.
- Remove B108.
- Print all available books.

---

## Question 3 — Browser History Manager (Medium)

### Class `WebPage`

**Data Members**
- pageId
- url
- title
- visitTime

**Methods**
- Constructor
- Getter methods
- toString()

### Class `BrowserHistory`

**Data Members**
- history

**Methods**
- visitPage(WebPage page)
- goBack()
- goForward()
- searchPage(url)
- removeDuplicatePages()
- getRecentPages(limit)
- printHistory()

**In main()**
- Visit 10 pages.
- Visit Google twice.
- Visit GitHub twice.
- Go back twice.
- Go forward once.
- Search GitHub.
- Print latest 5 pages.
- Remove duplicate pages.
- Print final history.

---

## Question 4 — Customer Order Management System (Medium)

### Class `Order`

**Data Members**
- orderId
- customerName
- productName
- quantity
- orderStatus

**Methods**
- Constructor
- Getter methods
- toString()

### Class `OrderManager`

**Data Members**
- orders

**Methods**
- placeOrder(Order order)
- processNextOrder()
- cancelOrder(orderId)
- searchOrder(orderId)
- getPendingOrders()
- getCompletedOrders()
- printAllOrders()

**In main()**
- Place 10 orders.
- Process 4 orders.
- Cancel O107.
- Search O104.
- Print pending orders.
- Print completed orders.
- Print all remaining orders.

---

## Question 5 — Employee Directory System (Medium)

### Class `Employee`

**Data Members**
- employeeId
- employeeName
- department
- designation
- salary

**Methods**
- Constructor
- Getter methods
- toString()

### Class `EmployeeDirectory`

**Data Members**
- employees

**Methods**
- addEmployee(Employee employee)
- searchEmployee(employeeId)
- removeEmployee(employeeId)
- updateSalary(employeeId, salary)
- getHighestPaidEmployee()
- getEmployeesByDepartment(department)
- printAllEmployees()

**In main()**
- Add 10 employees.
- Search E104.
- Update salary of E107.
- Remove E102.
- Print highest-paid employee.
- Print IT department employees.
- Print all remaining employees.

---

## Constraints

- Try to optimize the time complexity wherever possible.
- Avoid unnecessary traversals.
- Use appropriate data structures.

## Difficulty

- Overall Level: Medium
- OOP: 30%
- DSA: 70%
- Target: LeetCode / HackerRank Transition
