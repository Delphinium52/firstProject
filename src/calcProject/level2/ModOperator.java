package calcProject.level2;

public class ModOperator extends ArithmeticCalculator{
    public ModOperator(){

    }
    public double operate(int firstNum, int SecondNum) throws ArithmeticException{
        if(firstNum == 0){
            throw new ArithmeticException();
        }

        return (double)firstNum%SecondNum;
    }
}
