// Product array puzzle
class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        int n=nums.length;
        long ans[]=new long[n];
        for(int i=0;i<n;i++){
            long temp=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    temp*=nums[j];
                }
            }
            ans[i]=temp;
        }
        return ans;
    }
}
