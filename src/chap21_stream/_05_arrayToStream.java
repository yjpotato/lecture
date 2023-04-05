package chap21_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_arrayToStream {
    public static void main(String[] args) {
        int[] intArr = new int[10];

        for (int i = 0; i < 10; i++){
            intArr[i] = (int) (Math.random() * 10) + 1;
            System.out.println(intArr[i] );

        }                   //IntStream.of(intArr); 아래와 같은 방법.
        IntStream intStream = Arrays.stream(intArr);
        //Arrays.stream(int[]), IntStream.of(int[]) => IntStream<T> 참고.

        // 5 이상인 값들만 스트림으로 만들기
        IntStream filteredStream = intStream.filter(i -> i >= 5);//다른방법
        IntStream fiveStream = intStream.filter(a -> a >=5);

        // 각 원소를 4배한 새로운 스트림 만들기
        IntStream newStream = filteredStream.map(i -> i * 4);//다른방법

        IntStream fourStream = fiveStream.map(num -> {
            int result = 0;
            result = num * 4;
            return  result;
        });

        // IntStream<T> 타입으로 변환하기
        Stream<Integer> resultStream = newStream.mapToObj(Integer::valueOf);


        // 결과 출력
        resultStream.forEach(System.out::println);

        Arrays.stream(intArr)//체이닝 기법 출력
                .filter(num -> num >= 5)
                .map(num -> num * 4)
                .forEach(num -> System.out.println(num + ", "));



    }
}
