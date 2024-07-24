package calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {

    public static void main(String[] args)throws Exception,MyException {
        Calculator L2c =  new Calculator();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력 객체 생성
        String dis;             //4,7,8. 결정 객체 생성, 입력받음

//        double[] arr = new double[10];  //5. 저장공간이 10인 배열
//        int count =0;                   //5. 저장 위치 idx
        ArrayList<Double> arr = new ArrayList<>(); // 7. limit 삭제, 동적 입력을 위한 ArrayList

        while(true){ //4. exit전 무한 루프를 위한 true조건
            System.out.print("첫번째 정수 입력하세요: ");
            int a = Integer.parseInt(br.readLine());    //1. 정수 1 입력
            System.out.print("두번째 정수 입력하세요: ");
            int b = Integer.parseInt(br.readLine());    //1. 정수 2 입력
            System.out.print("연산기호 입력하세요: ");
            char sign = br.readLine().charAt(0);        //2. 기호 입력

//          double ret = 0; // 나눗셈 연산을 위해서 double 형으로 선언한다.
            double ret = L2c.calculate(a, b, sign); //L2.

//            switch (sign){
//                case '+':
//                    ret = a+b;
//                    break;
//                case '-':
//                    ret=a-b;
//                    break;
//                case '*':
//                    ret=a*b;
//                    break;
//                case '/':
//                    if(b==0) System.out.println("나눗셈 연산에서 분모(두번째 정수)는 0이 될 수 없다."); //3. 연산 오류 출력
//                    else ret=a/(double)b;
//                    break;
//                default:
//                    System.out.println("해당 문자열은 사칙연산 기호가 아닙니다.");
//                    //마지막 break는 생략 가능
//            }
//            System.out.println("결과: "+ret);
//
////            if(count>=arr.length) {           //6. 연산결과가 10개를 초과한 경우
////                for(int i=1;i<arr.length;i++)
////                    arr[i-1]=arr[i];          //6. 덮어쓴다.
////                arr[arr.length-1]=ret;        //6. 가장 끝에 저장.
////            }
////            else
////                arr[count++]=ret;
//
//            arr.add(ret);   //collection에 맞는 저장 메소드 사용

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)"); //7. remove 추가
            dis = br.readLine();
            if(dis.equals("remove")) {          //7. remove 입력시
                arr.remove(0);           //7. 가장 오래된. 즉 idx=0 삭제
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)"); //8. inquiry추가
            dis = br.readLine();
            if(dis.equals("inquiry")) {          //8. inquiry 입력시
                for(double val : arr){
                    System.out.print(val+" ");  //8. 내용 출력
                }
                System.out.println();
            }

//          System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) (현 저장개수 "+count+"개)");
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) (현 저장개수 "+arr.size()+"개)");//4. exit 기능추가
            dis = br.readLine();
            if(dis.equals("exit"))break;            //결정 객체에 exit 입력시 종료
        }
    }
}
