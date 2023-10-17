class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> possibles = new ArrayList<>();
        backTrack(possibles, new ArrayList<>(), nums);
        return possibles;
    }

    public void backTrack(List<List<Integer>> possibles, List<Integer> tempSet, int[] nums){

      for(int i = 0; i < nums.length; i++){
        if(!tempSet.contains(nums[i]))tempSet.add(nums[i]);
        else continue;
        if(tempSet.size() < nums.length)backTrack(possibles, tempSet, nums);
        if(tempSet.size() == nums.length) possibles.add(new ArrayList<>(tempSet));
        tempSet.remove(tempSet.size() -1);
      }

    }
}