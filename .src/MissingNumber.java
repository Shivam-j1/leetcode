import java.util.HashSet;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        var set = new HashSet<Integer>(); // sapce : o(n)
        //add in hasht o(n)
        for(int i =0;i<nums.length;i++)
            set.add(nums[i]);

        //search in hashset o(n)
        for(int i =0;i<=nums.length;i++){
            if(!set.contains(i)) return i;
        }

        return -1;
    }
}
