package chap98_homework.nc230406.clazz;
//HistoricPerson이란 클래스를 만들고 String name; String achievement; String country; 를 멤버변수로 만들고
//   getter/setter 메소드를 생성합니다.
//getPersonInfo(String achievement); 매개변수로 받아온 업적에 해당하는 역사적 인물의
// 정보를 리턴하는 기능을 만든다.

public class HistoricPerson {

    private String name;
    private String achievement;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "HistoricPerson{" +
                "name='" + name + '\'' +
                ", achievement='" + achievement + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPersonInfo() {
        return "Name: " + name + ", Achievement: " + achievement + ", Country: " + country;
    }
    //HistoricPerson에 getSameCountryPerson(String country)를 만들고
    // 2번에서 만든 List를 스트림으로 변환하고 사용자가 입력한 국가의 인물들만 모은 스트림으로 만들어서 출력하세요.
    public String getSameCountryPerson(String str){
        String result = "";
       if(str.equals(this.getCountry())){
           return this.getName();
       }
       return result;
    }
}

