class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        
        // for (int i = 0; i < nums.length-1; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             // return new int[]{i, j};
        //             int[] a={i,j};
        //             return a;
        //         }
        //     }
        // }
        // // return new int[]{}; // No solution found
        // return null;   

        // Hashing
        HashMap<Integer,Integer> map=new HashMap<>(); 
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int more = target-num;
            if(map.containsKey(more)){
                 int [] arr = {map.get(more),i};
                return arr;
            }
 map.put(nums[i],i);
        }
        return null;

        }
}
