class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] helper = new int[m][n];

        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                helper[i][j] = matrix[i][j];
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (helper[i][j] == 0){
                    for (int row = 0; row < m; row++) {
                        matrix[row][j] = 0;
                    }
                    for (int col = 0; col < n; col++) {
                        matrix[i][col] = 0;                       
                    }
                }
            }
        }
    }
}