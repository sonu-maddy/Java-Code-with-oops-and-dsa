package sonu.com;

public class Singaleton {

    private int num = 0;

    private Singaleton(){
        // not access  in main class
    }

    private static Singaleton instance;

    public static Singaleton getInstance(){
        //check whether 1 obj only is created or not.

        if (instance == null){
            instance = new Singaleton();
        }

        return instance;
    }

}
