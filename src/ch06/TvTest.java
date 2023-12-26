package ch06;

class Tv{
    //tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    //tv의 기능(메서드)
    void power(){ power=!power;}
    void channelUp() {++channel;}

    void channelDown(){--channel;}
}
public class TvTest {
    public static void main(String[] args) {
        Tv t= new Tv();// tv 인스턴스를 생성한 후, 생성된 tv 인스턴스의 주소를 참조변수 t에 저장
        t.channel=7;
        t.channelDown();
        System.out.println("현재 채널은 "+ t.channel+" 입니다.");
    }
}
