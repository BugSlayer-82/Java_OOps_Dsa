# DSA Practice Questions (Java) — 14 Topics × 10 Questions

Basic to mid-level, concept-focused questions. Each question is defined with a bit of context so it's clear what's being asked.

---

## 1. Array

1. Find the **second largest distinct element** in an array of integers. If it doesn't exist, indicate that clearly.
2. Given an array of integers, **rotate the array to the right by k positions**. For example, `[1,2,3,4,5]` rotated by `2` becomes `[4,5,1,2,3]`.
3. Given an array, **find the "missing number"** — the array contains `n-1` distinct numbers taken from the range `1` to `n`, find the one number that's missing.
4. Given an array of integers, **find the maximum sum of any contiguous subarray** (a sequence of consecutive elements).
5. Given an array, **move all zeroes to the end** while keeping the relative order of the other elements the same.
6. Given two sorted arrays, **merge them into a single sorted array**.
7. Given an array, **find all pairs of elements whose sum equals a given target value**.
8. Given an array, **find the majority element** — the element that appears more than n/2 times (assume it always exists).
9. Given a 2D array (matrix) of integers, **print it in spiral order** (outer ring first, then inward).
10. Given an array, **check whether it can be split into two parts with equal sum**. If yes, print the index at which the split happens.

---

## 2. ArrayList

1. Given an ArrayList of integers, **remove all duplicate elements** while keeping the original order.
2. Given an ArrayList of strings, **sort it in alphabetical order** without using a built-in sort — you may use any method you like to reorder elements manually or via comparator logic.
3. Given an ArrayList of integers, **find the sum and average** of all elements.
4. Given an ArrayList, **reverse it in place** (without creating a brand-new list to hold the final result).
5. Given two ArrayLists, **find the common elements** between them (like an intersection).
6. Given an ArrayList of integers, **remove all elements that are divisible by a given number**.
7. Given an ArrayList of objects representing students (name and marks), **find the student with the highest marks**.
8. Given an ArrayList of integers, **find the index of the first occurrence of a given value**. Return -1 if not found.
9. Given an ArrayList of integers, **partition it into two lists**: one containing even numbers and one containing odd numbers.
10. Given an ArrayList of integers with possible negative numbers, **find the largest and smallest elements** in a single pass.

---

## 3. Vector

1. Simulate a **rolling history of the last N items entered** by a user — once more than N items are added, the oldest one should be discarded automatically.
2. Given a Vector of integers, **check if it is sorted in non-decreasing order**.
3. Given a Vector of integers, **insert a new element at a specific index** and shift the rest accordingly.
4. Given a Vector of strings representing a to-do list, **remove a task by name** if it exists, otherwise print "Task not found".
5. Given a Vector of integers, **find how many elements are greater than a given value**.
6. Given a Vector of integers, **copy its elements into a plain array**.
7. Simulate a **simple undo feature**: every action taken is pushed into a Vector, and "undo" removes the most recent action.
8. Given a Vector of integers, **remove all elements at even indices**.
9. Given a Vector of student names, **check whether a particular student is present**, and print their position if found.
10. Given a Vector of integers, **find the total number of elements and how many are duplicates** of some other element in the same Vector.

---

## 4. LinkedList

1. Given a LinkedList of integers, **reverse the order of the elements**.
2. Given a LinkedList of integers, **find the middle element** in a single traversal (without counting the length first).
3. Given a LinkedList of integers, **detect whether it contains a specific value**, and if so, at what position.
4. Given a LinkedList of integers, **remove the Nth node from the end** (e.g., remove the 2nd-last element).
5. Given a LinkedList of integers, **remove all duplicate elements**, keeping only the first occurrence of each value.
6. Given two LinkedLists of integers sorted in increasing order, **merge them into a single sorted LinkedList**.
7. Given a LinkedList, **check if it is a palindrome** (reads the same forward and backward).
8. Given a LinkedList of integers, **find the sum of all elements at odd positions and even positions separately**.
9. Given a LinkedList, **swap every pair of adjacent nodes** (e.g., `1->2->3->4` becomes `2->1->4->3`).
10. Given a LinkedList of integers, **rotate the list to the left by k positions**.

---

## 5. Stack

1. Given a string containing only brackets `(){}[]`, **check whether the brackets are balanced/valid**.
2. Given a string, **reverse it using a stack**.
3. Given an arithmetic expression in postfix notation (e.g., `"23+"`), **evaluate its result using a stack**.
4. Given a stack of integers, **sort the stack** so the smallest element ends up on top (only stack operations allowed — push, pop, peek).
5. Simulate the **"undo" feature of a text editor**: every character typed is pushed onto a stack, and pressing undo pops the last character.
6. Given an array of integers, **find the "next greater element"** for each element — the first element to its right that is bigger than it, using a stack.
7. Given a stack, **check whether it is empty or contains only one type of value** (all elements are the same).
8. Given a string representing a file path with `.` and `..` (like `/a/b/../c`), **simplify the path using a stack**.
9. Given two stacks, **check whether they contain the exact same elements in the exact same order**.
10. Implement a **"Min Stack"** — a stack that, in addition to push/pop, can tell you the minimum element currently in the stack at any time.

---

## 6. Queue

1. Simulate a **ticket counter**: people are added to a queue as they arrive and served (removed) one at a time in the order they arrived.
2. Given a queue of integers, **reverse the entire queue** using only queue operations (and possibly one stack).
3. Implement a queue using two stacks (internally), and demonstrate enqueue and dequeue operations working correctly.
4. Given a queue of integers, **find the average of all elements** without permanently destroying the queue's contents.
5. Simulate a **printer queue**: print jobs are added with a name, and processed one at a time in first-come-first-served order.
6. Given a queue of integers, **interleave the first half and second half** of the queue (e.g., `1,2,3,4,5,6` becomes `1,4,2,5,3,6`).
7. Given a queue, **check whether a specific value exists in it** without permanently modifying the queue.
8. Simulate a **circular queue of fixed size**, where once it's full, adding new elements overwrites the oldest ones.
9. Given a queue of integers, **remove all elements that are negative**, keeping the relative order of the rest.
10. Simulate **round-robin task scheduling**: given a list of tasks and a fixed time slice, use a queue to determine the order in which tasks get processed.

---

## 7. ArrayDeque

1. Given a sequence of numbers and a window size k, **find the maximum element in every window of size k** as it slides across the array.
2. Use an ArrayDeque to **check whether a given string is a palindrome**, adding characters from both ends.
3. Simulate a **browser's back and forward navigation** using two deques (one for "back" history, one for "forward" history).
4. Given a deque of integers, **add elements alternately to the front and back**, starting with the front, and print the final order.
5. Given a deque, **remove all occurrences of a given value** from both ends without disturbing the middle order.
6. Implement a **basic stack using ArrayDeque** (only using addFirst/removeFirst-type operations) and demonstrate push/pop.
7. Implement a **basic queue using ArrayDeque** (only using addLast/removeFirst-type operations) and demonstrate enqueue/dequeue.
8. Given a deque of integers, **find the sum of elements at the front half and back half separately**.
9. Simulate a **palindrome checker for a sentence**, ignoring spaces and case, using a deque.
10. Given a deque, **rotate its elements to the right by k positions** using only deque operations.

---

## 8. HashSet

1. Given an array of integers, **check whether it contains any duplicate elements**.
2. Given two arrays, **find their intersection** (common elements, no duplicates in the result).
3. Given two arrays, **find their union** (all distinct elements from both, no duplicates).
4. Given a string, **check whether all characters in it are unique** (no character repeats).
5. Given an array of integers, **find all elements that appear only once** (i.e., their frequency is exactly 1).
6. Given a list of email addresses, **remove exact duplicates** and print only the unique ones.
7. Given two arrays, **find the elements present in the first array but not in the second** (set difference).
8. Given an array of integers, **check if there exists a pair of elements with a given difference** (e.g., difference = 3).
9. Given a sentence, **find all distinct words used in it**, ignoring case.
10. Given an array of integers, **determine the count of distinct elements** in the array.

---

## 9. HashMap

1. Given a sentence, **count the frequency of each word** in it.
2. Given a string, **find the first non-repeating character** in it using character frequency counts.
3. Given two arrays, **check whether they are "anagrams" of each other** (same characters with the same frequency, possibly different order).
4. Given an array of integers, **find the element with the highest frequency** (the mode).
5. Given a list of student names and their marks, **store them in a HashMap and retrieve marks by name**.
6. Given an array of integers and a target sum, **find two numbers that add up to the target** using a HashMap (single pass, no nested loops).
7. Given a list of transactions (name and amount), **calculate the total amount spent by each person**.
8. Given two strings, **check whether one is a rearrangement (anagram) of the other**.
9. Given an array of integers, **group elements by whether they are even or odd**, storing both groups in a HashMap.
10. Given a list of words, **find all words that are anagrams of each other and group them together**.

---

## 10. Strings

1. Given a string, **check whether it is a palindrome**, ignoring case and spaces.
2. Given a string, **reverse the order of words** in it (e.g., `"I love Java"` becomes `"Java love I"`).
3. Given two strings, **check whether they are anagrams** of each other.
4. Given a string, **count the number of vowels and consonants** in it.
5. Given a string, **find the longest word** in it.
6. Given a string, **remove all extra spaces** so that words are separated by exactly one space.
7. Given a string, **check whether it contains only digits, only letters, or a mix of both**.
8. Given a string and a smaller string (pattern), **check whether the pattern occurs anywhere inside the string**, and at what index.
9. Given a string, **find the frequency of each character** in it.
10. Given a sentence, **capitalize the first letter of every word**.

---

## 11. Binary Tree

1. Given a binary tree, **print all its leaf nodes** (nodes with no children).
2. Given a binary tree, **find its height** (the number of levels from root to the deepest leaf).
3. Given a binary tree, **count the total number of nodes** in it.
4. Given a binary tree, **perform an in-order traversal** and print the values in that order.
5. Given a binary tree, **check whether two binary trees are structurally identical** (same shape, same values).
6. Given a binary tree, **find the sum of all node values**.
7. Given a binary tree, **print all nodes at a given level** (e.g., all nodes at level 3).
8. Given a binary tree, **check whether it is height-balanced** — meaning for every node, the height difference between its left and right subtrees is at most 1.
9. Given a binary tree, **mirror it** — swap every node's left and right children.
10. Given a binary tree, **find the maximum value present** in the tree.

---

## 12. Binary Search Tree (BST)

1. Given a BST, **check whether a given value exists** in it.
2. Given a BST, **insert a new value** into it while maintaining the BST property.
3. Given a BST, **find the minimum and maximum value** stored in it.
4. Given a BST, **perform an in-order traversal** and verify that the output is sorted (this confirms the tree is a valid BST).
5. Given a BST, **delete a given value** from it while keeping the tree a valid BST.
6. Given a BST, **find the "Lowest Common Ancestor"** of two given values (the deepest node that is an ancestor of both).
7. Given a BST, **count how many nodes have values within a given range** (e.g., between 10 and 50).
8. Given a set of integers, **build a BST by inserting them one at a time**, and print the final in-order traversal.
9. Given a BST, **find the "successor"** of a given value — the next larger value present in the tree.
10. Given a normal binary tree (not necessarily sorted), **check whether it satisfies the BST property**.

---

## 13. Trie

1. Given a list of words, **insert them into a Trie**, then check whether a given word exists in it.
2. Given a Trie built from a list of words, **check whether a given prefix exists** among any of the inserted words.
3. Given a list of words, **use a Trie to find all words that start with a given prefix**.
4. Given a Trie, **count the total number of words stored** in it.
5. Given a Trie, **delete a specific word** from it without affecting other stored words.
6. Given a list of contact names, **build a Trie and implement an "auto-complete"** feature that suggests names starting with what's typed so far.
7. Given a Trie, **find the longest common prefix** among all the words stored in it.
8. Given a list of words, **check for each word whether it is a prefix of any other word** in the list, using a Trie.
9. Given a Trie, **count how many words start with a specific given prefix**.
10. Given two lists of words, **build a Trie from the first list** and check how many words from the second list already exist in it.

---

## 14. Graph

1. Given a graph and two nodes, **check whether a path exists between them** (are they connected).
2. Given a graph, **perform a Breadth-First Search (BFS)** starting from a given node and print the order of visited nodes.
3. Given a graph, **perform a Depth-First Search (DFS)** starting from a given node and print the order of visited nodes.
4. Given a graph, **count the number of connected components** in it.
5. Given a graph, **check whether it contains a cycle**.
6. Given a graph representing friendships, **find all direct and indirect friends of a given person** (everyone reachable from them).
7. Given a graph, **find the shortest path (in terms of number of edges) between two nodes** using BFS.
8. Given a graph, **print the degree of every node** (the number of edges connected to it).
9. Given a graph, **check whether it is bipartite** — meaning its nodes can be divided into two groups such that no two nodes in the same group are directly connected.
10. Given a list of city names and roads between them, **build a graph and check whether all cities are reachable from a given starting city**.

---

*Total: 140 questions across 14 topics. Solve one at a time and share your approach/code whenever you want feedback.*
