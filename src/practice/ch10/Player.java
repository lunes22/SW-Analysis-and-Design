package practice.ch10;

public class Player {
    private String name;
    private Strategy strategy; // 부모 타입 -> 모든 종류의 자식 전략 객체를 가리킬 수 있다. => 교체가 쉽다 = "다형성"
    private int wincount;
    private int losecount;
    private int gamecount;

    // 이름과 전략을 받아서 플레이어를 만든다 
    public Player(String name, Strategy strategy) { // 부모 타입
        this.name = name;
        this.strategy = strategy;
    }

    // 전략에 따라 다음 손을 결정한다
    public Hand nextHand() {
        return strategy.nextHand(); // 전략 객체(strategy)에게 위임함
    }

    // 승리
    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    // 패배
    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    // 무승부 
    public void even() {
        gamecount++;
    }

    @Override
    public String toString() { // 지금까지의 승부 결과 확인
        return "["
            + name + ":"
            + gamecount + " games, "
            + wincount + " win, "
            + losecount + " lose"
            + "]";
    } 
    // 자바의 모든 클래스는 최상위 부모인 Object로부터 toString()을 상속받으며, 
    // 출력이나 문자열 연산 시 JVM에 의해 자동으로 호출되도록 약속되어 있습니다.
}
