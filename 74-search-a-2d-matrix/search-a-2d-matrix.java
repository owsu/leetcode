class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int left = 0;
        int row = 0;
        while (row < matrix.length && matrix[row][matrix[row].length - 1] < target) { // insta skip invalid rows
            row++;
        }

        if (row == matrix.length) {return false;} // target just too big
        int right = matrix[row].length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (matrix[row][mid] < target) {
                left = mid + 1;
            } else if (matrix[row][mid] > target) {
                right = mid - 1;
            } else {
                return true;
            }
        }


        return false;
    }
}
