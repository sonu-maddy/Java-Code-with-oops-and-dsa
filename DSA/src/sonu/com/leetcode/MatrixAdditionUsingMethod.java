package sonu.com.leetcode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Matrix{
    // 2d array for matrix and row and cols.
    int arr[] [];
    int r,c;
    //initialize r,c and allot memory for array.
    Matrix(int r, int c){
        this.r=r;
        this.c=c;

        arr =new int [r][c];
    }

    // accept 2d array from keyboard and return its.
    int[][] getMatrix() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // stringtokenizer is useful to accept each row a single string and then
        // devide it into tokens. each token represent an array element.
        StringTokenizer st;

        for (int i = 0; i <r ; i++) {
            String s = br.readLine();
            st = new StringTokenizer(s," ");
            for (int j = 0; j <c ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return arr;
    }

    // accept two 2d array and find sum matrix and return it.
    int [][] findsum(int a[][], int b[][]){
        int temp[][] =new int[r][c];

        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                temp[i][j] = a[i][j] + b[i][j];
            }
        }
        return temp;
    }

    // display the resultant 2d array as a matrix.

    void displayMatrix(int res[][]){
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

public class MatrixAdditionUsingMethod {
    public static void main(String[] args) throws IOException {
        // creat object to matrix class, since each obj.
        // contains an array.
        Matrix obj1 = new Matrix(3,3);
        Matrix obj2 = new Matrix(3,3);

        // take 3 reference for 2d array.
        int x [][], y[][],z[][];
        System.out.println("\n Enter element for first matrix: ");
        x = obj1.getMatrix();

        System.out.println("\n Enter element for Second matrix: ");
        y = obj2.getMatrix();

        System.out.println("\n Enter element for sum matrix: ");
        z = obj1.findsum(x,y);

        System.out.println("\n the sum matrix is: ");
        obj2.displayMatrix(z);

    }
}
