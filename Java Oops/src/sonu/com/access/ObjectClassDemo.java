package sonu.com.access;

public class ObjectClassDemo {

    int num;
    float num2;

    public ObjectClassDemo(int num,float num2) {
        this.num = num;
        this.num2 = num2;
    }


    @Override
    public int hashCode() {
        return super.hashCode();

      //  return num;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
       // return super.equals(obj);

        return  this.num == ((ObjectClassDemo)obj).num;
    }





    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    public static void main(String[] args) {
        ObjectClassDemo obj1 = new ObjectClassDemo(57,56.3f);
        ObjectClassDemo obj2 = new ObjectClassDemo(57,87.3f);

        if (obj1 == obj2){
            System.out.println("obj is equel to obj 2");
        }

        if (obj1.equals(obj2)){
            System.out.println("obj is equel to obj 2");
        }


       // System.out.println(obj1.hashCode());
    }
}
