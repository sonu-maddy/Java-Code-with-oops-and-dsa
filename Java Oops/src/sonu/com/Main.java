package sonu.com;

// singaleton example
public class Main {

    public static void main(String[] args) {

        //    Singaleton obj =  new Singaleton(); here not acces from the Singaleton class
        // becouse singaleton method are private
        //    obj.num;

        Singaleton obj2 = Singaleton.getInstance();

        Singaleton obj3 = Singaleton.getInstance();

        Singaleton obj4 = Singaleton.getInstance();

    }

}
