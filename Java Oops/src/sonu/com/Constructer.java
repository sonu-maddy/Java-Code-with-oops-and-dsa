package sonu.com;

public class Constructer {
    public static void main(String[] args) {


       // ConstructClass sonu = new ConstructClass(); // by default constructer

        ConstructClass sonu = new ConstructClass();
        ConstructClass rahul = new ConstructClass(30,"rahul",30.33f);

        //this keyword do the same thing using a constucter.
        //this keyword replace the same thing
//        sonu.rno =12;
//        sonu.name="sonu";
//        sonu.marks= 12.33f;

        sonu.greeting();

        sonu.changename("sonu maddheshiya");

        rahul.print(rahul.rno, rahul.name,rahul.marks);


        System.out.println(sonu.name);
        System.out.println(sonu.marks);
        System.out.println(sonu.rno);


       //ConstructClass random = new ConstructClass();
    }
}

class ConstructClass{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("hello my name is "+ name); //this.name
    }

    void  changename(String newname){
        this.name=newname;
    }

    void print(int rno,String name,float marks){
        System.out.println(name);
        System.out.println(marks);
        System.out.println(rno);
    }



    // we need a wAY TO ADD THE Value of the above
    // properties obj by object

    // we need one word to access every obj.

    ConstructClass(){
//        sonu.rno =12;
//        sonu.name="sonu"; // error
//        sonu.marks= 12.33f;


        this.rno =12;
        this.name="sonu";
        this.marks= 12.33f;
    }


//    ConstructClass(){
//        // this is how you call a constructer from another constructer.
//        this (13,"random name",12.34f);
//    }


    // student arpit = new arpit(14,"sarpit", 84.5);
    // here, this will be replace with arpit.
    ConstructClass(int rno, String name,float marks){
        this.rno =rno;  // rno=rno wrong becouse allready defind in class
        this.name=name;
        this.marks= marks;
    }




}
