// 283. Move Zeroes

class Solution {
    public void moveZeroes(int[] arr) {
        int i=0,j=i+1;
        while(j<arr.length){
            if(arr[i]==0 && arr[j]!=0){
                swap(arr,i,j);
                i++;
                j++;
            }
            else if(arr[i]==0 && arr[j]==0){
                j++;
            }
            else if(arr[i]!=0 && arr[j]==0){
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
    }
    public void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
