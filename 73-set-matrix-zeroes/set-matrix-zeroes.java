class Solution {
    public void setZeroes(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        boolean firstr = false;
        boolean firstc = false;

        for (int j = 0; j < c; j++) {
            if (arr[0][j] == 0) {
                firstr = true;
                break;
            }
        }
        
        for (int i = 0; i < r; i++) {
            if (arr[i][0] == 0) {
                firstc = true;
                break;
            }
        }
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < r; i++) {
            if (arr[i][0] == 0) {
                for (int j = 1; j < c; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < c; j++) {
            if (arr[0][j] == 0) {
                for (int i = 1; i < r; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        if (firstr) {
            for (int j = 0; j < c; j++) {
                arr[0][j] = 0;
            }
        }
        if (firstc) {
            for (int i = 0; i < r; i++) {
                arr[i][0] = 0;
            }
        }
    }
}