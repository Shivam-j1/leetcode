# LeetCode Solutions

A growing collection of Java solutions and reusable notes for practicing data structures and algorithms. The index below covers the solution files currently in this repository.

## Solution Index

| Problem | Pattern / technique | Java solution |
|---|---|---|
| [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Same-direction read/write pointers; in-place compaction | [RemoveDuplicates.java](.src/RemoveDuplicates.java) |
| [27. Remove Element](https://leetcode.com/problems/remove-element/) | Opposite-direction pointers; swap unwanted values toward the end | [RemoveElements.java](.src/RemoveElements.java) |
| [75. Sort Colors](https://leetcode.com/problems/sort-colors/) | Dutch National Flag; three-way partition with three pointers | [SortColors.java](.src/SortColors.java) |
| [169. Majority Element](https://leetcode.com/problems/majority-element/) | Boyer–Moore majority vote; candidate cancellation | [MajorityElement.java](.src/MajorityElement.java) |
| [189. Rotate Array](https://leetcode.com/problems/rotate-array/) | Reversal algorithm; in-place swaps with two pointers | [RotateArray.java](.src/RotateArray.java) |
| [238. Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | Prefix and suffix accumulation in two passes | [Leetcode238.java](.src/Leetcode238.java) |
| [268. Missing Number](https://leetcode.com/problems/missing-number/) | HashSet membership lookup | [MissingNumber.java](.src/MissingNumber.java) |
| [283. Move Zeroes](https://leetcode.com/problems/move-zeroes/) | Same-direction read/write pointers; stable in-place partition by swapping | [MoveZeroes.java](.src/MoveZeroes.java) |
| [344. Reverse String](https://leetcode.com/problems/reverse-string/) | Opposite-direction two pointers; in-place reversal | [ReverseString.java](.src/ReverseString.java) |
| [448. Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/) | In-place index marking with signs | [leetcode448.java](.src/leetcode448.java) |

## Pattern Notes

- [Prefix Suffix Accumulation](text/Prefix%20Suffix%20Accumulation.txt) — recognizing prefix/suffix problems and building results with directional passes.
- [Two Pointers (Same direction)](text/Two%20Pointers%20%28Same%20direction%29.txt) — read/write pointer patterns for scanning and in-place array updates.

## Repository Layout

- `.src/` — Java solution files
- `text/` — reusable pattern notes
- `.idea/` — IDE project configuration
