package Week2;

public class MaximumSubarray {
    public  int maxSubArray(int[] nums) {
        int currentSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(maxSum,currentSum);
            if(currentSum<0) currentSum=0;
        }
        return maxSum;
    }
}
