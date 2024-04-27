package calcProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력 : ");
        //스캐너를 이용한 첫번째 정수 입력 받기
        int a = sc.nextInt();
        System.out.print("두 번째 숫자 입력 : ");
        //스캐너를 이용한 두번째 정수 입력 받기
        int b = sc.nextInt();
        System.out.print("사칙연산 기호를 입력하세요 : ");
        //사칙연산 할 기호 입력 받기
        String c = sc.next();
        // 입력 받은값 중 첫번째 값 char 타입으로 변수 저장
        char d = c.charAt(0);
        // 조건문을 통한 사칙연산 수행
        int result = switch (d) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
        // 조건문을 통해 나온값 출력
        System.out.println("결과 : " + result);
    }
}
