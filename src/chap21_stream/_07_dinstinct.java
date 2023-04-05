package chap21_stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class _07_dinstinct {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,5,4,4,3};

        IntStream intStream = Arrays.stream(intArr);

        intStream.distinct()//stream에서 중복된 요소를 다 제거해줌.
                .forEach(num -> System.out.println(num));
    }
}
