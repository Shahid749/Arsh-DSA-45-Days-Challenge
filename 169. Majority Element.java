// 169. Majority Element
class Solution {
    public int majorityElement(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int m=nums.length;
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);

        }
        for(Map.Entry<Integer,Integer> en:map.entrySet()){
            if(en.getValue()>m/2){
                ans=en.getKey();
            }
        }
        return ans;
    }
}
