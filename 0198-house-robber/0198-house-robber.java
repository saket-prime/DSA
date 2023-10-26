class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];

        for(int i = 2; i < nums.length; i++){
          if(i == 0 || i == 1) continue;
          else if(i == 2) nums[i] = nums[i] + nums[i - 2];
          else{
            nums[i] = nums [i] + Math.max(nums[i - 2], nums[i - 3]);
          }
        }
        return Math.max(nums[nums.length - 1], nums[nums.length - 2]);
    }
}