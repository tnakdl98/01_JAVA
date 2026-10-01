package lecture.section02.math;

public class Application1 {


    /*
     * Math
     * - 수학에서 자주 사용하는 상수, 함수들을 미리 구현해놓은 클래스
     * */
    public static void main(String[] args) {

        System.out.println("-7의 절대값 : " + Math.abs(-7));

        System.out.println(Math.min(10,20));
        System.out.println(Math.max(10,20));

        System.out.println("원주율 : " + Math.PI);
        System.out.println("난수 : " + Math.random());

        int random = (int) (Math.random() * 10);
        System.out.println("random = " + random);
    }
}
