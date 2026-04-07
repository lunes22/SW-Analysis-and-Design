package practice.ch05.ex;

// 다른 방법의 싱글톤 패턴 적용하기
public class Singleton {
    private static Singleton singleton = new Singleton();


    // (1) 생성자를 private으로 함
    private Singleton() {
        System.out.println("Singleton 객체가 생성됩니다.");
        slowdown();
    }

    // (2) Singletone 객체를 얻어갈 수 있는 메소드를 정의함
    public static Singleton getInstance() { 
        if (singleton == null) {
            singleton = new Singleton(); 
            // 만일 객체가 없다면 생성을 하고 
        }
        // 위의 경우 이후에는 
        return singleton; 
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); // CPU를 내놓고 1초 쉼
        } catch (InterruptedException e) {
        }
    }
}
