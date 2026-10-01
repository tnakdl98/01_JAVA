package lecture.section01.method;

public class Application5 {

    public static void main(String[] args) {

        Application5 app5 = new Application5();

        int result = app5.plus(5,7);
        int result1 = app5.math(7,10);
        int result2 = app5.math1(45,3);
        System.out.println("result = " + result);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

    public int plus(int x, int y){

        return x+y;
    }

    public int math(int a, int b){

        return a*b;
    }
    public int math1(int c, int d){

        return c/d;
    }

}
