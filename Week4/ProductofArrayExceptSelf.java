package Week4;
public class ProductofArrayExceptSelf{
    public int[] productExceptSelf(int[] nums) {
        int numsLength=nums.length;
        int[] outputArray = new int[numsLength];
        outputArray[0]=1;
        for(int i=1;i<numsLength;i++){
            outputArray[i]=nums[i-1]*outputArray[i-1];
        }
        int right=1;
        for(int i=numsLength-1;i>=0;i--){
            outputArray[i]=outputArray[i]*right;
            right*=nums[i];
        }
        return outputArray;
    }
}