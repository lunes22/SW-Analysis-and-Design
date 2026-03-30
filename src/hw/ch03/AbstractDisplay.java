package hw.ch03;

public abstract class AbstractDisplay {
    // L03S1_반복 횟수 저장 필드
    public int repeatCount;

    // L03S1_인자 받는 메소드 추가
    public AbstractDisplay(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    // abstract method
    public abstract void open();
    public abstract void print();
    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < repeatCount; i++) { // L03S1_ 필드 값 사용
            print();
        }
        close();
    }
}
