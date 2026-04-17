package practice.ch10;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0; // 이전에 냈던 손의 값
    private int currentHandValue = 0; // 바로 직전에 냈던 손의 값
    private int[][] history = { //과거의 승패를 유지(기록)하는 테이블
        { 1, 1, 1, },
        { 1, 1, 1, },
        { 1, 1, 1, },
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() { // 전략의 핵심 메소드
        // current와 부합하는 행의 모든 열의 합을 구해서 그 범위 안에서 난수를 발생시킨다.
        int bet = random.nextInt(getSum(currentHandValue)); 
        int handvalue = 0; // 이번에 낼 손의 값을 저장
        // 난수로 얻은 bet값이 어디에 속하는지 확인(교안 11p 참고)
        if (bet < history[currentHandValue][0]) {
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handvalue = 1;
        } else {
            handvalue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    private int getSum(int handvalue) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handvalue][i]; // 행 번호는 고정, 열 번호가 0,1,2로 바뀜 => 그 행의 값을 모두 더함
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        // 이기면 냈던 손, 지면 냈던 손을 제외한 모든 손의 값을 증가
        if (win) { // 이겼으면
            history[prevHandValue][currentHandValue]++; // 주먹인경우로 예를 들어보자
        } else { // 졌으면 
            // 주먹으로 패배한 경우, 상대는 보자기를 냈을 것이다
            // 현재 상황에서 이기는 방법은 가위 => (1)
            // 현재 상황에서 상대의 패(보자기)를 보고 내가 가위를 낼 것이라고 예측한 상대가 주먹을 낸다고 했을 때 이기는 방법은 보자기 => (2)
            history[prevHandValue][(currentHandValue + 1) % 3]++; // (1)
            history[prevHandValue][(currentHandValue + 2) % 3]++; // (2)
            // 결국 냈던 손을 제외한 모든 손의 값을 증기시킨다
        }
    }
}
