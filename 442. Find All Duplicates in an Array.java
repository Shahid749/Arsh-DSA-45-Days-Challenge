// 442. Find All Duplicates in an Array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> en: map.entrySet()){
            if(en.getValue()>1){
                list.add(en.getKey());
            }
        }
        return list;

    }
}
