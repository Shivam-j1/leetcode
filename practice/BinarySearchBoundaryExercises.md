# Binary Search Boundary Practice

Use the idea from [Binary Search - Boundary Pattern](../text/Binary%20Search%20-%20Boundary%20Pattern.txt): maintain a range that still contains the first valid position, then move one boundary per iteration. Try each exercise before opening the separate [solutions file](solutions/BinarySearchBoundarySolutions.java).

## How to practice

1. Implement each method in the starter file [BinarySearchBoundaryAttempt.java](BinarySearchBoundaryAttempt.java) in exercise order.
2. For each loop, state what `lo` and `hi` mean and whether the interval is closed or half-open.
3. Trace one example by hand, especially when `mid` is already valid.
4. Run the [Java test harness](BinarySearchBoundaryTest.java) after you attempt the methods. It runs against the starter file; each unimplemented method fails visibly, so you can work through the tests before opening the answer key.

From the repository root, compile and run with:

```sh
javac practice/BinarySearchBoundaryAttempt.java practice/BinarySearchBoundaryTest.java
java -cp practice BinarySearchBoundaryTest
```

On Windows Command Prompt, use `;` instead of `:` in the classpath.

## Exercise 1 — Find the first true value

Implement `firstTrue(boolean[] valid)`. The array is sorted as zero or more `false` values followed by zero or more `true` values. Return the first true index, or `valid.length` if every value is false. The empty array is valid.

| Input | Expected |
|---|---:|
| `[false, false, true, true]` | `2` |
| `[true, true]` | `0` |
| `[false, false]` | `2` |
| `[]` | `0` |

**Hint:** The answer may be the position just after the last element. Use a half-open search range `[lo, hi)`; when `mid` is valid, keep it as a possible answer by moving `hi` to `mid`.

## Exercise 2 — LeetCode 35: Search Insert Position

Implement `searchInsert(int[] nums, int target)`. Given a sorted array with distinct values, return the target's index or the index where it should be inserted to preserve order.

| Input | Expected |
|---|---:|
| `nums=[1,3,5,6], target=5` | `2` |
| `nums=[1,3,5,6], target=2` | `1` |
| `nums=[1,3,5,6], target=7` | `4` |
| `nums=[1,3,5,6], target=0` | `0` |
| `nums=[], target=4` | `0` |

**Hint:** The insertion point is the first index whose value is `>= target`. This is a lower bound; returning the final `lo` also handles targets larger than every element.

## Exercise 3 — LeetCode 34: Find First and Last Position

Implement `searchRange(int[] nums, int target)`. Return `[firstIndex, lastIndex]`, or `[-1,-1]` when the target is absent.

| Input | Expected |
|---|---|
| `nums=[5,7,7,8,8,10], target=8` | `[3,4]` |
| `nums=[5,7,7,8,8,10], target=6` | `[-1,-1]` |
| `nums=[2,2,2], target=2` | `[0,2]` |
| `nums=[2], target=2` | `[0,0]` |
| `nums=[], target=0` | `[-1,-1]` |

**Hint:** An ordinary binary search can stop at any duplicate. Find the first value `>= target`, then the first value `> target`; the latter boundary is one past the last match.

## Exercise 4 — LeetCode 875: Koko Eating Bananas

Implement `minEatingSpeed(int[] piles, int h)`. Return the smallest positive integer speed that lets Koko finish all piles within `h` hours. At speed `k`, a pile of size `p` takes `ceil(p/k)` hours. Assume piles are positive; return `-1` if `h < piles.length`.

| Input | Expected |
|---|---:|
| `piles=[3,6,7,11], h=8` | `4` |
| `piles=[30,11,23,4,20], h=5` | `30` |
| `piles=[30,11,23,4,20], h=6` | `23` |
| `piles=[1,1,1], h=3` | `1` |
| `piles=[3,6,7], h=2` | `-1` |

**Hint:** Ask whether a speed is feasible. If speed `k` works, every larger speed works too, so feasibility is false then true. Binary-search the speed range for its first true value. Use long arithmetic when summing hours to avoid overflow.

## Before checking the answers

For each problem, confirm why the loop stops, what the returned boundary represents, and how empty input or no-match cases are handled. Then compare against the separately stored [solutions](solutions/BinarySearchBoundarySolutions.java).
