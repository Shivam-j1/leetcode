import java.util.Arrays;

public class BinarySearchBoundaryTest {
    private static int checks = 0;

    public static void main(String[] args) {
        check(2, BinarySearchBoundaryAttempt.firstTrue(new boolean[] {false, false, true, true}), "first true in middle");
        check(0, BinarySearchBoundaryAttempt.firstTrue(new boolean[] {true, true}), "first value true");
        check(2, BinarySearchBoundaryAttempt.firstTrue(new boolean[] {false, false}), "no true value");
        check(0, BinarySearchBoundaryAttempt.firstTrue(new boolean[] {}), "empty boolean array");

        check(2, BinarySearchBoundaryAttempt.searchInsert(new int[] {1, 3, 5, 6}, 5), "search insert found");
        check(1, BinarySearchBoundaryAttempt.searchInsert(new int[] {1, 3, 5, 6}, 2), "search insert middle gap");
        check(4, BinarySearchBoundaryAttempt.searchInsert(new int[] {1, 3, 5, 6}, 7), "search insert after end");
        check(0, BinarySearchBoundaryAttempt.searchInsert(new int[] {1, 3, 5, 6}, 0), "search insert before start");
        check(0, BinarySearchBoundaryAttempt.searchInsert(new int[] {}, 4), "search insert empty");

        checkArray(new int[] {3, 4}, BinarySearchBoundaryAttempt.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8), "range duplicates");
        checkArray(new int[] {-1, -1}, BinarySearchBoundaryAttempt.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 6), "range absent");
        checkArray(new int[] {0, 2}, BinarySearchBoundaryAttempt.searchRange(new int[] {2, 2, 2}, 2), "range all duplicates");
        checkArray(new int[] {0, 0}, BinarySearchBoundaryAttempt.searchRange(new int[] {2}, 2), "range singleton");
        checkArray(new int[] {-1, -1}, BinarySearchBoundaryAttempt.searchRange(new int[] {}, 0), "range empty");

        check(4, BinarySearchBoundaryAttempt.minEatingSpeed(new int[] {3, 6, 7, 11}, 8), "minimum speed example 1");
        check(30, BinarySearchBoundaryAttempt.minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 5), "minimum speed tight hours");
        check(23, BinarySearchBoundaryAttempt.minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 6), "minimum speed example 2");
        check(1, BinarySearchBoundaryAttempt.minEatingSpeed(new int[] {1, 1, 1}, 3), "minimum speed lower bound");
        check(-1, BinarySearchBoundaryAttempt.minEatingSpeed(new int[] {3, 6, 7}, 2), "minimum speed impossible");

        System.out.println("Passed " + checks + " checks.");
    }

    private static void check(int expected, int actual, String label) {
        checks++;
        if (expected != actual) {
            throw new AssertionError(label + ": expected " + expected + ", got " + actual);
        }
    }

    private static void checkArray(int[] expected, int[] actual, String label) {
        checks++;
        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError(label + ": expected " + Arrays.toString(expected)
                    + ", got " + Arrays.toString(actual));
        }
    }
}
