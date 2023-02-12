/*Link to problem: https://leetcode.com/problems/spiral-matrix/description/*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int startColumn = 0, startRow = 0, endColumn = matrix[0].length - 1, endRow = matrix.length - 1;
        while (startRow <= endRow && startColumn <= endColumn) {
            //top
            for (int j = startColumn; j <= endColumn; j++) {
//                System.out.print(matrix[startRow][j] + " ");
                result.add(matrix[startRow][j]);
            }
            //right
            for (int i = startRow + 1; i <= endRow; i++) {
                //  System.out.print(matrix[i][endColumn] + " ");
                result.add(matrix[i][endColumn]);
            }
            //bottom
            for (int j = endColumn - 1; j >= startColumn; j--) {

                if (startRow == endRow) {
                    break;
                }
                //   System.out.print(matrix[endRow][j] + " ");
                result.add(matrix[endRow][j]);
            }

            //left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startColumn == endColumn) {
                    break;
                }
                //  System.out.print(matrix[i][startColumn] + " ");
                result.add(matrix[i][startColumn]);

            }
            startRow++;
            startColumn++;
            endRow--;
            endColumn--;

        }
        return result;
    }
}
