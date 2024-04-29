package calcProject.level2;

import java.util.ArrayList;

//나눗셈 예외 사항 발생시 출력 클래스
class BadException extends Exception {
    public BadException() {
        super("분모가 0이거나 기호를 잘못 입력했습니다");
    }
}

public class Calculator {
    // 필드
    char operate;
    int firstNum;
    int secondNum;
    double result;
    //static 객체마다 가질필요 없는 공용으로 사용되는 것일때 사용
    //리스트는 사칙연산과 원 넓이 둘다 사용하기 때문에 static을 이용해 생성할 필요 없이 사용하게 함
    ArrayList<Double> list;

    //생성자
    public Calculator(char operate, int firstNum, int secondNum) {
        this.operate = operate;
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.result = 0;
        this.list = new ArrayList<>();
    }
    public Calculator(int firstNum) {
        this.firstNum = firstNum;
        this.result = 0;
        this.list = new ArrayList<>();
    }
    //getter
    public double getResult(){
        return this.result;
    }
    //setter
    public void setitem(char operate, int num1, int num2){
        this.operate = operate;
        this.firstNum = num1;
        this.secondNum = num2;
    }
    public void setitem(int num1){
        this.firstNum = num1;
    }
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

    public void calculate() throws BadException {

    }
}
