package ch08;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음.");
            throw e;
            //throw new Exception("고의로 발생시켰음."); -> 앞 두 문장을 한문장으로 만들 수 있다.

        }catch (Exception e){
            System.out.println("에러 메시지"+ e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료");
    }
}
