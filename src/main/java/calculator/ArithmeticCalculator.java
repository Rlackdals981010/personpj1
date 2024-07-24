package calculator;

import calculator.cal.*;
import calculator.cal.inter.InterCalcul;

public class ArithmeticCalculator extends Calculator {
    static InterCalcul add = new AddOperator();
    static InterCalcul sub = new SubtractOperator();
    static InterCalcul mul = new MultiplyOperator();
    static InterCalcul div = new DivideOperator();
    static InterCalcul mod = new ModOperator();


    public double calculate(int a, int b, char sign) throws MyException {
        double ret = 0;
        switch (sign) {
            case '+':
                ret = add.operate(a, b);
                break;
            case '-':
                ret = sub.operate(a,b);
                break;
            case '*':
                ret = mul.operate(a, b);
                break;
            case '/':
                if (b == 0) throw new MyException(b);
                else ret = div.operate(a, b);
                break;
            case '%':
                if (b == 0) throw new MyException(b);
                else ret = mod.operate(a, b);
                break;
            default:
                throw new MyException(sign);
        }
        super.setArr(ret);
        return ret;
    }


}
