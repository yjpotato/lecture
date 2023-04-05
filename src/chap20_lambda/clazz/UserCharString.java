package chap20_lambda.clazz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserCharString {
    private String str;

    public UserCharString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    // 문자열 내에서 찾을 문자가 있는지 확인하는 메소드
    public String changeStr(char ch, UserChar uc) {
        return uc.findUserChar(ch, str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10개의 문자열을 입력받아 리스트에 추가
        List<UserCharString> stringList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("문자열을 입력하세요 " + (i + 1) + ":");
            stringList.add(new UserCharString(sc.nextLine()));
        }

        // 찾을 문자 입력받기
        System.out.println("찾을 문자를 입력하세요:");
        char findCh = sc.nextLine().charAt(0);

        // 입력된 문자열 중에서 찾을 문자를 포함한 문자열이 있는 경우 해당 문자열을 출력
        // 없는 경우 빈 문자열을 출력
        UserChar findChar = (ch, str) -> {
            String result = "";
            for (UserCharString s : stringList) {
                if (s.getStr().contains(Character.toString(ch))) {
                    result += s.getStr() + " ";
                }
            }
            return result.isEmpty() ? "" : result;
        };

        String foundStrings = findChar.findUserChar(findCh, stringList.toString());
        if (foundStrings.isEmpty()) {
            System.out.println("입력된 문자열 중에서 찾을 문자를 포함한 문자열이 없습니다.");
        } else {
            System.out.println("입력된 문자열 중에서 찾을 문자를 포함한 문자열:");
            System.out.println(foundStrings);
        }

        sc.close();
    }
}


/*
UserChar 함수형 인터페이스
String findUserChar(char ch, String str);

UserCharString 클래스
String str;

생성자/getter/setter

changeStr(char ch, UserChar)

main
List<CustomString> => 10개의 스트링 입력
char findCh => 사용자 입력,
사용자가 입력한 ch가 없으면 "", 있으면 그 문자열 그대로
 */