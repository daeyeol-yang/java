package ch03;

public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';

        //char c2 = c1+1;// 에러
        char c2 = 'a'+1;//리터럴 간의 연산은 실행 과정 동안 변하는 값이 아니기 때문에 컴파일 시에 컴파일러가 계산해서 그 결과로 대체한다.

        System.out.println(c2);
    }
}
