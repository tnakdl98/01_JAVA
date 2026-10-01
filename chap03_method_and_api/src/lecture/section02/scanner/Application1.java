package lecture.section02.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.println("이름은 " + name + "입니다.");


        int age = sc.nextInt();
        System.out.println("나이는 " + age + "입니다.");

    }
}
