package practice.ch05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");

        // Singleton s1 = new Singleton(); // 컴파일 에러: Singletone() has private access in Singleton
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        if (s2 == s3) { // s2와 s3는 같은 객체를 참조하고 있는지 검사
            System.out.println("s2과 s3는 같은 Singleton 객체 입니다.");
        } else {
            System.out.println("s2과 s3는 다른 Singleton 객체 입니다.");
        }

        System.out.println("s2의 값: " + s2);
        System.out.println("s3의 값: " + s3);
    }
}
