class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] ans = new int[n];
        int i=0, j =0, k=0;
        while(i< nums1.length){
            ans[k++]= nums1[i++];
        }
        while(j < nums2. length){
            ans[k++]= nums2[j++];
        }
        Arrays.sort(ans);
        if(n% 2 ==0){
            return (ans[n/2]+ ans[n/2 -1]) / 2.0;
        }else{
            return ans[n/2];
        }


        
    }
}