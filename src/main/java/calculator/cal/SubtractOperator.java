package calculator.cal;

import calculator.cal.inter.InterCalcul;

public class SubtractOperator implements InterCalcul {
    @Override
    public double operate(int a, int b) {
        return a-b;
    }
}