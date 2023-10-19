class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsetTwo = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(subsetTwo, new ArrayList<>(), nums, 0);
        return subsetTwo;
    }

    public void backTrack( List<List<Integer>> subsetTwo, List<Integer> tempSet, int[] nums, int start ){

      if(!subsetTwo.contains(tempSet)) subsetTwo.add(new ArrayList<>(tempSet));
      for(int i = start; i < nums.length; i++){
        tempSet.add(nums[i]);
        backTrack(subsetTwo, tempSet, nums, i+1 );
        tempSet.remove(tempSet.size() - 1);
      }

    }

}