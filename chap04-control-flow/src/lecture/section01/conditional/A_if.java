package lecture.section01.conditional;

import java.util.Scanner;

public class A_if {

    /*
    * if문 작성법
    *
    * if([조건식]){
    *   [조건식이 true일때 동작할 코드]
    * } else {
    *   [조건식이 false일때 동작할 코드]
    * }
    *
    * */
   public void testSimpleIf() {

       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

       if((num % 2) == 0){
           System.out.println("짝수입니다.");
       } else {
           // 참이 아닐경우 동작
           System.out.println("홀수입니다.");
       }

       System.out.println("프로그램을 종료합니다.");
    }

}
