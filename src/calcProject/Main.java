package calcProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MAX_COUNT = 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1;; i++) {
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
            System.out.println("결과 : " + result);
            arr.add(result);
            System.out.println("가장 먼저 연산 결과를 삭제하시겠습니까?(remove 입력)");
            if(sc.next().equals("remove")) {
                arr.remove(0);
            }
            System.out.print("더계산하시겠습니까? (exit 입력시 종료)");
            String str = sc.next();
            if(str.equals("0")) {
                break;
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println((i+1)+"번째 : "+arr.get(i));
        }
    }
}


