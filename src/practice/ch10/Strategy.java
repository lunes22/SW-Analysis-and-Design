package practice.ch10;

public interface Strategy { // 모든 전략 클래스가 구현해야 하는 인터페이스
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
