package lecture.section01.method;

public class Application3 {

    /*
    * 매개변수 (parameter) & 전달인자 (argument)
    * */

    public static void main(String[] args) {

        Application3 app3 = new Application3();

        app3.userInfo("홍길동", 20 , '남');


    }
   public void userInfo(String name, int age, char gender){

        System.out.println("이름은 " + name );
        System.out.println("나이는 " + age);
        System.out.println("성별은 " + gender);

    }
//    public void printName(String name){
//
//        System.out.println("이름은 " + name + "입니다.");
//
//    }
//    // 나이를 입력받으면 나이를 출력해주는 메소드
//    public void printAge(int age){
//
//        System.out.println("나이는 " + age + "입니다.");
//
//    }
//    public void printGender(char gender){
//
//        System.out.println("성별은 " + gender + "입니다.");
//
//    }

}
