package chap20_lambda;

import chap20_lambda.clazz.CompareStr;
import chap20_lambda.clazz.UseOfCompareStr;

//Comparator 인터페이스는 두 개의 객체를 비교하는 데 사용.compare() 메소드를 구현해야 한다.
public class _07_compareStr {
    public static void main(String[] args) {
        UseOfCompareStr uocs = new UseOfCompareStr();
        //uocs.judgeEquals((a, b) -> a.equals(b)); 아래와 동일
        uocs.judgeEquals(String :: equals); //인터페이스에 만들어 놓은 메소드를 구현한 것.
        //매개변수 타입에 있는 메소드들을 사용할 수 있는 방식


    }
}
//// CompareStr 인터페이스를 람다식으로 구현
//        CompareStr comparator = (a, b) -> a.equals(b); //a와 b 두 개의 문자열을 비교하여 같으면 true를, 다르면 false를 반환하는 기능
//
//        // 문자열 두 개를 정의합니다.
//        String str1 = "Hello";
//        String str2 = "World";
//
//        // comparator.compareTwoStr 메소드를 호출하여 문자열을 비교
//        boolean result = comparator.compareTwoStr(str1, str2); //compareTwoStr 메소드의 매개변수인 a와 b로 전달됩니다.
//
//        // 결과값에 따라서 출력합니다.
//        if (result) {
//            System.out.println("두 문자열은 같습니다.");
//        } else {
//            System.out.println("두 문자열은 다릅니다.");
//        }