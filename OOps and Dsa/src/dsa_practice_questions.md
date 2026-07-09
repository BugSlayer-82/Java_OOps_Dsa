# DSA Practice Questions (Java)

Difficulty increases from Q1 (very basic) to Q5 (a bit harder). Try to solve each on your own before checking any solution.

---

## Q1: Sum of Array

Given an array of integers, return the sum of all elements.

**Example:**
```
Input: [1, 2, 3, 4, 5]
Output: 15
```

**Constraints:**
- 0 <= array length <= 10^4
- -1000 <= array[i] <= 1000

**Method signature:**
```java
public int sumArray(int[] arr) {
    // your code here
}
```

---

## Q2: Reverse a String

Given a string, return it reversed.

**Example:**
```
Input: "hello"
Output: "olleh"
```

**Constraints:**
- 0 <= string length <= 10^4

**Method signature:**
```java
public String reverseString(String s) {
    // your code here
}
```

---

## Q3: Check for Duplicates

Given an array of integers, return true if any value appears at least twice, and false if every element is distinct.

**Example:**
```
Input: [1, 2, 3, 1]
Output: true

Input: [1, 2, 3, 4]
Output: false
```

**Constraints:**
- 1 <= array length <= 10^5
- -10^9 <= array[i] <= 10^9

**Method signature:**
```java
public boolean containsDuplicate(int[] arr) {
    // your code here
}
```

**Hint:** Think about using a HashSet.

---

## Q4: Two Sum

Given an array of integers and a target value, return the indices of the two numbers such that they add up to the target. Assume exactly one solution exists, and you cannot use the same element twice.

**Example:**
```
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
Explanation: nums[0] + nums[1] = 2 + 7 = 9
```

**Constraints:**
- 2 <= array length <= 10^4
- -10^9 <= array[i] <= 10^9

**Method signature:**
```java
public int[] twoSum(int[] nums, int target) {
    // your code here
}
```

**Hint:** A brute force O(n^2) solution is fine first, but try to think of an O(n) solution using a HashMap.

---

## Q5: Valid Parentheses

Given a string containing just the characters `(`, `)`, `{`, `}`, `[`, `]`, determine if the input string is valid. A string is valid if brackets are closed in the correct order and every opening bracket has a matching closing bracket of the same type.

**Example:**
```
Input: "()[]{}"
Output: true

Input: "(]"
Output: false

Input: "([)]"
Output: false
```

**Constraints:**
- 1 <= string length <= 10^4
- s consists only of parentheses characters '(', ')', '{', '}', '[', ']'

**Method signature:**
```java
public boolean isValid(String s) {
    // your code here
}
```

**Hint:** Think about using a Stack.

---

Once you've attempted these, send me your solutions or ask for hints, and I'll check your work and give you the next batch (slightly harder).
