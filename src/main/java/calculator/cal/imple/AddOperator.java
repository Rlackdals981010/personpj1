package calculator.cal.imple;

import calculator.cal.InterCalcul;

public class AddOperator implements InterCalcul {

    @Override
    public double operate(int a, int b) {
        return a + b;
    }

}
