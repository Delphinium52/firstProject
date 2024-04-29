package calcProject.level2;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(char operate, int firstNum, int secondNum) {
        super(operate, firstNum, secondNum);

    }

    // 사칙연산 메서드
    public void calculate() throws BadException {


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
        list.add(this.result);
    }



}
