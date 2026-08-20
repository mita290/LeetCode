class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int left = 0, top = 0, right = arr[0].length - 1, bottom = arr.length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                al.add(arr[top][i]);
            }
            top++;
            
            for (int i = top; i <= bottom; i++) {
                al.add(arr[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    al.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    al.add(arr[i][left]);
                }
                left++;
            }
        }
        return al;
    }
}