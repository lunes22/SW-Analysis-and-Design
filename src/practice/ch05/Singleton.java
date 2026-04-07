package practice.ch05;

// 싱글톤 패턴 적용하기(전체적인 흐름은 이를 따름)
public class Singleton {
    // (3) Singleton 객체를 미리 하나 만들어 줌(중요!!)
    // Singleton클래스가 로딩될 때 Singleton 객체가 하나 만들어짐
    // 자기 자신을 호출, 반드시 Static 이여야 한다!
    // 하나가 생성되어 클래스 내에서 관리
    private static Singleton singleton = new Singleton();


    // (1) 생성자를 private으로 함
    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    // (2) Singletone 객체를 얻어갈 수 있는 메소드를 정의함
    public static Singleton getInstance() {
        //static이 없으면 객체 생성없이는 호출 할 수없는 함수가 된다.
        // (클래스에 속해서 객체 안만들어도 호출 가능하다는 뜻)
        // 덕분에 getInstance를 통하여 객체를 생성할 수 있음
        return singleton;
        // 이미 클래스 내에서 만들어진 Singleton 객체를 반환하는 식으로 구현
        // 계속 같은 것을 반환하는 방식임
    }
}
