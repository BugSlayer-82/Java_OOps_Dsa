# OOP + Mixed DSA Practice Questions (Java)

Each question mainly tests **OOP concepts**, while hiding one or more
**DSA concepts** inside the requirements. Do **not** reveal exact class
names, method names or data structures in your solution unless you
decide they are the best fit.

------------------------------------------------------------------------

## 1. Hospital Emergency Queue

-   Each patient has an ID, name and emergency level. All details must
    be initialized during object creation.
-   Admit multiple patients.    
-   The most critical patient should always be treated first.
-   Quickly check whether a patient ID is already registered.
-   Remove the patient after treatment.

**Concepts touched:** Constructor, Encapsulation, Priority Queue,
HashMap

------------------------------------------------------------------------

## 2. Browser Back & Forward History

-   Store visited pages.
-   Support Back and Forward navigation.
-   Visiting a new page after going back should clear the forward
    history.
-   Hide internal history from outside classes.

**Concepts touched:** Stack, Encapsulation

------------------------------------------------------------------------

## 3. Food Delivery System

-   Orders arrive continuously.
-   Deliver them in the same order they were received.
-   Quickly find an order using its order ID.
-   Prevent direct modification of order status.

**Concepts touched:** Queue, HashMap, Encapsulation

------------------------------------------------------------------------

## 4. University Student Registry

-   Each student has a unique roll number.
-   Duplicate registrations are not allowed.
-   Display all students alphabetically.
-   Student details should be initialized using constructors.

**Concepts touched:** HashSet, TreeSet, Constructor

------------------------------------------------------------------------

## 5. Music Playlist

-   Songs can be added at the beginning, end or between two songs.
-   Remove any song efficiently.
-   Move to next/previous song.

**Concepts touched:** Doubly Linked List, Encapsulation

------------------------------------------------------------------------

## 6. Company Employee Hierarchy

-   Every employee belongs to exactly one manager except the CEO.
-   Print the hierarchy from CEO to any employee.
-   Search employees quickly by employee ID.

**Concepts touched:** Tree, HashMap, Inheritance

------------------------------------------------------------------------

## 7. City Navigation Network

-   Cities are connected by roads.
-   Add new roads.
-   Check whether one city can reach another.
-   Avoid duplicate city creation.

**Concepts touched:** Graph, BFS/DFS, HashMap

------------------------------------------------------------------------

## 8. Search Suggestion System

-   Store thousands of words.
-   As the user types a prefix, display matching words quickly.
-   New words can be inserted anytime.

**Concepts touched:** Trie, Encapsulation

------------------------------------------------------------------------

## 9. Task Scheduler

-   Every task has a priority and deadline.
-   Highest-priority task executes first.
-   Completed tasks are removed automatically.
-   Search by task ID.

**Concepts touched:** Heap/Priority Queue, HashMap

------------------------------------------------------------------------

## 10. Recently Opened Documents

-   Opening a document moves it to the most recent position.
-   If storage is full, remove the least recently used document.
-   Access by document ID should be fast.

**Concepts touched:** HashMap, Doubly Linked List (LRU), Encapsulation

------------------------------------------------------------------------

### Notes

-   Decide your own classes and methods.
-   Focus on good OOP design before choosing the data structure.
-   Try solving each question without looking at the concept hint first.
