// 48. Rotate Image
class Solution {
    public void rotate(int[][] matrix) {
        int n =matrix.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                swap(matrix,i,j);
            }
        }

        for(int i=0;i<n;i++){
            int left=0,right=n-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
    }
    public void swap(int matrix[][], int i, int j){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
}
