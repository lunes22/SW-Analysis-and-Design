package practice.ch05.ex;
// 멀티 스레드 연습

public class Main extends Thread {
    public static void main(String[] args) { 
        // 스레드 객체 생성
        Main t1 = new Main();
        Main t2 = new Main();

        // 스레드에 시작해라 지시
        t1.start(); // 스레드가 해야 할 일을 작성한 run() 메소드가 자동으로 실행됨
        t2.start();

    }

    // 스레드가 해야 할 일을 작성
    @Override
    public void run() {
        // 싱글톤 객체 얻기
        Singleton s = Singleton.getInstance();
        // System.out.println("싱글톤 객체의 값: " + s);
    }

}
