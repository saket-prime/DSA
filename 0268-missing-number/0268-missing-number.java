class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        HashSet<Integer> lengthOfNumbers = new HashSet<>();
        for(int i = 0; i <= nums.length ; i++){
            lengthOfNumbers.add(i);
        }
        for(int i = 0; i < nums.length; i++){
            lengthOfNumbers.remove(nums[i]);
        }
        for(int element : lengthOfNumbers){
            return element;
        }
        return 0;
    }
}