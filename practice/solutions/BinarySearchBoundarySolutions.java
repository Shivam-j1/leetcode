public class BinarySearchBoundarySolutions {
    // Exercise 1: first true in a false-then-true boolean array.
    public static int firstTrue(boolean[] valid) {
        int lo = 0, hi = valid.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (valid[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    // Exercise 2: LeetCode 35 lower bound.
    public static int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] >= target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    // Exercise 3: two boundaries delimit the target's duplicate range.
    public static int[] searchRange(int[] nums, int target) {
        int first = lowerBound(nums, target);
        if (first == nums.length || nums[first] != target) {
            return new int[] {-1, -1};
        }
        int afterLast = upperBound(nums, target);
        return new int[] {first, afterLast - 1};
    }

    private static int lowerBound(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] >= target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    private static int upperBound(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    // Exercise 4: binary-search the first feasible speed.
    public static int minEatingSpeed(int[] piles, int h) {
        if (piles.length == 0) {
            return 0;
        }
        if (h < piles.length) {
            return -1;
        }

        int lo = 1, hi = 0;
        for (int pile : piles) {
            hi = Math.max(hi, pile);
        }

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (canFinish(piles, h, mid)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    private static boolean canFinish(int[] piles, int h, int speed) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + (long) speed - 1) / speed;
            if (hours > h) {
                return false;
            }
        }
        return true;
    }
}
