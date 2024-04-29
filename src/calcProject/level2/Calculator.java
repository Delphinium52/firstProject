package calcProject.level2;
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
    private double result = 0;
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
    //지우기
    public void removeResult(){

    };
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
        return result;
    }
}
