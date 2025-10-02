package sonu.com.designPrinciple;

public class SingletonPrinciple {
    public static SingletonPrinciple instance;
    private SingletonPrinciple(){

    }

    public static SingletonPrinciple getInstance(){
        if (instance == null){
            instance  = new SingletonPrinciple();
        }
        return instance;
    }


}
