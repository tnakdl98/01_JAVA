package exercise.problem03;

import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 입력 : ");
        int n1 = sc.nextInt();

        System.out.print("두 번째 정수 입력 : ");
        int n2 = sc.nextInt();

        Answer an = new Answer();
        System.out.println("덧셈 결과 : " + an.plus(n1, n2));
        System.out.println("뺄셈 결과 : " + an.minus(n1, n2));
        System.out.println("곱셈 결과 : " + an.multiply(n1, n2));
        System.out.println("나누기 결과 : " + an.devide(n1, n2));

    }

    public int plus(int x, int y){

        return x+y;
    }

    public int minus(int x, int y){

        return x-y;
    }

    public int multiply(int x, int y){

        return x*y;
    }
    public double devide(int x, int y){

        return (double)x+y;
    }
}
