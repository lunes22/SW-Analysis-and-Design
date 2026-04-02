package practice.ch05;

// 싱글톤 패턴 적용하기
public class Singleton {
    // (3) Singletone 객체를 미리하나 만들어둠
    private static Singleton singleton = new Singleton();


    // (1) 생성자를 private으로 함
    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    // (2) Singletone 객체를
    public static Singleton getInstance() {
        return singleton;
    }
}
