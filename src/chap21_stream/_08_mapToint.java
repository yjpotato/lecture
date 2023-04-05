package chap21_stream;

import chap21_stream.clazz.CreditCard;// 다른 패키지의 CreditCard 클래스 import


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _08_mapToint {
    public static void main(String[] args) {
        List<CreditCard> cardList = new ArrayList<CreditCard>();

        for (int i = 1; i <= 10; i++){// 10개의 CreditCard 객체 생성 및 리스트에 추가
            cardList.add(new CreditCard("회사" + i, "카드명" + i, 100 * i));
        }
        Stream<CreditCard> cardStream = cardList.stream();

        IntStream limitStream = cardStream.mapToInt(card -> card.getLimitMoney());

//        limitStream.forEach(money -> System.out.println(money));
        System.out.println(limitStream.average().getAsDouble());
    }
}
