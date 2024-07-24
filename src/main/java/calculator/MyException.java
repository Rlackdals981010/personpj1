package calculator;

public class MyException extends Exception{ //L2.1 예외처리

    public MyException(char sign){ //L2.1 예외처리
        super("기호 입력이 잘 못 되었습니다. 입력 기호:"+sign+")");
    }
    public MyException(int b){
        super(b+"으로 값을 나누는건 불가능합니다");
    }
}
