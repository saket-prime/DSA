class Solution {
  PriorityQueue<Integer> pq;
    public int kthSmallest(int[][] matrix, int k) {
      pq = new PriorityQueue<>(matrix.length, Comparator.reverseOrder());
      
      for(int[] arr : matrix){
        for(int i : arr){
          add(i, k);
        }
      }
      return pq.poll();  
    }

    public void add(int i, int k){

      if(pq.isEmpty() || pq.size() < k) pq.offer(i);
      else if(pq.peek() > i){
        pq.poll();
        pq.offer(i);
      }
        
    } 

}