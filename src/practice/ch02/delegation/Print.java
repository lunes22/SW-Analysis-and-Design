package practice.ch02.delegation;

// 클라이언트가 원하는, 필요로하는 인터페이스, Target interface <= 추상 클래스
// 어댑터를 만들 때, implements로 구현할 수 없음
public abstract class Print { 
    // inheritance에서는 interface로 되어있었음(여기서는 추상클래스)
    public abstract void printWeak();
    public abstract void printStrong();
}
