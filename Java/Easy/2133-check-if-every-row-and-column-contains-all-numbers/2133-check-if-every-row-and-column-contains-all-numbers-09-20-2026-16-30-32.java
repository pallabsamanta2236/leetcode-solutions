class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {

            int[] rowFreq = new int[n + 1];
            int[] colFreq = new int[n + 1];

            for (int j = 0; j < n; j++) {

                // Check row
                if (++rowFreq[matrix[i][j]] > 1) {
                    return false;
                }

                // Check column
                if (++colFreq[matrix[j][i]] > 1) {
                    return false;
                }
            }
        }

        return true;
    }
}