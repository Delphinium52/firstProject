package calcProject.level2;
//나눗셈 예외 사항 발생시 출력 클래스
class BadException extends Exception {
    public BadException() {
        super("분모가 0이거나 기호를 잘못 입력했습니다");
    }
}

public class Calculator {
    // 필드
    String operate;
    int firstnum;
    int secondnum;
    // 사칙연산 메서드
    public double calculate(String operate, int firstnum, int secondnum) throws BadException {
        this.operate = operate;
        this.firstnum = firstnum;
        this.secondnum = secondnum;
        double result = 0;
        // 기호 입력에 따른 조건문
        switch (operate) {
            case "+":
                result = firstnum + secondnum;
                break;
            case "-":
                result = firstnum - secondnum;
                break;
            case "*":
                result = firstnum * secondnum;
                break;
            case  "/":
                //나눗셈 예외 사항 발생시 예외 throw하기
                if (firstnum == 0) {
                    throw new BadException();

                }else {
                    result = (double)firstnum / secondnum;
                }
                break;

        }
        return result;
    }
}
