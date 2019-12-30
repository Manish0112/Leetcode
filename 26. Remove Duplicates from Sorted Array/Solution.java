class Solution {
    public int removeDuplicates(int[] nums) {
        
        int len=nums.length; 
        for(int i=0;i<len;i++){

            if(i!=len-1 && nums[i]==nums[i+1]){
                
                for(int j=i;j<len-1;j++){
                    
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }   
                
                len--;
                i--;
            }
        }
        
        return len;
    }
}
