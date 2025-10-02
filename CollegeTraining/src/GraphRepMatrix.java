public class GraphRepMatrix {

//    public  static class graph{
//        int node;
//        int edge;
//        int[][] matrix;
//
//        graph(int n) {
//            this.node = n;
//           matrix =  new int[node][node];
//
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[0].length; j++) {
//                    matrix[i][j] = 0;
//                }
//            }
//
//
//        }
//
//        void add(int source, int destination){
//            matrix[source][destination] = 1;
//            matrix[destination][source] = 1;
//        }
//
//        void show(){
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[0].length; j++) {
//                    System.out.print(matrix[i][j] + " ");
//                }
//                System.out.println();
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//
//        graph gr = new graph(4);
//
//        gr.add(0,1);
//        gr.add(1,2);
//        gr.add(2,3);
//        gr.add(3,0);
//
//        gr.show();
//
//
//    }


//    public  static class graph{
//        int node;
//        int edge;
//        int[][] matrix;
//
//        graph(int n) {
//            this.node = n;
//            matrix =  new int[node][node];
//
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[0].length; j++) {
//                    matrix[i][j] = 0;
//                }
//            }
//
//
//        }
//
//        void add(int source, int destination){
//            matrix[source][destination] = 1;
//            matrix[destination][source] = 1;
//        }
//
//        void show(){
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[0].length; j++) {
//                    System.out.print(matrix[i][j] + " ");
//                }
//                System.out.println();
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//
//        graph gr = new graph(6);
//
//        gr.add(0,1);
//        gr.add(1,2);
//        gr.add(1,3);
//        gr.add(3,5);
//        gr.add(3,4);
//        gr.add(2,4);
//
//        gr.show();
//
//
//    }



    // with edge and weight
    public  static class graph{
        int node;
        int edge;
        int[][] matrix;

        graph(int n) {
            this.node = n;
            matrix =  new int[node][node];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }


        }

        void add(int source, int destination , int weight){
            matrix[source][destination] = weight;
        }

        void show(){
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {


        graph gr = new graph(6);

        gr.add(0,1,15);
        gr.add(1,2,7);
        gr.add(1,3,23);
        gr.add(3,5,23);
        gr.add(3,4,10);
        gr.add(2,4,17);

        gr.show();


    }

}