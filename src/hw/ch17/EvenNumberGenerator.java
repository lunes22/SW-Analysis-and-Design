package hw.ch17;

public class EvenNumberGenerator extends NumberGenerator {
    private int number;	// 현재 수 
    private int end;		// 종룟값(이 값은 포함하지 않는다)

    public EvenNumberGenerator(int start, int end) {
        this.number = start; // 짝수
        this.end = end; // 종료값, 출력값에 포함되지 않게 한다.
    } 

    // 수를 취득한다 
    @Override
    public int getNumber() {
        return number;
    }

    // 수를 생성한다 
    @Override
    public void execute() {
        if(number % 2 != 0) {
            number++; // 시작값이 홀수인 경우 짝수로 변경
        }
        
        while (number < end) {
            notifyObservers();
            number += 2; // 짝수를 생성하기 위해 2를 더함
        }
    }
    
}
