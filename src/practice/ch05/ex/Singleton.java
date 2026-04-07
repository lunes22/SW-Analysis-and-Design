package practice.ch05.ex; //연습문제 3번

// 다른 방법의 싱글톤 패턴 적용하기
public class Singleton {
    private static Singleton singleton = null;


    // (1) 생성자를 private으로 함
    private Singleton() {
        System.out.println("Singleton 객체가 생성됩니다.");
        slowdown(); // 인스턴스 생성시 시간을 (약간) 지연 시킴
    }

    // (2) Singletone 객체를 얻어갈 수 있는 메소드를 정의함
    public static synchronized Singleton getInstance() { // 멀티스레드에서 싱글톤을 사용하는 방법: synchronized
        if (singleton == null) { // (메소드/클래스가) 처음 호출되는지를 검사
            singleton = new Singleton(); 
            // 위에서 객체를 생성하지 않았으므로 
            // getInstance를 처음 호출했을 때
            // 객체를 생성하도록 로직을 구현
        }
        // 객체를 생성한 뒤(위에처럼) 리턴
        // 다만, 또 getInstance()를 호출하는 경우(2번 이상)
        // 이미 Singleton객체를 생성했으므로
        // 만들어져있는 객체를 바로 리턴한다
        return singleton; 
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); // CPU를 내놓고 1초 쉼
        } catch (InterruptedException e) {
        }
    }
}
