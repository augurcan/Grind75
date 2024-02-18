package Week1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum{
    public int [] twoSum(int[] nums, int target){
        Map<Integer,Integer> numberMap= new HashMap<>();
        int length=nums.length;
        for (int i=0;i<length;i++){
            int complement=target-nums[i];
            if(numberMap.containsKey(complement))
                return new int[]{numberMap.get(complement),i};
            numberMap.put(nums[i],i);
        }
        return new int[]{};
    }
}