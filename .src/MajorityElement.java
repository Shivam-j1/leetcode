public class MajorityElement {
    public int majorityElement(int[] nums) {
        //solving using boyre moore majority vote algo
        int candidate = nums[0];
        int count = 0;

        for(int num :nums){
            if(num == candidate) count++;
            else if(count==0){
                candidate = num;
                count=1;
            }
            else count--;
        }

        return candidate;
    }
}
