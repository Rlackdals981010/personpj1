package calculator.cal.imple;

import calculator.cal.InterCalcul;

public class DivideOperator implements InterCalcul {

    @Override
    public double operate(int a, int b) {
        return a / (double)b;
    }
}
