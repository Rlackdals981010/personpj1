package calculator;

public class ArithmeticCalculator extends Calculator{

    public double calculate (int a,int b, char sign) throws MyException{
        double ret =0;
        switch (sign) {
            case '+':
                ret = a + b;
                break;
            case '-':
                ret = a - b;
                break;
            case '*':
                ret = a * b;
                break;
            case '/':
                if(b==0) throw new MyException(b);
                else ret = a / (double)b;
                break;
            default:
                throw new MyException(sign);
        }
        super.getArr().add(ret);
        return ret;
    }

}
