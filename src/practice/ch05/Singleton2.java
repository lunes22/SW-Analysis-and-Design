package practice.ch05;

// 싱글톤 패턴 적용하기
public enum Singleton2 { 
    // enum class인 singleton2가 객체를 얻는 방법은
    // 아래있는 상수인 INSTANCE를 호출하는 방법밖에 없다.
    // 상수
    INSTANCE; // 클래스 로드시 Singleton2 객체를 하나 만들어 둠

    // 메소드
    public void Hello() {
        System.out.println("싱글톤 객체의 hello 메소드가 호출되었습니다.");
    }
}

