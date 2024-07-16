// 75. Sort Colors

class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            }
            else if(nums[i]==1){
                oneCount++;
            }
            else{
                twoCount++;
            }
        }
        for(int i=0;i<zeroCount;i++){
            nums[i]=0;
        }
        for(int i=zeroCount;i<oneCount+zeroCount;i++){
            nums[i]=1;
        }
        for(int i=oneCount+zeroCount;i<n;i++){
            nums[i]=2;
        }
    }
}
