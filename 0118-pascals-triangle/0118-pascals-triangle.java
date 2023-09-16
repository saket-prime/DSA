class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        pascal.add(first);
        int i = 0;
        while(i < numRows - 1){
            int j = 0;
            int pre = 0;
            List<Integer> temp1 = pascal.get(i);
            List<Integer>temp = new ArrayList<>();
            while(j < temp1.size()){
                
                temp.add(pre+temp1.get(j));
                pre = temp1.get(j);

                if(j==temp1.size() - 1) temp.add(1);
                j++;
            }
            pascal.add(temp);
            i++;
        }
        return pascal;
    }
}