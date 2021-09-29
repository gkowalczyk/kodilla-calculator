package com.kodilla;

class Test {

    public int getSum(int a, int b) {
        return a + b;
    }
        public int getSub(int a, int b){
            return  a-b;
    }
}

public class calculator {
    public static void main(String[] args) {
        Test test = new Test();
       int r1 = test.getSum(1,2);
       int r2 =  test.getSub(1,2);
        System.out.println("sum="+ r1);
        System.out.println("sub="+ r2);
    }
}
