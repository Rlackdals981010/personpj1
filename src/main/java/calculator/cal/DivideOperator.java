package calculator.cal;

import calculator.cal.inter.InterCalcul;

public class DivideOperator implements InterCalcul {

    @Override
    public double operate(int a, int b) {
        return a / (double)b;
    }
}
