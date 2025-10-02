package sonu.com.InPOEnAB;

// inheritance box example
public class Box {
    double l;
    double h;
    double w;

    // double weight;


    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(double side){

        // super(); Object class

        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){

        this.l = old.l;
        this.w = old.w;
        this.h = old.h;

    }

    public  void  information(){
        System.out.println("Running the box");
    }


}
