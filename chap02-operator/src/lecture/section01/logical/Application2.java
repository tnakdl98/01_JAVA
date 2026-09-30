package lecture.section01.logical;

public class Application2 {

    public static void main(String[] args) {

        // && || 의 우선순위

        boolean result1 = true || false && false;
        boolean result2 = (true || false) && false;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        // 아래의 alpha 변수에 담긴 값이 알파벳인지 판별하는 코드를 작성하세요
        char alpha = '1';
        System.out.println("(int)alpha = " + (int)alpha);
        boolean answer = true;

        boolean isUpperCase = alpha >= 'A' && alpha <= 90;
        boolean isLowerCase = alpha >= 'a' && alpha <= 122;

        answer = isLowerCase || isUpperCase;

        System.out.println(answer);
    }
}
