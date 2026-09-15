class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int rows = mat.length;
        int cols = mat[0].length;

        // If number of elements is different, reshape is impossible
        if (rows * cols != r * c) {
            return mat;
        }

        int[][] answer = new int[r][c];

        int x = 0;
        int y = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                answer[x][y] = mat[i][j];

                y++;

                if (y == c) {
                    y = 0;
                    x++;
                }
            }
        }

        return answer;
    }
}