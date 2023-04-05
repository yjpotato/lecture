package chap98_homework.nc230406;
//메인메소드에서 (이도, 한글, 조선), (이순신, 임진왜란, 조선), (담덕, 세력확장, 고구려)
//    (장영실, 측우기, 조선), (이성계, 조선건국, 조선), (을지문덕, 살수대첩, 고구려), (이승만, 초대대통령, 대한민국), (고주몽, 고려건국, 고려),
//   (김구, 독립운동, 대한민국), (제갈공명, 책략가, 촉) 데이터를 갖는 List<HistoricPerson>를 만들어서 스트림으로 변환 후 사용자가 입력한 업적
//    하나만 갖는 스트림을 생성하고 출력하세요.

import chap98_homework.nc230406.clazz.HistoricPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class _01_historicPerson {
    public static void main(String[] args) {
        // HistoricPerson 객체를 담을 리스트 생성
        List<HistoricPerson> historicPersons = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // HistoricPerson 객체 생성 후 리스트에 추가
        HistoricPerson person1 = new HistoricPerson();
        person1.setName("이도");
        person1.setAchievement("한글");
        person1.setCountry("조선");
        historicPersons.add(person1);

        HistoricPerson person2 = new HistoricPerson();
        person2.setName("이순신");
        person2.setAchievement("임진왜란");
        person2.setCountry("조선");
        historicPersons.add(person2);

        HistoricPerson person3 = new HistoricPerson();
        person3.setName("담덕");
        person3.setAchievement("세력확장");
        person3.setCountry("고구려");
        historicPersons.add(person3);

        HistoricPerson person4 = new HistoricPerson();
        person4.setName("장영실");
        person4.setAchievement("측우기");
        person4.setCountry("조선");
        historicPersons.add(person4);

        HistoricPerson person5 = new HistoricPerson();
        person5.setName("이성계");
        person5.setAchievement("조선건국");
        person5.setCountry("조선");
        historicPersons.add(person5);

        HistoricPerson person6 = new HistoricPerson();
        person6.setName("을지문덕");
        person6.setAchievement("살수대첩");
        person6.setCountry("고구려");
        historicPersons.add(person6);

        HistoricPerson person7 = new HistoricPerson();
        person7.setName("이승만");
        person7.setAchievement("초대대통령");
        person7.setCountry("대한민국");
        historicPersons.add(person7);

        HistoricPerson person8 = new HistoricPerson();
        person8.setName("고주몽");
        person8.setAchievement("고려건국");
        person8.setCountry("고려");
        historicPersons.add(person8);

        HistoricPerson person9 = new HistoricPerson();
        person9.setName("김구");
        person9.setAchievement("독립운동");
        person9.setCountry("대한민국");
        historicPersons.add(person9);

        HistoricPerson person10 = new HistoricPerson();
        person10.setName("제갈공명");
        person10.setAchievement("책략가");
        person10.setCountry("촉");
        historicPersons.add(person10);

        // 사용자로부터 검색할 업적 입력 받기
        System.out.println("검색할 업적을 입력하세요:");
        String inputAchievement = sc.nextLine();


        System.out.println("HistoricPerson");
        // 업적에 해당하는 HistoricPerson 객체 출력
        historicPersons.stream()
                .filter(person -> person.getAchievement().equals(inputAchievement))
                .forEach(person -> {
                    System.out.println("이름: " + person.getName());
                    System.out.println("업적: " + person.getAchievement());
                    System.out.println("나라: " + person.getCountry());
                });
        //만든 List를 스트림으로 변환하고 성이 '이'씨인 인물만 갖는 스트림을 만들고 출력하세요.

        // List<HistoricPerson>을 스트림으로 변환
        Stream<HistoricPerson> historicPersonStream = historicPersons.stream();
        System.out.println("이'씨인 인물과 나라만 출력");
        // 성이 '이'씨인 HistoricPerson 객체만 필터링하여 출력
        historicPersonStream.filter(person -> person.getName().startsWith("이"))
                .forEach(person -> {
                    System.out.println("이름: " + person.getName());
                    System.out.println("업적: " + person.getAchievement());
                    System.out.println("나라: " + person.getCountry());
                });
        // 사용자로부터 검색할 국가 입력 받기
        System.out.println("검색할 국가를 입력하세요:");
        String inputCountry = sc.nextLine();

        System.out.println("입력한 국가의 인물들 출력");
        //만든 List를 스트림으로 변환하고 사용자가 입력한 국가의 인물들만 모은 스트림으로 만들어서 출력하세요.
        Stream<HistoricPerson> historicPersonStream2 =  historicPersons.stream();
        historicPersons.stream()
                .filter(person -> person.getCountry().equals(inputCountry))
                .forEach(person -> {
                    System.out.println("나라: " + person.getCountry());
                    System.out.println("이름: " + person.getName());

                });

        //만든 List를 스트림으로 변환하고 성이 두자 이상인 인물의 정보를 스트림으로 만들어서 출력하세요.(을지문덕, 제갈공명)
        Stream<HistoricPerson> hpStream = historicPersons.stream()
                .filter(c -> {
                    if(c.getName().length() > 3)
                        return true;
                    else
                        return false;
                });
        hpStream.forEach(c -> System.out.println(c));





    }
}


