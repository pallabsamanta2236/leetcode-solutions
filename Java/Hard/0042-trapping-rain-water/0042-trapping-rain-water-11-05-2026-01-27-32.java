class Solution {
    public int trap(int[] height) {
        
        int water = 0;

        for(int i = 1; i< height.length-1; i++){
            int curr = height[i];
            int leftmax = curr;
            int rightmax = curr;
            for(int j = i-1; j >= 0; j--){
                leftmax = Math.max(leftmax,height[j]);
            }
            for(int j = i+1; j< height.length; j++){
                rightmax = Math.max(rightmax, height[j]);
                if(rightmax >= leftmax){
                    break;
                }
            }

            water = water + Math.min(leftmax, rightmax) -curr;
        }
        return water;
    }
}