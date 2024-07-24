package calculator;

import java.util.ArrayList;

public class Calculator extends Exception{

    private static final double PI = 3.14; //Lv2. 7-> PI는 3.14 고정이라 final 변수로 사용한다.

    private ArrayList<Double> arr ;      //1. 결과 값 저장 컬렉션
    private ArrayList<Double> cir_arr;   //LV2.7 원 넓이 저장용 컬렉션

    public Calculator(){                //Lv2. 6 생성자를 이용한 초기화 구현
        this.arr= new ArrayList<>();
        this.cir_arr= new ArrayList<>();
    }

    public void setArr(ArrayList<Double> arr) {
        this.arr = arr;
    }

    public ArrayList<Double> getArr() {
        return arr;
    }

    public ArrayList<Double> getCir_arr() {
        return cir_arr;
    }

    public void setCir_arr(ArrayList<Double> cir_arr) {
        this.cir_arr = cir_arr;
    }

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

    public void arr_remove(){       //L2. 4 . 삭제 메소드 구현
        this.arr.remove(0);
    }

    public void inquiryResults(){   // L2. 5 . 조회 메소드 구현
        for(double val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    public double calculate_cir(double r){ //원 넓이 계산 및 조회
        double ret = Math.pow(r,2)*PI;
        cir_arr.add(ret);
        return ret;
    }

    public void cir_remove(){       //원 데이터 삭제
        this.cir_arr.remove(0);
    }

    public void inquiry_cir_Results(){   // 원 넓이 전체 조회
        for(double val : cir_arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

}
