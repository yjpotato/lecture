package chap98_homework.nc230406.clazz;
//사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class stream01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        // 사용자가 입력한 문자열을 리스트에 추가
        for (int i = 0; i < 10; i++) {
            System.out.print("문자열을 입력하세요: ");
            String input = scanner.nextLine();
            strings.add(input);
        }

        // 문자열의 길이가 5 이상인 문자열만 출력
        for (String str : strings) {
            if (str.length() >= 5) {
                System.out.println(str);
            }
        }


    }
}


