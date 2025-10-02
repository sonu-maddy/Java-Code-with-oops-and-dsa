package sonu.com.designPrinciple;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SIngletonPrinciple2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonPrinciple ob1 = SingletonPrinciple.getInstance();
        SingletonPrinciple ob2 = SingletonPrinciple.getInstance();

        System.out.println(ob1 == ob2);



        // 3 way to break singleton pattern
        /*
        * 1. Reflection API to break singleton pattern
        *   solution: 1-> if obj is there ===> throw exception from inside constructor
        *
        * 2. use ENUM
        *
        *
        *
        *
        * */


        // here break the singleton principle........
        SingletonPrinciple s1 = SingletonPrinciple.getInstance();
        System.out.println(s1.hashCode());

        Constructor<SingletonPrinciple> constructor = SingletonPrinciple.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonPrinciple s2 = constructor.newInstance();
        System.out.println(s2.hashCode());
    }
}
