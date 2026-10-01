package lecture.section01.method;

public class Application7 {

    public static void main(String[] args) {
        int result = Application6.sum(5,6);
        System.out.println("result = " + result);

        Application6 app6 = new Application6();
        int result2 = app6.minus(5,6);
        System.out.println("result2 = " + result2);
    }
}
