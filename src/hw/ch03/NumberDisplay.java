package hw.ch03;

// L03S2 _ 새로운 Display 구현체 추가

public class NumberDisplay extends AbstractDisplay {
    private int n; // 표시해야 하는 문자 

    // 생성자     
    public NumberDisplay(int n) {
        super(5); // L03S1_반복 횟수 명시하지 않음
        this.n = n;
    }

    // 생성자     
    public NumberDisplay(int n, int repeatCount) {
        super(repeatCount); // L03S1_반복 횟수 명시
        this.n = n;
    }

    @Override
    public void open() {
        // 시작 문자열 "<<"를 표시한다
        System.out.println("<<Number>>");
    }

    @Override
    public void print() {
        // 필드에 기억해 둔 문자를 1회 표시한다 
        System.out.println(n);
    }

    @Override
    public void close() {
        // 종료 문자열 ">>"를 표시한다 
        System.out.println("<<Number>>");
    }
}
