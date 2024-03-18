package ch11;

import java.util.Stack;

public class StackEx1 {
    public static Stack back = new Stack<>();
    public static Stack foward = new Stack<>();

    public static void main(String[] args) {
        goURL("1.네이트");
        goURL("2.야후");
        goURL("3.네이버");
        goURL("4.다음");

        printStatus();

        goBack();
        System.out.println("= '뒤로' 버튼을 누른 후=");
        printStatus();
        goBack();
        System.out.println("= '뒤로' 버튼을 누른 후=");
        printStatus();

        goForward();
        System.out.println("= '앞으로' 버튼을 누른 후=");
        printStatus();

        goForward();
        System.out.println("= '앞으로' 버튼을 누른 후=");
        printStatus();


    }

    public static void printStatus(){
        System.out.println("back: "+back);
        System.out.println("foward: "+foward);
        System.out.println("현재화면은 '"+back.peek()+"' 입니다.");
    }

    public static void goURL(String url){
        back.push(url);
        if(!foward.empty()){
            foward.clear();
        }

    }

    public static void goForward(){
        if(!foward.empty()){
            back.push(foward.pop());
        }


    }

    public static void goBack(){
        if(!back.empty()){
            foward.push(back.pop());
        }
    }


}
