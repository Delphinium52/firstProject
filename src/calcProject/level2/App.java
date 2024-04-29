package calcProject.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 객체 불러오기
        Calculator calc = new Calculator();
        List<Double> resultArr = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        //무한 반복 시작
        for(;;){
            System.out.print("첫번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 : ");
            char operator = sc.next().charAt(0);
            calc.setitem(operator, num1, num2);
            // 입력받은 값으로 계산후 출력
            System.out.println(calc.calculate());
            resultArr.add(calc.calculate());
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");
            String answer = sc.next();
            //종료 문자 입력이랑 같을 경우 종료
            if(answer.equals("exit")){
                break;
            }
        }
    }
}
