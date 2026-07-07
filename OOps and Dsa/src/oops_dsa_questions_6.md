# OOP + Light DSA Practice Questions (Java)

Each question mainly tests OOP concepts, with a small DSA hint baked in (no exact
attribute/method names given — design it yourself).

---

## 1. Library Book Manager

- Each **book** has a title and a unique book ID; its availability status should
  not be changeable directly from outside the class.
- You should be able to **add multiple books** to the library.
- Given a book ID, the library should be able to **quickly check if the book
  exists** and show its details — think about which structure makes this lookup
  fast instead of checking one by one.
- When a book is created, all its details should be set up in one go at creation
  time.

**Concepts touched:** Encapsulation, Constructor, fast lookup (Map hint)

---

## 2. Employee Salary Register

- Each **employee** has a name and an employee ID; their salary should only be
  readable/updatable through controlled methods, not directly.
- The register should hold **multiple employees**.
- Given an employee ID, you should be able to **retrieve their salary quickly**
  — avoid scanning through everyone one by one.
- There should be only **one Register** for the whole company, accessible from
  anywhere in the program.

**Concepts touched:** Encapsulation, Singleton, fast lookup

---

## 3. Online Course Enrollment

- Each **course** has a name and a course code, set up completely at the time
  it's created — no piece-by-piece filling in afterward.
- You should be able to **enroll multiple courses** into a catalog.
- Given a course code, the catalog should be able to **tell instantly whether
  that course exists** — think about a structure that avoids checking every
  single course.

**Concepts touched:** Constructor, fast lookup (Map/Set hint)

---

## 4. Bank Account Locker

- Each **account** has an account number and a balance; the balance should not
  be directly modifiable from outside — only through proper deposit/withdraw
  style methods.
- The bank should be able to **store many accounts**.
- Given an account number, you should be able to **find that account quickly**
  rather than going through the list one at a time.
- There should be only **one Bank** managing all accounts, no matter how many
  parts of the program try to access it.

**Concepts touched:** Encapsulation, Singleton, fast lookup

---

## 5. Product Inventory Checker

- Each **product** has a name and a unique product code, fully set up the
  moment it's created.
- The inventory should be able to hold **several products** at once.
- Given a product code, the system should **quickly say whether that product is
  in stock** — think about which structure avoids a slow one-by-one search.

**Concepts touched:** Constructor, Encapsulation, fast lookup (Map hint)

---

### Notes
- None of these tell you exact class/method names or which data structure to
  use — that's your design decision.
- The "quickly find/check" hints are nudging you toward using a `HashMap` (or
  similar) instead of looping through an `ArrayList`/array every time.
- Try solving each with plain OOP first, then optimize the lookup part once it
  works.
