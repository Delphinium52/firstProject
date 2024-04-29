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
    private char operate;
    private int firstNum;
    private int secondNum;
    private double result;
    private ArrayList<Double> list;

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
    //결과 리스트 출력
    public void showlist(){
        for(double d : list){
            System.out.println(d);
        }
    }
    // 연산 결과를 출력하는 메서드
    public void inquiryResult(){
        for(double d : list){
            System.out.println(d);
        }
    }
    // 원의 넓이 구하는 메서드
    public double calculateCircleArea(int firstNum) {
        double re = Math.PI* (firstNum * firstNum);
        list.add(re);
        return re;
    }
    // 사칙연산 메서드
    public double calculate() throws BadException {


        // 기호 입력에 따른 조건문
        switch (operate) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = (double)firstNum * secondNum;
                break;
            case  '/':
                //나눗셈 예외 사항 발생시 예외 throw하기
                if (firstNum == 0) {
                    throw new BadException();

                }else {
                    result = (double)firstNum / secondNum;
                }
                break;

        }
        list.add(result);
        return result;
    }
}
