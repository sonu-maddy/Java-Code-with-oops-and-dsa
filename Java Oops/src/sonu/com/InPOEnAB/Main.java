package sonu.com.InPOEnAB;

//inheritance box example
public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(); -1 -1 -1

      //  Box box1 = new Box(4); 4 4 4
        Box box1 = new Box(3.1,4.2,2.5);

        Box box2 = new Box(box1);

        System.out.println(box1.l + " " + box1.h + " " + box1.w);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);





        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.weight );

        System.out.println(box3.l + " " + box3.h + " " + box3.w + " " + box3.weight);


        BoxWeight box4 = new BoxWeight(2.2,4.5);
        System.out.println(box4.l + " " + box4.h + " " + box4.w + " " + box4.weight);


        BoxWeight box5 = new BoxWeight(3.2,3.2,24,4.3);

        System.out.println(box5.l + " " + box5.h + " " + box5.w + " " + box3.weight);






        Box box6 = new BoxWeight(2,5,7,7);

        System.out.println(box6.w);


       // there are many variable in both parent and child classes
        // you are given access to variable that are in the ref type i.e. Boxweight
        // hence, you should have acces to weght varible
        // this also mean that the ones you are trying to access should be initialised
        // but her ewhen the obj itself is of type parent class how will you call the constructer fo a child class
       //error

       // BoxWeight box7 = new Box(2,6,4);
      //  System.out.println(box7.l);
    }


}
