package practice.ch03;

public abstract class AbstractDisplay {
    // open, print, close는 하위 클래스에 **구현**을 맡기는 추상 메소드 
    abstract protected void open();
    public abstract void print();
    public abstract void close();

    // display는 AbstractDisplay에서 구현하는 메소드 
    // 큰 틀(흐름, 구조)을 제공함 => 템플릿 메소드
    // 인터페이스로 선언할 때, display메소드는 abstract로 선언할 수 없기 때문에, 문제가 생길 수 있다.
    // 대신에 default 메소드로 선언하면, 인터페이스에서도 구현이 가능하다.

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
