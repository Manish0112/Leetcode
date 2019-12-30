class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry=0;
        
        for(int i=digits.length-1;i>=0;i--){
            
            int temp=digits[i];
            if(++temp>9){
                temp=0;
                carry = 1;
            }else{
                carry=0;
            }
            
            digits[i]=temp;
            
            if(carry == 0 ){
                break;
            }
        }
        
        if(carry == 1){
            
            int[] result = new int[digits.length+1];
            result[0]=1;
            int index=1;
            for(int i:digits){
                result[index++]=i;
            }
            return result;
        }
        
        return digits;
    }
}