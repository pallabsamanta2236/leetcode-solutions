class Solution {
    public int trap(int[] height) {
        int water = 0;

        int[] leftmaxes = new int [height.length];
        leftmaxes[0]= height[0];

        int[] rightmaxes = new int [height.length];
        rightmaxes[height.length-1] = height[height.length-1];

        for(int i = 1; i<height.length; i++){
            leftmaxes[i] = Math.max(height[i], leftmaxes[i - 1]);
        }
        for(int i = height.length-2; i >= 0;i--){
            rightmaxes[i] = Math.max(height[i], rightmaxes[i+1]);
        }

        for(int i = 1; i< height.length-1; i++){
            water = water + Math.min(leftmaxes[i], rightmaxes[i]) - height[i];
        }

        return water;
    }
}