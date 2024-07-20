//  18. 4Sum


class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i-1]==arr[i]){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int k=j+1;
                int l=arr.length-1;
                while(k<l){
                    long sum=(long)arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum==target){
                        List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                        ans.add(temp);
                        l--;
                        k++;
                        while(k<l && arr[k]==arr[k-1]) k++;
                        while(k<l && arr[l]==arr[l+1]) l--;
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}
