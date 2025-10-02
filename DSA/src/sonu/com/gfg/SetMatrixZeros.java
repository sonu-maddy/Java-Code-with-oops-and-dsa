package sonu.com.gfg;

public class SetMatrixZeros {
    public static void main(String[] args) {
      int  mat[][] = {{0, 1, 2, 0},
        {3, 4, 5, 2},
        {1, 3, 1, 5}};

      int n = mat.length-1;
      int m = mat[0].length-1;

      setzero(mat, n,m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                if(mat[i][j] == -1){
                    mat[i][j] =0;
                }
            }
        }
    }
    public static void setzero(int[][] mat, int n , int m){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if (mat[i][j] == 0){
                    markrow(mat,i,m);
                    markcol(mat,j,n);
                }
            }
        }
    }

    private static void markrow(int[][] mat, int j,int m) {
        for (int i = 0; i < m; i++) {
            if(mat[i][j] != 0){
                mat[i][j] = -1;
            }
        }
    }

    private static void markcol(int[][] mat, int i,int n) {
        for (int j = 0; j < n; i++) {
            if(mat[j][i] != 0){
                mat[j][i] = -1;
            }
        }
    }





    // optimal approach

//    public void setMatrixZeroes(int[][] mat) {
//        boolean firstrow = false, firstcol = false;
//
//        for(int i =0; i< mat.length;i++){
//            for(int j = 0; j< mat[0].length;j++){
//                if(mat[i][j] == 0){
//                    if(i == 0) firstrow = true;
//                    if(j == 0) firstcol = true;
//
//                    mat[0][j] =0;
//                    mat[i][0] =0;
//
//                }
//
//            }
//        }
//
//        for(int i =1; i<mat.length;i++){
//            for(int j = 1; j < mat[0].length;j++){
//                if(mat[i][0] == 0 || mat[0][j] == 0){
//                    mat[i][j] = 0;
//                }
//            }
//        }
//
//        if(firstrow){
//            for(int j = 0; j < mat[0].length;j++){
//                mat[0][j] = 0;
//            }
//        }
//
//        if(firstcol){
//            for(int i = 0; i < mat.length;i++){
//                mat[i][0] = 0;
//            }
//        }
//    }
}
