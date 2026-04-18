package hw.ch10;

public class CyclicStrategy implements Strategy {
    private int currentHand = 0;

    @Override
    public Hand nextHand() {
        Hand hand = Hand.getHand(currentHand);
        currentHand = (currentHand + 1) % 3; // 0, 1, 2를 순환
        return hand;
    }
    
    @Override
    public void study(boolean win) {
        // CyclicStrategy는 승패에 관계없이 순환하므로 study 메서드는 아무 작업도 하지 않음
    }
}
