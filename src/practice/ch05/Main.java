package practice.ch05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");

        // Singleton s1 = new Singleton(); // 컴파일 에러: Singletone() has private access in Singleton\
        // 
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance(); // 객체 2번 생성? : 아직 singleton이 적용되지 않은 상태

        // Singleton 매커니즘을 직접 확인(getInstance()가 제대로 작동하는가?)
        if (s2 == s3) { // s2와 s3는 같은 객체를 참조하고 있는지 검사
            System.out.println("s2과 s3는 같은 Singleton 객체 입니다.");
        } else {
            System.out.println("s2과 s3는 다른 Singleton 객체 입니다.");
        }

        //실제 (주소) 값도 같은지 확인
        System.out.println("s2의 값: " + s2);
        System.out.println("s3의 값: " + s3);
    }
}
