# Java Vector Practice Questions (Easy → Hard)

## 🟢 Level 1: Basic Vector Questions (1--5)

### Q1. Create a Vector

Create a `Vector<Integer>` and insert the numbers: `10, 20, 30, 40, 50`

Print the vector.

### Q2. Insert Elements

Given:

``` java
Vector<String> fruits = new Vector<>();
```

Insert:

    Apple
    Banana
    Mango
    Orange

Now insert `"Grapes"` at index `2`.

**Expected Output**

    Apple
    Banana
    Grapes
    Mango
    Orange

### Q3. Remove Elements

Given:

    [10, 20, 30, 40, 50]

Remove: - element at index `2` - value `50`

Print the final vector.

### Q4. Update Elements

Given:

    [5,10,15,20]

Replace `15` with `100`.

**Expected Output**

    [5,10,100,20]

### Q5. Search an Element

Given:

    [10,20,30,40,50]

Check whether `30` exists.

If yes:

    Found

Otherwise:

    Not Found

## 🟡 Level 2: Traversal Questions (6--10)

### Q6. Print All Elements

Print all elements of a vector using: - `for` loop - enhanced `for`
loop - `Iterator`

### Q7. Sum of Elements

**Input**

    [2,4,6,8,10]

**Output**

    30

### Q8. Find Maximum

**Input**

    [8,3,15,1,9]

**Output**

    15

### Q9. Count Even Numbers

**Input**

    [2,5,8,11,14,17]

**Output**

    3

### Q10. Reverse Print

Without changing the vector, print it in reverse order.

**Example**

    Input:
    [1,2,3,4]

    Output:
    4 3 2 1

## 🟠 Level 3: Intermediate Questions (11--15)

### Q11. Reverse the Vector

**Input**

    [1,2,3,4,5]

**Output**

    [5,4,3,2,1]

### Q12. Remove Duplicates

**Input**

    [1,2,2,3,4,4,5]

**Output**

    [1,2,3,4,5]

> Maintain the first occurrence.

### Q13. Rotate Right by One

**Input**

    [1,2,3,4,5]

**Output**

    [5,1,2,3,4]

### Q14. Second Largest Element

**Input**

    [10,5,30,25,40]

**Output**

    30

### Q15. Frequency of Each Element

**Input**

    [1,2,2,3,3,3]

**Output**

    1 -> 1
    2 -> 2
    3 -> 3

## 🔴 Level 4: Interview Level (16--20)

### Q16. Merge Two Sorted Vectors

**Input**

    v1 = [1,3,5]
    v2 = [2,4,6]

**Output**

    [1,2,3,4,5,6]

### Q17. Find Missing Number

**Input**

    [1,2,3,5]

**Output**

    4

> Numbers are from `1` to `n`.

### Q18. Move All Zeroes to End

**Input**

    [0,1,0,3,12]

**Output**

    [1,3,12,0,0]

### Q19. Leader Elements

A leader is greater than all elements to its right.

**Input**

    [16,17,4,3,5,2]

**Output**

    17
    5
    2

### Q20. Remove All Occurrences of a Value

**Input**

    Vector = [1,2,3,2,4,2,5]
    Target = 2

**Output**

    [1,3,4,5]

## ⭐ Bonus Challenges

1.  Implement your own `Vector` class using an array.
2.  Find the intersection of two vectors.
3.  Find the union of two vectors.
4.  Check whether two vectors are equal.
5.  Sort a vector without using `Collections.sort()`.
6.  Find the kth largest element.
7.  Find the longest increasing subsequence in a vector.
8.  Rotate the vector by `k` positions.
9.  Check if the vector is a palindrome.
10. Implement CRUD operations (`add`, `remove`, `set`, `get`) manually
    using arrays.

------------------------------------------------------------------------

## Recommended Order

Solve Questions **1 → 20** without looking at the solutions. Then review
your answers, analyze time complexity, and practice dry runs.
