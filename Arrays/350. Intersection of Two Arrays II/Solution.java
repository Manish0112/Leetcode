class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, cnt = 0;
        int[] intersect = new int[nums1.length<nums2.length?nums1.length:nums2.length];
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                intersect[cnt++] = nums1[i];
                i++;
                j++;
            }
        }
        int[] output = new int[cnt];
        for(int k = 0;k < cnt;k++){
            output[k] = intersect[k];
        }
        return output;
    }
}