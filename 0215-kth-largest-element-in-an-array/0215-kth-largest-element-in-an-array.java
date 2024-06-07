class Solution {
  private PriorityQueue<Integer> pq;
    public int findKthLargest(int[] nums, int k) {

      pq = new PriorityQueue<>(k);

      for(int num : nums){
        add(num, k);
      }
      return pq.poll();
    }

    private void add(int val, int k){
      if(pq.isEmpty() || pq.size() < k){
        pq.offer(val);
      }
      else if(pq.peek() < val){
        pq.poll();
        pq.offer(val);
      }
    }

}