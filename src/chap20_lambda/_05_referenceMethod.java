package chap20_lambda;

import chap20_lambda.clazz.Convertor;
import chap20_lambda.clazz.MoneyConvertor;

public class _05_referenceMethod {
    public static void main(String[] args) {
        action(MoneyConvertor :: convert); //static메소드. 바로 호출 가능

        MoneyConvertor mcv = new MoneyConvertor(); //메소드가 static이 아니어서 객체를 만든것.

//        action((a,b)-> mcv.instanceConvert(a,b)); 아래와 같은 기능.
        action(mcv :: instanceConvert); //다른 클래스에 있는 메소드를 참조해서 쓰기 위한 방식. (객체.일반메소드)
        //conv를 구현해주는
    }
    public static void action(Convertor con){ //함수형 인터페이스를 사용하는 메소드
        int result = con.conv(10000000, '$');
        System.out.println("변환된 돈 : $" + result);
    }
}
