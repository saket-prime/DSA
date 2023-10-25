class Solution {
    public int climbStairs(int n) {
      return fib(n, new HashMap<>());
    }

    public int fib(int n, Map<Integer, Integer> cache){
      if(cache.containsKey(n)) return cache.get(n); 
      int result = 0;
      if(n <= 1) result = 1;
      else{
        result = fib(n-1, cache) + fib(n-2, cache);
      }
      cache.put(n, result);
      return result;
    }
}