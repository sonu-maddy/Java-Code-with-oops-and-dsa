package sonu.com;

public class  Basic_oops {
    public static void main(String[] args) {

        // data of 5 student :(roll, name, mark)

//        int[] rno = new int[5];
//        String[] name=new String[5];
//        float[] mark= new float[5];

        //Student[] st = new Student[5];

        Student st = new Student();
      //  System.out.println(st); some random num.
//        System.out.println(st.rno); 0
//        System.out.println(st.name); null
//        System.out.println(st.marks); 0.0


        st.rno=12;
        st.name ="sonu";
        st.marks=23.43f;

         System.out.println(st.rno);
         System.out.println(st.name);
         System.out.println(st.marks);

    }
}

// create a  class
// class - logical construct
// object - physical reality , occuyping some space in memory


class Student{
//    int[] rno = new int[5];
//    String[] name=new String[5];
//    float[] mark= new float[5];

    int rno;
    String name;
    float marks;

    //float marks = 90;
}

