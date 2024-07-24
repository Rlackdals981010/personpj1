package calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class App {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력 객체 생성
    static String dis;             //4,7,8. 결
    // 정 객체 생성, 입력받음

    static void calculate_4(ArithmeticCalculator ac)throws Exception{

        System.out.print("첫번째 정수 입력하세요: ");
        int a = Integer.parseInt(br.readLine());    //1. 정수 1 입력
        System.out.print("두번째 정수 입력하세요: ");
        int b = Integer.parseInt(br.readLine());    //1. 정수 2 입력
        System.out.print("연산기호 입력하세요: ");
        char sign = br.readLine().charAt(0);        //2. 기호 입력

        double ret = 0; // 나눗셈 연산을 위해서 double 형으로 선언한다.
        try{
            ret = ac.calculate(a, b, sign);//L2.
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
        System.out.println(ret);
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)"); //7. remove 추가
        dis = br.readLine();

        if(dis.equals("remove")) {          //7. remove 입력시
            ac.arr_remove();       //L2.
        }

        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)"); //8. inquiry추가
        dis = br.readLine();
        if(dis.equals("inquiry")) {          //8. inquiry 입력시
            ac.inquiryResults();
        }

    }

    static void calculate_cir(CircleCalculator cc)throws Exception{
        System.out.print("원의 반지름을 입력하세요 :");
        int r = Integer.parseInt(br.readLine());
        double ret = cc.calculate(r);
        System.out.println(ret);

        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)"); //7. remove 추가
        dis = br.readLine();

        if(dis.equals("remove")) {          //7. remove 입력시
            cc.arr_remove();       //L2.
        }

        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)"); //8. inquiry추가
        dis = br.readLine();
        if(dis.equals("inquiry")) {          //8. inquiry 입력시
            cc.inquiryResults();
        }
    }

    public static void main(String[] args)throws Exception {
        ArithmeticCalculator ac =  new ArithmeticCalculator();
        CircleCalculator cc = new CircleCalculator();

        while(true){ //4. 무한 루프를 위한 true 조건
            System.out.print("사칙 연산을 원하시면 1 | 원 넓이 연산을 원하시면 2 : ");
            int flag = Integer.parseInt(br.readLine());

            if(flag == 1){
                calculate_4(ac); //사칙연산
            }
            else if(flag == 2){
                calculate_cir(cc); //원 넓이 연산
            }
            else{
                System.out.println("잘못된 입력입니다.");
                continue;
            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) ");//4. exit 기능추가
            dis = br.readLine();
            if(dis.equals("exit"))break;            //결정 객체에 exit 입력시 종료
        }
    }

}
