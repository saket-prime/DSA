class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> listOfSubsets = new ArrayList<>();
        backTrack(listOfSubsets, nums, new ArrayList<>(), 0);
        return listOfSubsets;
        
    }

    public void backTrack(List<List<Integer>> subsetList, int[] nums, List<Integer> tempSet, int start){

        subsetList.add(new ArrayList<>(tempSet));

        for(int i = start; i < nums.length; i++){

          tempSet.add(nums[i]);
          backTrack(subsetList, nums, tempSet, i+1);
          tempSet.remove(tempSet.size() - 1);

        }
    }
}