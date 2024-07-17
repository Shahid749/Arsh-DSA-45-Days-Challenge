// 26. Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0,j=i+1;
        int n=arr.length;
        while(j<n){
            if(arr[i]==arr[j]){
                j++;
            }
            else{
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
