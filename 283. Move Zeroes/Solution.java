class Solution {
    public void moveZeroes(int[] nums) {
        
        List<Integer> set=new ArrayList<Integer>();
        
        int ctr=0;
        for(int i:nums){
            if(i == 0){
                ctr++;
            }
            else{
                set.add(i);   
            }
        }
        
        for(int i=0;i<ctr;i++){
            set.add(0);
        }
        
        int index=0;
        for(int i:set){
            nums[index++]=i;
        }
        
    }
}