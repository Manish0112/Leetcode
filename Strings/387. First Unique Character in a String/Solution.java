class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        
        for(int i=0;i<s.length();i++){
            char curr_val=s.charAt(i);
            map.put(curr_val,(map.getOrDefault(curr_val,0)+1));
        }
        
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1)
                return i;
        }
        
        return -1;
    }
}