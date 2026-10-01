package lecture.section02.package_and_import;

import lecture.section01.method.Calculator;

public class Application2 {

    public static void main(String[] args) {
        int result = lecture.section01.method.Calculator.sum(10, 10);

        System.out.println("result = " + result);

        lecture.section01.method.Calculator calculator  = new lecture.section01.method.Calculator();
//        System.out.println(calculator);

        int result2 = Calculator.minus(10,5);
        System.out.println("result2 = " + result2);
    }
}
