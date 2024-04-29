package calcProject.level2;

public class CircleCalculator extends Calculator {

    public CircleCalculator(int firstNum) {
        super(firstNum);
    }


    // 원의 넓이 구하는 메서드
    public void calculate() throws BadException{
        double re = Math.PI* (firstNum * firstNum);
        this.list.add(re);
    }
}
