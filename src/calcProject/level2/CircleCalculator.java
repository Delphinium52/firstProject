package calcProject.level2;

public class CircleCalculator extends Calculator {

    public CircleCalculator(int firstNum) {
        super(firstNum);
    }


    // 원의 넓이 구하는 메서드

    public double calculate() {
        double re = Math.PI* (firstNum * firstNum);
        this.circle.add(re);
        return re;
    }
}
