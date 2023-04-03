package chap20_lambda.clazz;
//클래스를 만들어서 실행하는 방법
public class UseOfCompareStr {
    public void judgeEquals(CompareStr cs){
        boolean result = cs.compareTwoStr("naver", "bit");

        if(result == true){
            System.out.println("두 문자열은 같습니다.");
        }else {
            System.out.println("두 문자열은 다릅니다.");
        }
    }
}
