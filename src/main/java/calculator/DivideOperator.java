package calculator;

public class DivideOperator implements InterCalcul {

    @Override
    public double operate(int a, int b) {
        return a / (double)b;
    }
}
