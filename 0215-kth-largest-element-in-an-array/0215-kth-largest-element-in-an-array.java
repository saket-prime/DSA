class Solution {
    public int findKthLargest(int[] nums, int k) {
        int res = 20001;
        int[] v = new int[20001];
        for(int i : nums) v[i + 10000]++;
        do k -= v[--res]; while(k > 0);
        return res - 10000;
    }
}