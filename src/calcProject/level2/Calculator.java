package calcProject.level2;

import java.util.ArrayList;

public class Calculator {
    // 필드
    ArithmeticCalculator operate;
    int firstNum;
    int secondNum;
    double result;
    //static 객체마다 가질필요 없는 공용으로 사용되는 것일때 사용
    //리스트는 사칙연산과 원 넓이 둘다 사용하기 때문에 static을 이용해 생성할 필요 없이 사용하게 함
    ArrayList<Double> list;
    ArrayList<Double> circle;

    //생성자
    public Calculator(int firstNum) {
        this.firstNum = firstNum;
        this.result = 0;
        this.circle = new ArrayList<>();
        this.list = new ArrayList<>();
    }
    public void setOperation(ArithmeticCalculator operate) {
        this.operate = operate;
        this.list = new ArrayList<>();
    }
    //getter
    public double getResult(){
        return this.result;
    }
    //setter
//    public void setitem(int num1){
//        this.firstNum = num1;
//    }
    // 연산결과 제일 앞의 데이터 삭제
    public void removeResult(){
           list.remove(0);
    }
    // 연산 결과를 출력하는 메서드
    public void inquiryResult(){
        for(double d : list){
            System.out.println(d);
        }
    }
    public void inquiryResult2(){
        for(double d : circle){
            System.out.println(d);
        }
    }
    //사칙연산


    public double calculate(char operate, int firstNum, int secondNum){
        double answer =0;
        switch(operate){
            case '+':
                setOperation(new AddOperator());
                answer = this.operate.operate(firstNum, secondNum);
                break;
            case '-':
                setOperation(new SubtractOperator());
                answer = this.operate.operate(firstNum, secondNum);
                break;
            case '*':
                setOperation(new MultiplyOperator());
                answer = this.operate.operate(firstNum, secondNum);
                break;
            case '/':
                setOperation(new DivideOperator());
                answer= this.operate.operate(firstNum, secondNum);
                break;
            case '%':
                setOperation(new ModOperator());
                answer = this.operate.operate(firstNum, secondNum);
        }
        list.add(answer);
        return answer;
    };

}
