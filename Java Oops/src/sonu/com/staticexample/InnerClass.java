package sonu.com.staticexample;


//class Test{
//
//   static String name;
//
//    public Test(String name){
//        Test.name = name;
//    }
//}

// output vinit vinit


public class InnerClass {


   static class Test{

        String name;

        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("sonu");
        Test b = new Test("vinit");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//static class A{
//
//}