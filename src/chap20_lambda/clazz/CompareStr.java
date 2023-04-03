package chap20_lambda.clazz;
//compare() 메소드는 두 개의 인수를 받아들이며,
// 첫 번째 인수가 두 번째 인수보다 작으면 음수를,
// 두 번째 인수가 첫 번째 인수보다 작으면 양수를 반환합니다.
// 두 인수가 서로 같으면 0을 반환합니다.

//compareTwoStr() 메소드는 두 개의 문자열을 인자로 받아서, 이 두 문자열을 비교하여 같으면 true를, 다르면 false를 반환
@FunctionalInterface
public interface CompareStr {
    boolean compareTwoStr(String a, String b); // 문자열 두 개를 비교하는 메소드
}

