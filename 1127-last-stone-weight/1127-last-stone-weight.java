class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) return stones[0];
        PriorityQueue<Integer> stoneWeight = decreasePq(stones);
        while(stoneWeight.size() > 1){
          int y = stoneWeight.poll();
          int x = stoneWeight.poll();
          int z = y - x;
          if(z != 0) stoneWeight.offer(z);
        }
        return stoneWeight.isEmpty() ? 0 : stoneWeight.poll();

    }

    public PriorityQueue<Integer> decreasePq(int[] stones){
      PriorityQueue<Integer> stoneWeight = new PriorityQueue<>(Comparator.reverseOrder());
        for(int stone : stones){
          stoneWeight.offer(stone);
        }
        return stoneWeight;
    }
}