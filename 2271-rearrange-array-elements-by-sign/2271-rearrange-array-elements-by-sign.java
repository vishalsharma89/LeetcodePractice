class Solution {
    public int[] rearrangeArray(int[] nums) {
          // Write your code here.

        int n= nums.length;
        int[] ans = new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                ans[neg]=nums[i];
                neg+=2;
            }
            else{
                ans[pos]=nums[i];
                pos+=2;
            }
        }
        return ans;
        // int[] pos = new int[n/2];
        // ArrayList<Integer> pos = new ArrayList<>();
        // // int[] neg = new int[n/2];
        // ArrayList<Integer> neg = new ArrayList<>();
        
        // for(int i=0;i<n;i++){
        //     if(nums[i]<0){
        //         neg.add(nums[i]);
        //     }else{
        //         pos.add(nums[i]);
        //     }
        // }

        // // Put positive on even and negative on odd
        // for(int i=0;i<n/2;i++){
        //     nums[2*i]=pos.get(i);
        //     nums[(2*i)+1] = neg.get(i);
        // }

        // return nums;
    }
}