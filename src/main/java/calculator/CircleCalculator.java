package calculator;

public class CircleCalculator extends Calculator {

    private static final double PI = 3.14; //Lv2. 7-> PI는 3.14 고정이라 final 변수로 사용한다.

    public double calculate(double r){ //원 넓이 계산 및 조회
        double ret = Math.pow(r,2)*PI;
        super.setArr(ret);
        return ret;
    }
}
