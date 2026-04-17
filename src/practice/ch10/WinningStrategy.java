package practice.ch10;

import java.util.Random; // 난수를 발생시키는데에 필요한 클래스

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false; // 직전 승부 결과 저장
    private Hand prevHand; // 현재 손(가위, 바위, 보)

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) { // 이전에 졌다면
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand; // 플레이어는 이 손을 얻어서 다음판을 진행
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
