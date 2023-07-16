class Solution {
    public int[] twoSum(int[] numbers, int target) {

      int first = 0;
      int last = numbers.length - 1;
      int sum = Integer.MIN_VALUE;
       

      while(sum != target){

        sum = numbers[first] + numbers[last];

        if(sum < target) first++;
        else if (sum > target) last--;
        else {
          int[] result1 = {first+1, last+1};
          System.gc();
          return result1;
        }; 
      }
      return new int[2];

    }
}