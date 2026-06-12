    # Java OOP + Data Structures Practice Questions — Set 4

---

## Question 1 — Encapsulation + ArrayList (Easy)

You are building a playlist manager for a music app.

- Create a class called `Playlist` with a private `String` for the playlist name and a private collection that can hold multiple `String` song names — choose a data structure that can grow dynamically
- Add a constructor that takes only the playlist name
- Add a method to add a song to the collection
- Add a method to remove a song by name
- Add a method that returns the playlist name
- Add a method that returns all songs
- In `main`, create a `Playlist` object, add 3 songs, remove 1 song, and print the remaining songs

---

## Question 2 — Encapsulation + Stack (Easy)

You are building a browser history manager.

- Create a class called `BrowserHistory` with a private `String` for the browser name and a private collection that works like a stack — think about which data structure follows **Last In First Out (LIFO)** order
- Add a constructor that takes the browser name
- Add a method `visitPage(String url)` that adds a url to the history
- Add a method `goBack()` that removes and returns the last visited url — if history is empty, return `"No history found"`
- Add a method that returns the browser name
- Add a method `getHistorySize()` that returns how many urls are in history as an `int`
- In `main`, create a `BrowserHistory` object, visit 3 pages, go back twice, and print the returned urls and history size after each `goBack()` call

---

## Question 3 — Inheritance + ArrayList (Easy)

You are building a library management system.

- Create a parent class called `LibraryItem` with private `String itemId` and private `String title`, a constructor that takes both values, and getter methods `getItemId()` and `getTitle()` that return their values
- Add a method `getItemInfo()` that returns a `String` containing item id and title
- Create two child classes — `Book` with an additional private `String author` and `Magazine` with an additional private `int issueNumber`
- Each child class must call `super(itemId, title)` in its constructor
- Each child class must override `getItemInfo()` — call `super.getItemInfo()` and append its own info — method must return a `String`
- Create a class called `Library` with a private `String` library name and a private collection that can hold multiple `LibraryItem` objects — choose the right data structure
- Add a constructor that takes the library name
- Add a method `addItem(LibraryItem item)` that adds an item to the collection
- Add a method `getAllItems()` that returns all items
- In `main`, create 2 `Book` objects and 1 `Magazine` object, add all to a `Library`, loop through `getAllItems()` and print each item's info using `getItemInfo()`

---

## Question 4 — Abstraction + Queue (Medium)

You are building a customer support ticket system.

- Create an abstract class called `SupportTicket` with private `String ticketId`, private `String customerName`, and private `String issueDescription`, a constructor that takes all three values, getter methods for all three that return their values, and an abstract method `getPriority()` that returns a `String`
- Add a non-abstract method `getTicketSummary()` that returns a `String` containing ticket id, customer name, issue description, and priority — it must call `getPriority()` internally
- Create two concrete classes — `UrgentTicket` where `getPriority()` returns `"HIGH"` and `NormalTicket` where `getPriority()` returns `"LOW"`
- Each concrete class must call `super(ticketId, customerName, issueDescription)` in its constructor
- Create a class called `TicketQueue` with a private collection that works like a queue — think about which data structure follows **First In First Out (FIFO)** order
- Add a method `addTicket(SupportTicket ticket)` that adds a ticket to the queue
- Add a method `processNextTicket()` that removes and returns the next ticket from the queue — if queue is empty, return `null`
- Add a method `getQueueSize()` that returns the number of tickets waiting as an `int`
- In `main`, add 2 `UrgentTicket` and 2 `NormalTicket` objects to the queue, process them one by one using `processNextTicket()`, and print each ticket's summary using `getTicketSummary()`

---

## Question 5 — Interface + LinkedList (Medium)

You are building a task management system.

- Create an interface called `Manageable` with methods `getTaskId()` that returns a `String`, `getStatus()` that returns a `String`, and `updateStatus(String newStatus)` that returns a `String` message
- Create a class called `Task` with private `String taskId`, private `String taskName`, and private `String status` that implements `Manageable`
- Add a constructor `Task(String taskId, String taskName)` that sets id and name, and sets status to `"PENDING"` by default
- Implement all interface methods — `updateStatus()` should update the status and return `"Status updated to: " + newStatus`
- Create a class called `TaskManager` with a private `String` manager name and a private collection that maintains insertion order and allows duplicates — choose the right data structure
- Add a constructor that takes the manager name
- Add a method `addTask(Task task)` that adds a task to the collection
- Add a method `getTaskById(String taskId)` that loops through the collection and returns the `Task` with matching id — if not found return `null`
- Add a method `getAllTasks()` that returns all tasks
- In `main`, create 3 `Task` objects, add all to `TaskManager`, update the status of one task using `getTaskById()`, and print all tasks' id, name, and status

---

## Question 6 — Polymorphism + ArrayList (Medium)

You are building a zoo animal feeding system.

- Create a parent class called `Animal` with private `String animalName`, private `String animalId`, and private `int age` — use primitive `int`, not `Integer`
- Add a constructor `Animal(String animalId, String animalName, int age)` and getter methods for all three that return their values
- Add a `virtual` method `getFeedingSchedule()` that returns `"Generic feeding schedule for " + animalName`
- Create three child classes — `Lion` with an additional private `String preyType`, `Elephant` with an additional private `int dailyFoodKg` using primitive `int`, and `Parrot` with an additional private `String favoriteFruit`
- Each child class must call `super(animalId, animalName, age)` in its constructor
- Each child class must override `getFeedingSchedule()` — call `super.getFeedingSchedule()` and append its own specific feeding info
- Create a class called `Zoo` with a private `String` zoo name and a private collection that can hold multiple `Animal` objects
- Add a constructor, an `addAnimal(Animal animal)` method, and a `getFeedingReport()` method that loops through all animals and returns a combined `String` of all feeding schedules
- In `main`, create one of each animal, add to zoo, and print the full feeding report

---

## Question 7 — Static + Composition + ArrayList (Medium)

You are building an order management system for a restaurant.

- Create a class called `MenuItem` with private `String itemName`, private `double price`, and a static `int totalMenuItems` that increments in the constructor
- Add a constructor `MenuItem(String itemName, double price)`, getter methods that return values, and a static method `getTotalMenuItems()` that returns the count
- Create a class called `Order` with private `String orderId`, private `String customerName`, and a private collection that holds multiple `MenuItem` objects
- Add a constructor `Order(String orderId, String customerName)` and a static `int totalOrders` that increments in the constructor
- Add a method `addItem(MenuItem item)` that adds an item to the collection
- Add a method `getOrderTotal()` that loops through all items and returns the total price as a `double`
- Add a method `getOrderSummary()` that returns a `String` containing order id, customer name, and total price — it must call `getOrderTotal()` internally
- Add a static method `getTotalOrders()` that returns total orders count
- In `main`, create 3 `MenuItem` objects, create 2 `Order` objects, add different items to each order, print summary for each order, and print total menu items and total orders using static methods

---

## Question 8 — Abstract + Interface + Stack (Medium-Hard)

You are building an undo-redo system for a text editor.

- Create an interface called `Executable` with methods `execute()` that returns a `String` and `undo()` that returns a `String`
- Create an abstract class called `TextCommand` with private `String commandName` and private `String targetText`, a constructor that takes both values, getter methods that return their values, and an abstract method `getDescription()` that returns a `String`
- Create two concrete classes — `TypeCommand` that implements `Executable` and extends `TextCommand` where `execute()` returns `"Typed: " + targetText` and `undo()` returns `"Removed: " + targetText`, and `DeleteCommand` that implements `Executable` and extends `TextCommand` where `execute()` returns `"Deleted: " + targetText` and `undo()` returns `"Restored: " + targetText`
- Each concrete class must implement `getDescription()` returning its own description
- Create a class called `TextEditor` with a private `String` editor name and two private collections that work like stacks — one for undo history and one for redo history
- Add a method `executeCommand(TextCommand cmd)` that executes the command, prints the result, and pushes it to the undo stack
- Add a method `undo()` that pops from undo stack, calls `undo()` on the command, prints the result, and pushes the command to redo stack — if undo stack is empty, print `"Nothing to undo"`
- Add a method `redo()` that pops from redo stack, calls `execute()` on the command, prints the result, and pushes it back to undo stack — if redo stack is empty, print `"Nothing to redo"`
- In `main`, create a `TextEditor`, execute 3 commands, undo 2 times, redo 1 time, and observe the output

---

## Question 9 — Composition + LinkedList + Interface (Hard)

You are building a social media feed system.

- Create an interface called `Postable` with methods `getPostId()` that returns a `String`, `getContent()` that returns a `String`, and `getLikes()` that returns an `int`
- Create a class called `Post` that implements `Postable` with private `String postId`, private `String content`, and private `int likes`
- Add a constructor `Post(String postId, String content)` that sets id and content, and sets likes to `0`
- Add a method `addLike()` that increments likes by 1
- Implement all interface methods to return their values
- Create a class called `UserProfile` with private `String userId`, private `String username`, and a private collection that maintains insertion order and holds `Post` objects
- Add a constructor `UserProfile(String userId, String username)`, getters for id and username
- Add a method `createPost(String postId, String content)` that creates a new `Post` and adds it to the collection
- Add a method `getPostById(String postId)` that returns a `Post` by id — return `null` if not found
- Add a method `getAllPosts()` that returns all posts
- Create a class called `SocialFeed` with a private collection that holds multiple `UserProfile` objects
- Add a method `addUser(UserProfile user)` that adds a user
- Add a method `getUserById(String userId)` that returns a `UserProfile` by id
- Add a method `getFeedSummary()` that loops through all users and all their posts and returns a combined `String` of all post contents and their likes
- In `main`, create 2 `UserProfile` objects, each with 2 posts, add likes to some posts, add both users to `SocialFeed`, and print the full feed summary

---

## Question 10 — Putting It All Together (Hard)

You are building a mini hospital management system.

- Create an abstract class called `Person` with private `String personId`, private `String name`, and private `int age` using primitive `int`, a constructor that takes all three, getter methods that return values, and an abstract method `getRole()` that returns a `String`
- Create an interface called `Schedulable` with methods `addAppointment(String appointment)` that returns a `String` and `getAppointments()` that returns a collection of `String` appointments
- Create a class called `Doctor` that extends `Person` and implements `Schedulable` with an additional private `String specialization` and a private collection for appointments
- `getRole()` returns `"Doctor"`, `addAppointment()` adds to collection and returns `"Appointment added: " + appointment`, `getAppointments()` returns the appointments collection
- Create a class called `Patient` that extends `Person` with an additional private `String` diagnosis and a private collection that holds `String` medical history entries
- `getRole()` returns `"Patient"`, add a method `addMedicalHistory(String entry)` that adds to the collection, and `getMedicalHistory()` that returns the collection
- Create a class called `Appointment` with private `String appointmentId`, a `Doctor` object, a `Patient` object, and private `String` date — use composition for both Doctor and Patient
- Add a constructor that takes all four values, and a method `getAppointmentDetails()` that returns a `String` containing appointment id, date, doctor name and specialization, and patient name and diagnosis
- Create a class called `Hospital` with private `String` hospital name, a private collection for `Doctor` objects, a private collection for `Patient` objects, and a private collection for `Appointment` objects
- Add methods `addDoctor(Doctor d)`, `addPatient(Patient p)`, `addAppointment(Appointment a)` that add to their respective collections
- Add a method `getHospitalReport()` that returns a `String` with hospital name, all doctors' info, all patients' info, and all appointments' details
- In `main`, create 2 `Doctor` objects, 2 `Patient` objects, 2 `Appointment` objects, add appointments to doctors using `addAppointment()`, add everything to `Hospital`, and print the full hospital report
