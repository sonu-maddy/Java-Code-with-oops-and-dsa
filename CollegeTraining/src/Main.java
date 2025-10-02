

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

   public static class Number{

        int value;

        Number(int value) {
            this.value = value;
        }
    }
    public static void swap(Number a, Number b){
            int temp = a.value;
            a.value  = b.value;
            b.value  = temp;
    }

    public static void main(String[] args) {
//        int a = 10, b = 20;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println("After Swap");
//        swap(a,b);
//        System.out.println(a);
//        System.out.println(b);

        Number num1 = new Number(10);
        Number num2 = new Number(20);

        System.out.println(num1.value + " " + num2.value);
        System.out.println(" after swap ");

        swap(num1, num2);

        System.out.println(num1.value + " " + num2.value);


    }
//    public static void swap(int i, int j){
//
//        int k = i;
//        i = j;
//        j = k;
//    }

}