class Solution {
    public int singleNumber(int[] nums) {
        int n  = nums.length;
        HashMap<Integer,Integer> hset = new HashMap<>();
        for(int num : nums){
            //hashmap aa konsa number kitne bar ayya hai ....
           //hashmap( num, kitne bar(default 0 nahi to 1plus har bar)) 
            hset.put(num, hset.getOrDefault(num , 0)+1);
        }
        ///konsa set me kitna bar hai.... like 2ya 5 like that 
        for(int num : hset.keySet()){
            ///jo num 1 bar avalible hai ooo return karo
            if(hset.get(num)== 1)
            {
                return num;
            }
        }
        return -1;

    }
}