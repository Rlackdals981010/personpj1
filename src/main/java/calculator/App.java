package calculator;

import com.sun.source.tree.BreakTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {

    public static void main(String[] args)throws Exception,MyException {
        Calculator L2c =  new Calculator();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력 객체 생성
        String dis;             //4,7,8. 결정 객체 생성, 입력받음

        ArrayList<Double> arr = new ArrayList<>(); // 7. limit 삭제, 동적 입력을 위한 ArrayList

        while(true){ //4. exit전 무한 루프를 위한 true조건
            System.out.print("첫번째 정수 입력하세요: ");
            int a = Integer.parseInt(br.readLine());    //1. 정수 1 입력
            System.out.print("두번째 정수 입력하세요: ");
            int b = Integer.parseInt(br.readLine());    //1. 정수 2 입력
            System.out.print("연산기호 입력하세요: ");
            char sign = br.readLine().charAt(0);        //2. 기호 입력

          double ret = 0; // 나눗셈 연산을 위해서 double 형으로 선언한다.
            try{
                ret = L2c.calculate(a, b, sign);//L2.
            } catch (MyException e){
                System.out.println(e.getMessage());
            }
            System.out.println(ret);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)"); //7. remove 추가
            dis = br.readLine();

            if(dis.equals("remove")) {          //7. remove 입력시
                L2c.arr_remove();       //L2.
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)"); //8. inquiry추가
            dis = br.readLine();
            if(dis.equals("inquiry")) {          //8. inquiry 입력시
                L2c.inquiryResults();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) (현 저장개수 "+L2c.getArr().size()+"개)");//4. exit 기능추가
            dis = br.readLine();
            if(dis.equals("exit"))break;            //결정 객체에 exit 입력시 종료
        }
    }
}
