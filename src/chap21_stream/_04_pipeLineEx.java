package chap21_stream;

import chap21_stream.clazz.CreditCard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _04_pipeLineEx {
    static String card;

    public static void main(String[] args) {
        List<CreditCard> cardList = new ArrayList<CreditCard>();

        cardList.add(new CreditCard("카카오","라이언",1000));
        cardList.add(new CreditCard("삼성카드","탭탭카드",2000));
        cardList.add(new CreditCard("신한카드","드림카드",3000));
        cardList.add(new CreditCard("삼성카드","ID카드",5000));
        cardList.add(new CreditCard("현대카드","더블랙",10000));
        cardList.add(new CreditCard("아멕스","블랙카드",30000));
//  //1번방식.
//        Stream<CreditCard> cardStream = cardList.stream();
//        Stream<CreditCard> filterStream = cardStream.filter(c -> c.getLimitMoney() >= 5000);
//        filterStream.forEach(card -> System.out.println(card.getCompany() + " : " + card.getCardName()));

        //방법2.
        cardList.stream()//CreditCard 객체 여러개가 저장된 스트림
                .filter(card -> card.getLimitMoney() >= 5000)
                .forEach(c -> System.out.println(c.getCompany() + " : " + c.getCardName()));
                //Stream<CreditCar> = [{삼성, id, 5000},{현대, 더블랙, 10000}, {아멕스, 블랙, 30000}]




        // 한도가 5000 이상인 카드의 회사와 카드 이름 출력. 위와 동일.
//        cardList.stream()//stream으로 변환
//                .filter(card -> card.getLimitMoney() >= 5000)
//                .forEach(card -> System.out.println(card.getCompany() + ", " + card.getCardName()));
        //map() 새로운 스트림을 만들어서 리턴


        cardList.stream()
                .map(c -> {
                    c.setLimitMoney(c.getLimitMoney() + 3000);
                    return c;
                })
                .forEach(c -> System.out.println(c.toString()));

        List<Integer> intList = new ArrayList<Integer>();

        for (int i = 1; i <= 30; i++){
            intList.add(i);
        }
        int sum =
                intList.stream()
                .reduce((result, num) -> result + num).get();
        System.out.println(sum);

    }
}


