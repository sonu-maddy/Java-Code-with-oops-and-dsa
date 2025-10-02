package sonu.com.staticexample;

//human java
public class Main {
    public static void main(String[] args) {
        Human sonu = new Human(22,false,30000,"sonu maddheshiya");
        Human rahul = new Human(20,true,20000,"rahul maddheshiya");


//        System.out.println(sonu.population);
//        System.out.println(sonu.population);

        System.out.println(Human.population);
        System.out.println(Human.population);



        // this will be created automatically by main function becouse it is static
//        Main funn = new Main();
//        funn.fun2();

    }



    // this iss  nt dependent on object.
    static void fun(){

        // error
      //  greeting(); // you cant use this becous it requires an instance
        // but the function you are using it in ddoes not depend on instance

        // you cannot acces non static stuff without referencing their instances in
        // a static context


        //hence, here I am referencing it.
       Main obj = new Main();

       obj.greeting();

    }


    void fun2(){
        greeting();
    }

    // we know that something which is not static , belong to an object
    void greeting() {

        fun();

        System.out.println("hello world");
    }
}
