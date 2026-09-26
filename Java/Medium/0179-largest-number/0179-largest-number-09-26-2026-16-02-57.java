class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] St = new String[n];
        for(int i =0; i< n; i++){
            St[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(St, (a,b) -> (b+a).compareTo(a+b));

        if(St[0].equals ("0")){
            return "0";
        }

        String Maxnum = "";
        for(int i =0; i<St.length; i++){
            Maxnum += St[i];
        }

        return Maxnum;



    }
}