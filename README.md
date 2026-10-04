# HackerRank Algorithms & GitHub Coding Portfolio

## Student Information

* **Name:** Poornima R
* **SRN:** R25EF181
* **Semester:** 3rd Semester
* **Programming Language:** Java 15
* **HackerRank Profile:** [Poornima R - HackerRank](https://www.hackerrank.com/profile/poornimaraju1278)
* **GitHub Repository:** [HackerRank-3rdSem-Algorithm-Portfolio](https://github.com/poornimaraju1278-stack/HackerRank-3rdSem-Algorithm-Portfolio)

---

## 1. Activity Overview

This portfolio contains solutions to five mandatory HackerRank algorithmic problems completed as part of Activity 12. The problems cover arrays, counting, sorting, searching, and greedy algorithms.

The solutions are implemented in **Java 15** and organized into separate folders for clarity and easy evaluation.

### Learning Objectives

* Develop algorithmic problem-solving skills.
* Apply sorting, searching, greedy techniques, and array-based strategies.
* Analyze algorithm efficiency using Big-O notation.
* Understand Time Complexity and Auxiliary Space Complexity.
* Maintain a clear and organized public GitHub repository.
* Demonstrate coding proficiency through accepted HackerRank submissions.

---

## 2. Repository Structure

```text
HackerRank-3rdSem-Algorithm-Portfolio/
│
├── README.md
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
└── 05-Mark-and-Toys/
    └── solution.java
```

---

# 3. Problem Solutions and Analysis

## Problem 1 — Mini-Max Sum

### Problem Summary

Given five positive integers, calculate the minimum and maximum values that can be obtained by summing exactly four of the five integers.

### Algorithm / Approach

The solution calculates the total sum of all elements while finding the minimum and maximum values. The minimum sum is obtained by excluding the maximum element, while the maximum sum is obtained by excluding the minimum element.

### Important Steps

1. Traverse the array once.
2. Calculate the total sum.
3. Find the minimum element.
4. Find the maximum element.
5. Calculate the minimum sum as total sum minus the maximum element.
6. Calculate the maximum sum as total sum minus the minimum element.

### Time Complexity

**O(N)**

### Auxiliary Space Complexity

**O(1)**

### Alternative Approach

The array can first be sorted and then the minimum and maximum sums can be calculated by excluding the largest or smallest element. However, sorting requires **O(N log N)** time, so the single-pass approach is more efficient.

### Why This Approach Is Efficient

The solution requires only one traversal and avoids unnecessary sorting. It achieves the required **O(N)** time complexity with constant auxiliary space.

### HackerRank Links

* **Original Challenge:** [Mini-Max Sum](https://www.hackerrank.com/challenges/mini-max-sum/problem)
* **Accepted Submission:** [View Accepted Submission](https://www.hackerrank.com/challenges/mini-max-sum/submissions/code/484328022)

---

## Problem 2 — Birthday Cake Candles

### Problem Summary

Given a list of candle heights, determine how many candles have the maximum height.

### Algorithm / Approach

The solution finds the maximum candle height and then counts how many elements are equal to that maximum value.

### Important Steps

1. Find the maximum candle height.
2. Traverse the list again.
3. Count every candle whose height equals the maximum.
4. Return the count.

### Time Complexity

**O(N)**

### Auxiliary Space Complexity

**O(1)**

### Alternative Approach

The candle heights could be sorted and the maximum value could then be identified and counted. However, sorting would require **O(N log N)** time, while finding and counting the maximum directly requires only **O(N)** time.

### Why This Approach Is Efficient

The solution avoids unnecessary sorting and uses linear traversal, resulting in the required **O(N)** time complexity.

### HackerRank Links

* **Original Challenge:** [Birthday Cake Candles](https://www.hackerrank.com/challenges/birthday-cake-candles/problem)
* **Accepted Submission:** [View Accepted Submission](https://www.hackerrank.com/challenges/birthday-cake-candles/submissions/code/484328213)

---

## Problem 3 — Insertion Sort Part 1

### Problem Summary

Insert the last element of an almost-sorted array into its correct position using the insertion sort technique. The array is printed after each shift and after the element is inserted.

### Algorithm / Approach

The last element is stored as the value to be inserted. Elements larger than this value are shifted one position to the right until the correct position is found.

### Important Steps

1. Store the last element.
2. Start comparing from the element immediately before it.
3. Shift larger elements one position to the right.
4. Continue until the correct position is found.
5. Insert the stored value into that position.
6. Print the array after each shift and after insertion.

### Time Complexity

**O(N)** for the single insertion operation required by this challenge.

### Auxiliary Space Complexity

**O(1)**

### Alternative Approach

A complete sorting algorithm such as selection sort or a library sorting method could be used. However, sorting the complete array performs unnecessary work because the challenge only requires inserting one element into an almost-sorted array.

### Why This Approach Is Efficient

The algorithm directly performs the required insertion operation, modifies the array in place, and uses constant auxiliary space.

### HackerRank Links

* **Original Challenge:** [Insertion Sort Part 1](https://www.hackerrank.com/challenges/insertionsort1/problem)
* **Accepted Submission:** [View Accepted Submission](https://www.hackerrank.com/challenges/insertionsort1/submissions/code/484328452)

---

## Problem 4 — Binary Search

### Problem Summary

Given a sorted array and a target value, find the index of the target using binary search.

For this activity, the **Intro to Tutorial Challenges** problem was used as the suitable HackerRank sorted-array binary search challenge.

### Algorithm / Approach

Two boundaries, `low` and `high`, represent the current search range. The middle element is calculated and compared with the target. Depending on the comparison, half of the search range is eliminated.

### Important Steps

1. Set `low` to the first index.
2. Set `high` to the last index.
3. Calculate the middle index.
4. Compare the middle element with the target.
5. Return the index if the target is found.
6. Search the right half if the target is greater.
7. Search the left half if the target is smaller.
8. Continue until the target is found or the search range becomes empty.

### Time Complexity

**O(log N)**

### Auxiliary Space Complexity

**O(1)**

### Alternative Approach

A linear search could check each element sequentially. However, linear search requires **O(N)** time in the worst case. Since the array is sorted, binary search provides a more efficient solution.

### Why This Approach Is Efficient

Binary search eliminates approximately half of the remaining search space after every comparison, resulting in **O(log N)** time complexity with constant auxiliary space.

### HackerRank Links

* **Original Challenge:** [Intro to Tutorial Challenges](https://www.hackerrank.com/challenges/tutorial-intro/problem)
* **Accepted Submission:** [View Accepted Submission](https://www.hackerrank.com/challenges/tutorial-intro/submissions/code/484328993)

---

## Problem 5 — Mark and Toys

### Problem Summary

Given the prices of toys and a fixed budget, determine the maximum number of toys that can be purchased without exceeding the available budget.

### Algorithm / Approach

The toy prices are sorted in ascending order. The cheapest toys are purchased first until the budget cannot accommodate another toy.

### Important Steps

1. Sort all toy prices in ascending order.
2. Start with a total cost of zero.
3. Traverse the sorted prices.
4. Add a toy if the total cost remains within the budget.
5. Stop when the next toy would exceed the budget.
6. Return the number of toys purchased.

### Time Complexity

**O(N log N)**

### Auxiliary Space Complexity

**O(1)** excluding the sorting implementation.

### Alternative Approach

A frequency/counting-based approach could be considered when the price range is small and bounded. However, for general input prices, sorting provides a simple and reliable solution without depending on assumptions about the price range.

### Why This Approach Is Efficient

Buying the cheapest toys first maximizes the number of toys that can be purchased within the budget. The sorting operation dominates the running time, resulting in **O(N log N)** complexity.

### HackerRank Links

* **Original Challenge:** [Mark and Toys](https://www.hackerrank.com/challenges/mark-and-toys/problem)
* **Accepted Submission:** [View Accepted Submission](https://www.hackerrank.com/challenges/mark-and-toys/submissions/code/484329118)

---

# 4. Complexity Summary

| No. | Problem               | Algorithm                 | Time Complexity | Auxiliary Space |
| --- | --------------------- | ------------------------- | --------------- | --------------- |
| 1   | Mini-Max Sum          | Linear Traversal          | O(N)            | O(1)            |
| 2   | Birthday Cake Candles | Maximum + Counting        | O(N)            | O(1)            |
| 3   | Insertion Sort Part 1 | Insertion / Shifting      | O(N)            | O(1)            |
| 4   | Binary Search         | Divide-and-Conquer Search | O(log N)        | O(1)            |
| 5   | Mark and Toys         | Greedy + Sorting          | O(N log N)      | O(1)*           |

*Auxiliary space shown excludes implementation-dependent memory used internally by the sorting method.

---

# 5. Evidence of Completion

All five required HackerRank problems were successfully completed and accepted using Java 15.

| No. | Problem                      | Status   | Evidence                                                                                                      |
| --- | ---------------------------- | -------- | ------------------------------------------------------------------------------------------------------------- |
| 1   | Mini-Max Sum                 | Accepted | [Accepted Submission](https://www.hackerrank.com/challenges/mini-max-sum/submissions/code/484328022)          |
| 2   | Birthday Cake Candles        | Accepted | [Accepted Submission](https://www.hackerrank.com/challenges/birthday-cake-candles/submissions/code/484328213) |
| 3   | Insertion Sort Part 1        | Accepted | [Accepted Submission](https://www.hackerrank.com/challenges/insertionsort1/submissions/code/484328452)        |
| 4   | Intro to Tutorial Challenges | Accepted | [Accepted Submission](https://www.hackerrank.com/challenges/tutorial-intro/submissions/code/484328993)        |
| 5   | Mark and Toys                | Accepted | [Accepted Submission](https://www.hackerrank.com/challenges/mark-and-toys/submissions/code/484329118)         |

Screenshots of the accepted HackerRank submissions are retained as evidence for the final Activity 12 submission.

### HackerRank Badge Evidence

Badge evidence is included **if earned**. The badge milestone is a portfolio goal and does not replace completion of the five required problems.

---

# 6. Learning Reflection

This activity helped me understand how different algorithmic techniques can be selected according to the structure of a problem. Mini-Max Sum and Birthday Cake Candles demonstrated how linear traversal can solve problems efficiently without unnecessary sorting. Insertion Sort Part 1 helped me understand element shifting and how an element can be

