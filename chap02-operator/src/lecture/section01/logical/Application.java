package lecture.section01.logical;

public class Application {

    public static void main(String[] args) {

        /*
        * 논리 연산자
        * -> 논리값을 다루는 연산자 (true or false)
        *
        * 논리연산자 종류
        * && : 두 조건이 모두 true일때만 true 리턴 (and 연산)
        * || : 두 조건 중 하나라도 true이면 true (or 연산)
        * ! : 논리값을 반대로 변경
        * */

        System.out.println("true와 true의 논리 and 연산 : " + (true && true));
        System.out.println("true와 false의 논리 and 연산 : " + (true && false));

        System.out.println("true와 true의 논리 or 연산 : " + (true || true));
        System.out.println("true와 false의 논리 or 연산 : " + (true || false));

        System.out.println("=====================================================");
        //성인이면서 티켓이 있는가?
        int age = 20;
        boolean hasTicket = true;
        boolean result = (age >= 20) && hasTicket;
        System.out.println("성인이면서 티켓이 있는가? : " + result);

        System.out.println("=====================================================");
        // 평균 80점이상, 출석률이 90%이상이고 징계 이력이 없어야 장학금 대상이다.
        // 아래의 조건의 학생은 장학금 대상인가?
        int averageScore = 88;
        int attendanceRate = 95;
        boolean hasRecord = false;

        boolean result2 = averageScore >= 80
                && attendanceRate >= 90
                && !hasRecord;
        System.out.println("장학금 대상인가? : " + result2);
    }
}
