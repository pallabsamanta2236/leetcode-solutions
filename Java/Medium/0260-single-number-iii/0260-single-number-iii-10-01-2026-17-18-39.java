class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map =new HashMap<>();
        int[] result = new int[2];

        for(int num :nums){
           map.put(num, map.getOrDefault(num, 0)+1);
        }

        int i =0;
        for(int num :map.keySet()){
            if(map.get(num) == 1){
                result[i++] = num;
            }
            
        }
        return result;
        
    }
}