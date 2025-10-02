package sonu.com;

class Conditional {
    public static void main(String[] args) {
        int salary=24400;
//        if(salary<10000){
//            salary=salary+2000;
//        }
//        else {
//            salary=salary+1000;
//        }
//        System.out.println(salary);

        //multiple if else

        if (salary>10000){
            salary+=2000;
        } else if (salary>20000) {
            salary+=3000;
        }
        else {
            salary+=1000;
        }

    }
}