package practice.ch05.ex;

// 다른 방법의 싱글톤 패턴 적용하기
public class Singleton {
    private static Singleton singleton = null;


    // (1) 생성자를 private으로 함
    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
        slowdown();
    }

    // (2) Singletone 객체를
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); // CPU를 내놓고 1초 쉼
        } catch (InterruptedException e) {
        }
    }
}
