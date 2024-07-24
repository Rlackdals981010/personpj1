package calculator;

import java.util.ArrayList;


public class Calculator extends Exception{

    private ArrayList<Double> arr ;      //1. 결과 값 저장 컬렉션

    public Calculator(){                //Lv2. 6 생성자를 이용한 초기화 구현
        this.arr= new ArrayList<>();
    }

    public void setArr(double val) {
        this.arr.add(val);
    }

    public ArrayList<Double> getArr() {
        return arr;
    }

    public void arr_remove(){       //L2. 4 . 삭제 메소드 구현
        this.arr.remove(0);
    }

    public void inquiryResults(){   // L2. 5 . 조회 메소드 구현
        for(double val : getArr()){
            System.out.print(val+" ");
        }
        System.out.println();
    }



}
