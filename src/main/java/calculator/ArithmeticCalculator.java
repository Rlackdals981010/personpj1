package calculator;

public class ArithmeticCalculator extends Calculator {
    static AddOperator add = new AddOperator();
    static SubtractOperator sub =new SubtractOperator();
    static MultiplyOperator mul = new MultiplyOperator();
    static DivideOperator div = new DivideOperator();


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
            default:
                throw new MyException(sign);
        }
        super.setArr(ret);
        return ret;
    }


}
