# HackerRank 3rd Sem Algorithm Portfolio

## Student Information

* **Name:** Poornima R
* **SRN:** R25EF181
* **Semester:** 3rd Semester
* **Programming Language:** Java 15
* **HackerRank Profile:** [Poornima R - HackerRank](https://www.hackerrank.com/profile/poornimaraju1278)
* **GitHub Repository:** [HackerRank-3rdSem-Algorithm-Portfolio](https://github.com/poornimaraju1278-stack/HackerRank-3rdSem-Algorithm-Portfolio)

---

## About This Portfolio

This repository contains my solutions for the five curated algorithmic problems required for Activity 12. The problems cover arrays, counting, sorting, searching, and greedy algorithms.

Each solution is implemented in **Java 15** and organized into a separate folder for clarity and easy evaluation.

---

## Repository Structure

```text
HackerRank-3rdSem-Algorithm-Portfolio/
│
├── 01-Mini-Max-Sum/
│   └── solution.java
│
├── 02-Birthday-Cake-Candles/
│   └── solution.java
│
├── 03-Insertion-Sort-Part-1/
│   └── solution.java
│
├── 04-Binary-Search/
│   └── solution.java
│
├── 05-Mark-and-Toys/
│   └── solution.java
│
└── README.md
```

---

# Problem 1 — Mini-Max Sum

### Problem Summary

Given five positive integers, calculate the minimum and maximum values that can be obtained by summing exactly four of the five integers.

### Approach

First, calculate the total sum of all elements while finding the minimum and maximum values. The minimum sum is obtained by excluding the maximum element, while the maximum sum is obtained by excluding the minimum element.

### Important Steps

1. Traverse the array once.
2. Calculate the total sum.
3. Find the minimum element.
4. Find the maximum element.
5. Calculate:

   * Minimum Sum = Total Sum − Maximum Element
   * Maximum Sum = Total Sum − Minimum Element

### Complexity

* **Time Complexity:** O(N)
* **Auxiliary Space:** O(1)

### Why This Approach?

It requires only one traversal and avoids sorting, making it efficient for the problem.

**HackerRank Challenge:** [Mini-Max Sum](https://www.hackerrank.com/challenges/mini-max-sum/problem)

---

# Problem 2 — Birthday Cake Candles

### Problem Summary

Given a list of candle heights, determine how many candles have the maximum height.

### Approach

Find the maximum candle height and then count how many elements are equal to that maximum value.

### Important Steps

1. Find the maximum value in the list.
2. Traverse the list again.
3. Count every candle whose height equals the maximum.

### Complexity

* **Time Complexity:** O(N)
* **Auxiliary Space:** O(1)

### Why This Approach?

The solution uses linear traversal and does not require sorting the array, providing efficient O(N) performance.

**HackerRank Challenge:** [Birthday Cake Candles](https://www.hackerrank.com/challenges/birthday-cake-candles/problem)

---

# Problem 3 — Insertion Sort Part 1

### Problem Summary

Insert the last element of an almost-sorted array into its correct position using the insertion sort technique, printing the array after each shift.

### Approach

Store the last element as the value to be inserted. Compare it with the elements before it and shift larger elements one position to the right until the correct position is found.

### Important Steps

1. Store the last element.
2. Start comparing from the element immediately before it.
3. Shift larger elements one position to the right.
4. Insert the stored value into its correct position.
5. Print the array after each shift and after insertion.

### Complexity

* **Time Complexity:** O(N) for this single insertion operation
* **Auxiliary Space:** O(1)

### Why This Approach?

The algorithm directly follows the insertion-sort process and uses constant extra space.

**HackerRank Challenge:** [Insertion Sort Part 1](https://www.hackerrank.com/challenges/insertionsort1/problem)

---

# Problem 4 — Binary Search

### Problem Summary

Given a sorted array and a target value, find the index of the target using binary search.

### Approach

Use two pointers, `low` and `high`, to represent the current search range. Calculate the middle element and compare it with the target. If the target is larger, search the right half; otherwise, search the left half.

### Important Steps

1. Set `low` to the first index.
2. Set `high` to the last index.
3. Calculate the middle index.
4. Compare the middle element with the target.
5. Reduce the search range by half after each comparison.
6. Return the target index when found.

### Complexity

* **Time Complexity:** O(log N)
* **Auxiliary Space:** O(1)

### Why This Approach?

Because the array is sorted, binary search eliminates half of the remaining search space after every comparison.

**HackerRank Challenge:** [Intro to Tutorial Challenges](https://www.hackerrank.com/challenges/tutorial-intro/problem)

---

# Problem 5 — Mark and Toys

### Problem Summary

Given the prices of toys and a fixed budget, determine the maximum number of toys that can be purchased without exceeding the budget.

### Approach

Sort the toy prices in ascending order and purchase the cheapest toys first until the budget cannot accommodate another toy.

### Important Steps

1. Sort all toy prices.
2. Start with a total cost of zero.
3. Traverse the sorted prices.
4. Add a toy if the total remains within the budget.
5. Stop when the next toy exceeds the available budget.
6. Return the number of toys purchased.

### Complexity

* **Time Complexity:** O(N log N)
* **Auxiliary Space:** O(1) excluding the sorting implementation

### Why This Approach?

Buying the cheapest toys first maximizes the number of toys that can be purchased with the available budget. Sorting makes this greedy strategy straightforward and efficient.

**HackerRank Challenge:** [Mark and Toys](https://www.hackerrank.com/challenges/mark-and-toys/problem)

---

# Complexity Summary

| Problem               | Algorithm        | Time Complexity | Auxiliary Space |
| --------------------- | ---------------- | --------------: | --------------: |
| Mini-Max Sum          | Linear Traversal |            O(N) |            O(1) |
| Birthday Cake Candles | Counting Maximum |            O(N) |            O(1) |
| Insertion Sort Part 1 | Insertion        |            O(N) |            O(1) |
| Binary Search         | Binary Search    |        O(log N) |            O(1) |
| Mark and Toys         | Greedy + Sorting |      O(N log N) |            O(1) |

---

# Evidence of Completion

All five required HackerRank problems were successfully solved and accepted using Java 15.

1. Mini-Max Sum — Accepted
2. Birthday Cake Candles — Accepted
3. Insertion Sort Part 1 — Accepted
4. Binary Search / Intro to Tutorial Challenges — Accepted
5. Mark and Toys — Accepted

Screenshots of the accepted HackerRank submissions are maintained as evidence for the Activity 12 submission.

---

# Learning Reflection

Working on these five algorithmic problems helped me understand how different algorithmic techniques can be selected according to the structure of a problem. Mini-Max Sum and Birthday Cake Candles demonstrated how simple linear traversal can solve problems efficiently without unnecessary sorting. Insertion Sort Part 1 helped me understand shifting elements and maintaining the correct order during insertion. Binary Search showed how a sorted array can reduce the search space by half at every step, resulting in logarithmic time complexity. Mark and Toys demonstrated the use of sorting together with a greedy strategy to maximize the number of items purchased within a limited budget.

Implementing all five solutions in Java 15 also improved my confidence with arrays, lists, loops, conditions, sorting, and searching. Organizing each solution separately in GitHub made the work easier to understand and maintain. This activity strengthened both my problem-solving skills and my understanding of analysing time and auxiliary-space complexity.

---

## Conclusion

This repository demonstrates my implementation, analysis, and documentation of five fundamental algorithmic problems as part of Activity 12.

**Student:** Poornima R
**SRN:** R25EF181
**Semester:** 3rd Semester
