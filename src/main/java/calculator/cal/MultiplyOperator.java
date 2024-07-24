package calculator.cal;

import calculator.cal.inter.InterCalcul;

public class MultiplyOperator implements InterCalcul
{
    @Override
    public double operate(int a, int b) {
        return a * b;
    }
}
