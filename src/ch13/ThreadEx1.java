package ch13;

public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();// Thread의 서브 클래스의 object 생성

        Runnable r = new ThreadEx1_2(); // Runnable을 구현한 클래스의 instance 생성
        Thread t2 = new Thread(r); // 생성자 Thread
        //Thread t2 =new Thread(new ThreadEx1_2());

        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread{
    public void run(){
        for (int i = 0; i <5; i++) {
            System.out.println(getName());
        }
    }
}

class ThreadEx1_2 implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            //Thread.currentThread() - 현재 실행중인 Thread 반환
            System.out.println(Thread.currentThread().getName());
        }
    }
}
