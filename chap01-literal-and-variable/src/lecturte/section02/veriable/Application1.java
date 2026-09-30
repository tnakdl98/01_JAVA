package lecturte.section02.veriable;

public class Application1 {

    public static void main(String[] args) {


        /*
        * 1. 코드의 의도가 분명해진다.
        * 2. 한번 저장한 값을 재사용 할 수 있다.
        * */
        int salary = 5000000;
        int bonus = 200000;

        System.out.println("[리터럴]보너스를 포함한 급여 : " + (5000000 + 200000));
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus));
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus));
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus));
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus));
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus));
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus));
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus));

    }
}
