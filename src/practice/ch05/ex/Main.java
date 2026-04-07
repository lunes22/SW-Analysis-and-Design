package practice.ch05.ex;//연습문제 3번
// 멀티 스레드 연습

// * thread 생성을 위해 반드시 스레드 클래스를 상속해야함!!
public class Main extends Thread { 
    public static void main(String[] args) { 
        // (2) 스레드 객체 생성
        Main t1 = new Main("Thread-A");
        Main t2 = new Main("Thread-B"); 
        // 생성 시간이 걸려서 원칙 상 두개가 생성되면 안되지만 두개가 생성되게 됨

        // (3) 스레드에 시작해라 지시
        t1.start(); // 스레드가 해야 할 일을 작성한 run() 메소드가 자동으로 실행됨
        t2.start();

    }

    // (1) 스레드가 해야 할 일을 작성
    @Override
    public void run() {
        // 싱글톤 객체 얻기
        Singleton s = Singleton.getInstance();
        System.out.println(getName() + ": " + s); 
        // 스레드 이름과 Singleton instance의 주소 값이 출력됨
    }

    public Main(String name){
        super(name); 
        // 부모인 Thread의 생성자를 호출하여 스레드 이름 설정
    }

}

/* 결과적으로 다음과 같이 run의 주소 값이 다르게 생성됨
>> Singleton 객체가 생성됩니다.
>> Singleton 객체가 생성됩니다.
>> Thread-A: practice.ch05.ex.Singleton@25f802fb
>> Thread-B: practice.ch05.ex.Singleton@6414a0ba
-> 이 방법으로 싱글톤이 될 것이라 생각했지만 안된다는 것을 확인했다.
*/

// 그렇다면 해결책은? : getInstance() 메소드를 Synchronized로 선언한다!
// 두 객체가 동작을 맞춘다. = 두 객체가 시간(상황)을 맞춘다