package calculator;

import java.util.ArrayList;

public class Calculator extends Exception{

    ArrayList<Double> arr = new ArrayList<>();      //1. 결과 값 저장 컬렉션

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

        this.arr.add(ret);
        return ret;
    }
}
