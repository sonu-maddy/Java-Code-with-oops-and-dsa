package sonu.com.access;

public class SubClaas extends A{

    public SubClaas(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClaas obj = new SubClaas(34,"sonu Mmaddheshiya");
        int n = obj.num;
    }
}
