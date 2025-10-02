package sonu.com.recursion;

public class NumbersExample {
    public static void main(String[] args) {
        // a function that take in a number and print it
        // print first 5 number: 1 2 3 4 5
        print(1);
    }

    static void print(int i) {

        // base condition in recursion: condition where our
        // recursion will stop making new calls.
        // No Base Condition: fuc call will keep happening, Stack will be filled again and again.
        // every call of function will take some memory : memory of computer will exceed the limit - StackOverFlow Error.
        // recursion calling itself.
        // help in solving bigger / complex problem in a simple way.
        // you can convert recursion sol' into iteration & vice versa.

        if(i == 5){
            return;
        }
        System.out.println(i);

        // this tail recursion.
        print(i + 1);
    }
}
