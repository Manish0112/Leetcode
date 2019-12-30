class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s == null || t == null) {
            return false;
        }
        
        if(s.length() != t.length()){
            return false;
        }
        
        s=sortString(s);
        t=sortString(t);
        
        for(int i=0,j=0;i<s.length() ;i++,j++){
            if(!(s.charAt(i) == t.charAt(j)))
                return false;
        }
        
        return true;
    }
    
    public String sortString(String s){
        
        char tempArray[] = s.toCharArray(); 
          
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        return new String(tempArray);
    }
}