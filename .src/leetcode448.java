import java.util.ArrayList;
import java.util.List;

class leetcode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        var list = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int num =  Math.abs(nums[i]);
            nums[num-1] = -Math.abs(nums[num-1]);
        }

        for(int i =0;i<nums.length;i++){
            if(nums[i]>0) list.add(i+1);
        }

        return list;
    }
}