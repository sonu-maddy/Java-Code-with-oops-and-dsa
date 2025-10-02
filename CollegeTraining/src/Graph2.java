public class Graph2 {
    public static class  graph{
        int node;
        int edge;
        char[][] matrix;

        graph(int n ){
            this.node  = n;
            matrix = new char[n][n];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        void add(char s, char d){
            matrix[s][d] = 1;
        }

        void show(){
            for (int i = 0; i < matrix.length ; i++) {
                for (int j = 0; j < matrix[0].length ; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        graph g = new graph(6);

       // g.add(a,b);
    }
}
