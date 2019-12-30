class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int item:nums){
            map.put(item, (map.getOrDefault(item, 0)+1));
        }
        
        for (Map.Entry mapElement : map.entrySet()) { 
            if((int)mapElement.getValue() == 1){
                return (int)mapElement.getKey();
            }
        }
        
        return 0;
    }
}