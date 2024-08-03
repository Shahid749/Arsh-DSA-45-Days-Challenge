// Chocolate Distribution Problem

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        long ans=Long.MAX_VALUE;
        Collections.sort(a);
        
        int i=0, j=m-1;
        while(j<n){
            long diff=(long)a.get(j)-a.get(i);
            ans=Math.min(ans,diff);
            i++;
            j++;
        }
        return ans;
    }
}
