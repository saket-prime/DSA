class Solution {
    public Stack<int[]> zeroesInMatrix (int[][] matrix){
        Stack<int[]> zeroes = new Stack<>();
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == 0) {
                    int[] temp = {i,j};
                    zeroes.push(temp);
                }
            }
        }
        return zeroes;
    }
    public void setZeroes(int[][] matrix) {
        Stack<int[]> zeroes = zeroesInMatrix(matrix);
        while(!zeroes.empty()){
            int[] temp = zeroes.pop();
            for(int i = 0; i< matrix.length; i++){
                matrix[i][temp[1]]= 0;
            }
            for(int j =0; j< matrix[0].length;j++){
                matrix[temp[0]][j] = 0;
            }
        }

    }
}