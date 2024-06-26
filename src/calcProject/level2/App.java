package calcProject.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 객체 불러오기
        CircleCalculator calc = new CircleCalculator(2);
        Scanner sc = new Scanner(System.in);
        //무한 반복 시작
        for(;;){
            System.out.println("사칙연산 1 원의 넓이 2");
            switch(sc.nextInt()){
                case 1:
                    System.out.print("첫번째 숫자를 입력하세요 : ");
                    int num1 = sc.nextInt();
                    System.out.print("두번째 숫자를 입력하세요 : ");
                    int num2 = sc.nextInt();
                    System.out.print("사칙연산 기호를 입력하세요 : ");
                    char operator = sc.next().charAt(0);

                    // 입력값 계산
                    calc.calculate(operator, num1, num2);
                    //첫 배열 삭제 처리
                    System.out.println("첫 데이터 삭제 (remove)");
                    if(sc.next().equals("remove")){
                        calc.removeResult();
                    }
                    //저장된 값 출력
                    System.out.println("저장된 값을 보시겠습니까?(inquiry 입력)");
                    if(sc.next().equals("inquiry")){
                        calc.inquiryResult();
                    }
                    break;

                case 2:
                    //원 넓이 구하기
                    System.out.print("반지름을 입력해주세요 : ");
                    int num = sc.nextInt();
//                    calc.setitem(num);
                    //넓이 계산
                    calc.calculate();
                    System.out.println("저장된 값");
                    //배열 저장값 출력
                    calc.inquiryResult2();
                    break;

            }

            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");
            String answer = sc.next();
            //종료 문자 입력이랑 같을 경우 종료
            if(answer.equals("exit")){
                break;
            }
        }

    }
}
